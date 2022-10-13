package com.ayi.rest.serv.app.controllers;

import com.ayi.rest.serv.app.dtos.request.ProductDTO;
import com.ayi.rest.serv.app.dtos.response.*;
import com.ayi.rest.serv.app.dtos.response.ProductResponseDTO;
import com.ayi.rest.serv.app.services.IProductService;
import io.swagger.annotations.*;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;

@AllArgsConstructor
@Api(value = "Product Api", tags = {"Product Service"})
@RestController
@RequestMapping(value = "/product", produces = {MediaType.APPLICATION_JSON_VALUE})
public class ProductController {

    private IProductService productService;

    @GetMapping(value = "/all")
    @ApiOperation(
            value = "Returns a list with all products",
            httpMethod = "GET",
            response = ProductResponseDTO[].class
    )
    @ApiResponses(value = {
            @ApiResponse(
                    code = 200,
                    message = "Body content with information about an products list",
                    response = ProductResponseDTO[].class),
            @ApiResponse(
                    code = 404,
                    message = "Information about an products list not found")
    })
    public ResponseEntity<DataResponseDTO<PagesResponseDTO<ProductResponseDTO>>> findAllProducts(
            @ApiParam(value = "Page to display", required = true, example = "0")
            @RequestParam(value = "page", defaultValue = "0", required = false) Integer page,
            @ApiParam(value = "Number of elements per page", required = true, example = "10")
            @RequestParam(value = "size", defaultValue = "10", required = false) Integer size) {

        PagesResponseDTO<ProductResponseDTO> productsList = productService.findAllProducts(page, size);

        DataResponseDTO<PagesResponseDTO<ProductResponseDTO>> result = new DataResponseDTO<>();
        result.setTimestamp(LocalDateTime.now());
        result.setData(productsList);
        result.setResponseCode(HttpStatus.OK.value());
        result.setStatus("SUCCESS");
        result.setMessage("OK");
        result.setPath("/product/all");

        return new ResponseEntity<>(result, HttpStatus.OK);

    }

    @GetMapping(value = "/{id}")
    @ApiOperation(
            value = "Returns a product",
            httpMethod = "GET",
            response = ProductResponseDTO.class
    )
    @ApiResponses(value = {
            @ApiResponse(
                    code = 200,
                    message = "Body content with information about a product",
                    response = ProductResponseDTO.class),
            @ApiResponse(
                    code = 404,
                    message = "Information about a product not found")
    })
    public ResponseEntity<DataResponseDTO<ProductResponseDTO>> findOneProduct(
            @ApiParam(name = "id", required = true, value = "Id", example = "1")
            @PathVariable("id") Long id) {

        ProductResponseDTO product = productService.findProductById(id);

        DataResponseDTO<ProductResponseDTO> result = new DataResponseDTO<>();
        result.setTimestamp(LocalDateTime.now());
        result.setData(product);
        result.setResponseCode(HttpStatus.OK.value());
        result.setStatus("SUCCESS");
        result.setMessage("OK");
        result.setPath("/product/" + id);

        return new ResponseEntity<>(result, HttpStatus.OK);

    }

    @GetMapping(value = "/category/{category}")
    @ApiOperation(
            value = "Returns a list with all products by category",
            httpMethod = "GET",
            response = ProductResponseDTO[].class
    )
    @ApiResponses(value = {
            @ApiResponse(
                    code = 200,
                    message = "Body content with information about an products list by category",
                    response = ProductResponseDTO[].class),
            @ApiResponse(
                    code = 404,
                    message = "Information about an products list by category not found")
    })
    public ResponseEntity<DataResponseDTO<PagesResponseDTO<ProductResponseDTO>>> findProductsByCategory(
            @ApiParam(value = "Page to display", required = true, example = "0")
            @RequestParam(value = "page", defaultValue = "0", required = false) Integer page,
            @ApiParam(value = "Number of elements per page", required = true, example = "10")
            @RequestParam(value = "size", defaultValue = "10", required = false) Integer size,
            @ApiParam(name = "category", required = true, value = "category", example = "1")
            @PathVariable("category") String category) {

        PagesResponseDTO<ProductResponseDTO> productsList = productService.findProductsByCategory(page, size, category);

        DataResponseDTO<PagesResponseDTO<ProductResponseDTO>> result = new DataResponseDTO<>();
        result.setTimestamp(LocalDateTime.now());
        result.setData(productsList);
        result.setResponseCode(HttpStatus.OK.value());
        result.setStatus("SUCCESS");
        result.setMessage("OK");
        result.setPath("/product/"+ category);

        return new ResponseEntity<>(result, HttpStatus.OK);

    }

    @PostMapping(value = "/add", produces = {MediaType.APPLICATION_JSON_VALUE})
    @ApiOperation(
            value = "Returns the created product",
            httpMethod = "POST",
            response = ProductResponseDTO.class
    )
    @ApiResponses(value = {
            @ApiResponse(
                    code = 201,
                    message = "Body content with information about a successfully created product",
                    response = ProductResponseDTO.class),
            @ApiResponse(
                    code = 400,
                    message = "Information about an error creating a new product")
    })
    public ResponseEntity<DataResponseDTO<ProductResponseDTO>> createNewProduct(
            @ApiParam(name = "product", required = true, value = "Product")
            @Valid @RequestBody ProductDTO product) {

        ProductResponseDTO productCreated = productService.createProduct(product);

        DataResponseDTO<ProductResponseDTO> result = new DataResponseDTO<>();
        result.setTimestamp(LocalDateTime.now());
        result.setData(productCreated);
        result.setResponseCode(HttpStatus.CREATED.value());
        result.setStatus("SUCCESS");
        result.setMessage("CREATED");
        result.setPath("/product/add");

        return new ResponseEntity<>(result, HttpStatus.CREATED);

    }

    @DeleteMapping(value = "/delete/{id}")
    @ApiOperation(
            value = "Empty response when deleting the product",
            httpMethod = "DELETE"
    )
    @ApiResponses(value = {
            @ApiResponse(
                    code = 204,
                    message = "Body content about a successfully deleted product"),
            @ApiResponse(
                    code = 400,
                    message = "Information about an error deleting a existing product"),
            @ApiResponse(
                    code = 404,
                    message = "Information about a product to delete not found")
    })
    public ResponseEntity<DataResponseDTO<Void>> deleteOneProduct(
            @ApiParam(name = "id", required = true, value = "Id", example = "1")
            @PathVariable("id") Long id) {

        productService.deleteProductById(id);

        DataResponseDTO<Void> result = new DataResponseDTO<>();
        result.setTimestamp(LocalDateTime.now());
        result.setData(null);
        result.setResponseCode(HttpStatus.NO_CONTENT.value());
        result.setStatus("SUCCESS");
        result.setMessage("OK");
        result.setPath("/product/add");

        return new ResponseEntity<>(result, HttpStatus.OK);

    }

}
