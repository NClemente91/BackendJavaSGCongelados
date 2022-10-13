package com.ayi.rest.serv.app.services.impl;

import com.ayi.rest.serv.app.dtos.request.ProductDTO;
import com.ayi.rest.serv.app.dtos.response.CategoryResponseDTO;
import com.ayi.rest.serv.app.dtos.response.PagesResponseDTO;
import com.ayi.rest.serv.app.dtos.response.ProductResponseDTO;
import com.ayi.rest.serv.app.entities.Category;
import com.ayi.rest.serv.app.entities.Product;
import com.ayi.rest.serv.app.exceptions.customExceptions.BadRequestException;
import com.ayi.rest.serv.app.exceptions.customExceptions.NotFoundException;
import com.ayi.rest.serv.app.mappers.ICategoryMapper;
import com.ayi.rest.serv.app.mappers.IProductMapper;
import com.ayi.rest.serv.app.repositories.IProductRepository;
import com.ayi.rest.serv.app.services.ICategoryService;
import com.ayi.rest.serv.app.services.IProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

@AllArgsConstructor
@Service
@Transactional
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductRepository productRepository;

    @Autowired
    private IProductMapper productMapper;

    @Autowired
    private ICategoryService categoryService;

    @Autowired
    private ICategoryMapper categoryMapper;

    @Override
    public PagesResponseDTO<ProductResponseDTO> findAllProducts(Integer page, Integer size){

        if(page < 0 || size <= 0) {
            throw new BadRequestException("The page cannot be less than zero and the size less than one");
        }

        Pageable pageable = PageRequest.of(page, size);

        Page<Product> productPageList = productRepository.findAll(pageable);

        if (productPageList.isEmpty()){
            throw new NotFoundException("There are no records related to products");
        }

        PagesResponseDTO<ProductResponseDTO> productPageResponseDTO = new PagesResponseDTO<>();

        for(Product p:productPageList){
            productPageResponseDTO.getResults().add(productMapper.entityToResponseDto(p));
        }

        productPageResponseDTO.setTotalPages(productPageList.getTotalPages());
        productPageResponseDTO.setCurrentPage(productPageList.getNumber() + 1);
        productPageResponseDTO.setPageSize(productPageList.getSize());
        productPageResponseDTO.setTotalElements((int) productPageList.getTotalElements());

        return productPageResponseDTO;

    }

    @Override
    public ProductResponseDTO findProductById(Long id){

        if (id < 0){
            throw new BadRequestException("Id cannot be negative");
        }

        Optional<Product> optionalProduct = productRepository.findById(id);

        if (optionalProduct.isEmpty()){
            throw new NotFoundException("Record with id " + id + " does not exist");
        }

        return productMapper.entityToResponseDto(optionalProduct.get());

    }

    @Override
    public PagesResponseDTO<ProductResponseDTO> findProductsByCategory(Integer page, Integer size, String category){

        if(page < 0 || size <= 0) {
            throw new BadRequestException("The page cannot be less than zero and the size less than one");
        }

        Category categoryFilter = categoryMapper.responseDtoToEntity(categoryService.findCategoryByName(category));

        System.out.println(categoryFilter.getProductsList());

        Pageable pageable = PageRequest.of(page, size);

        Page<Product> productPageList = productRepository.findAllByCategory(categoryFilter, pageable);

        if (productPageList.isEmpty()){
            throw new NotFoundException("There are no records related to products by that category");
        }

        PagesResponseDTO<ProductResponseDTO> productPageResponseDTO = new PagesResponseDTO<>();

        for(Product p:productPageList){
            productPageResponseDTO.getResults().add(productMapper.entityToResponseDto(p));
        }

        productPageResponseDTO.setTotalPages(productPageList.getTotalPages());
        productPageResponseDTO.setCurrentPage(productPageList.getNumber() + 1);
        productPageResponseDTO.setPageSize(productPageList.getSize());
        productPageResponseDTO.setTotalElements((int) productPageList.getTotalElements());

        return productPageResponseDTO;

    }

    @Override
    public ProductResponseDTO createProduct(ProductDTO productDTO){

        Product createdProduct;

        CategoryResponseDTO categoryResponse = categoryService.findCategoryByName(productDTO.getCategoryName());
        Category categoryByName = categoryMapper.responseDtoToEntity(categoryResponse);

        if (categoryByName == null) {
            throw new BadRequestException("Cannot create an address without an associated customer");
        }

        Optional<Product> repeatedProduct = productRepository.findByName(productDTO.getName());

        if(repeatedProduct.isPresent()) {
            throw new BadRequestException("The product to add already exists");
        } else {
            Product productToCreate = productMapper.requestDtoToEntity(productDTO);
            productToCreate.setCategory(categoryByName);
            productToCreate.setCreatedAt(LocalDateTime.now());
            categoryByName.getProductsList().add(productToCreate);
            createdProduct = productRepository.save(productToCreate);
        }

        return productMapper.entityToResponseDto(createdProduct);

    }

    @Override
    public ProductResponseDTO updateStockProduct(Integer quantity, Long id){

        if(quantity <= 0){
            throw new BadRequestException("Quantity cannot be less than or equal to zero");
        }

        Optional<Product> optionalProduct = productRepository.findById(id);

        if(optionalProduct.isEmpty()){
            throw new NotFoundException("Producto to update not found");
        }

        Integer stock = optionalProduct.get().getStock();

        if((stock - quantity) < 0){
            throw new RuntimeException("Stock not available for that quantity");
        }

        optionalProduct.get().setStock(stock - quantity);
        optionalProduct.get().setUpdatedAt(LocalDateTime.now());

        Product productUpdated = productRepository.save(optionalProduct.get());

        return productMapper.entityToResponseDto(productUpdated);

    }

    @Override
    public void deleteProductById(Long id){

        Optional<Product> optionalProduct = productRepository.findById(id);

        if(optionalProduct.isEmpty()){
            throw new NotFoundException("Product to delete not found");
        }

        productRepository.delete(optionalProduct.get());

    }

}
