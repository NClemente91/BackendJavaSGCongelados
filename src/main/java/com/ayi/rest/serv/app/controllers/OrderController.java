package com.ayi.rest.serv.app.controllers;

import com.ayi.rest.serv.app.dtos.request.OrderDTO;
import com.ayi.rest.serv.app.dtos.response.DataResponseDTO;
import com.ayi.rest.serv.app.dtos.response.OrderResponseDTO;
import com.ayi.rest.serv.app.services.IOrderService;
import io.swagger.annotations.*;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.LocalDateTime;

@AllArgsConstructor
@Api(value = "Order Api", tags = {"Order Service"})
@RestController
@RequestMapping(value = "/order", produces = {MediaType.APPLICATION_JSON_VALUE})
public class OrderController {

    private IOrderService orderService;

    @PostMapping(value = "/add", produces = {MediaType.APPLICATION_JSON_VALUE})
    @ApiOperation(
            value = "Returns the created order",
            httpMethod = "POST",
            response = OrderResponseDTO.class
    )
    @ApiResponses(value = {
            @ApiResponse(
                    code = 201,
                    message = "Body content with information about a successfully created order",
                    response = OrderResponseDTO.class),
            @ApiResponse(
                    code = 400,
                    message = "Information about an error creating a new order")
    })
    public ResponseEntity<DataResponseDTO<OrderResponseDTO>> createNewOrder(
            @ApiParam(name = "order", required = true, value = "Order")
            @Valid @RequestBody OrderDTO order) {

        OrderResponseDTO orderCreated = orderService.createOrder(order);

        DataResponseDTO<OrderResponseDTO> result = new DataResponseDTO<>();
        result.setTimestamp(LocalDateTime.now());
        result.setData(orderCreated);
        result.setResponseCode(HttpStatus.CREATED.value());
        result.setStatus("SUCCESS");
        result.setMessage("CREATED");
        result.setPath("/order/add");

        return new ResponseEntity<>(result, HttpStatus.CREATED);

    }

}
