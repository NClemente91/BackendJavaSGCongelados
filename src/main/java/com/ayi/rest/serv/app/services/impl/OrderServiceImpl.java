package com.ayi.rest.serv.app.services.impl;

import com.ayi.rest.serv.app.dtos.request.OrderDTO;
import com.ayi.rest.serv.app.dtos.request.OrderDetailDTO;
import com.ayi.rest.serv.app.dtos.response.OrderResponseDTO;
import com.ayi.rest.serv.app.dtos.response.ProductResponseDTO;
import com.ayi.rest.serv.app.entities.*;
import com.ayi.rest.serv.app.exceptions.customExceptions.BadRequestException;
import com.ayi.rest.serv.app.exceptions.customExceptions.NotFoundException;
import com.ayi.rest.serv.app.mappers.IOrderMapper;
import com.ayi.rest.serv.app.mappers.IProductMapper;
import com.ayi.rest.serv.app.repositories.IOrderRepository;
import com.ayi.rest.serv.app.services.IOrderService;
import com.ayi.rest.serv.app.services.IProductService;
import com.ayi.rest.serv.app.services.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
@Transactional
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private IOrderRepository orderRepository;

    @Autowired
    private IOrderMapper orderMapper;

    @Autowired
    private IUserService userService;

    @Autowired
    private IProductService productService;

    @Autowired
    private IProductMapper productMapper;

    @Override
    public OrderResponseDTO createOrder(OrderDTO order){

        User userExist = userService.findUserByEmail(order.getUserEmail());

        if(userExist == null) {
            throw new NotFoundException("Email does not exist");
        }

        if(order.getCart().isEmpty()) {
            throw new BadRequestException("You must add at least one product to the cart");
        }

        Order orderToCreate = new Order();

        List<OrderDetail> orderDetailList = new ArrayList<>();

        Double totalPrice = (double) 0;

        for (OrderDetailDTO orderDetailDTO:order.getCart()) {

            ProductResponseDTO productResponseDTO = productService.findProductById(orderDetailDTO.getProductId());
            if(productResponseDTO == null){
                throw new NotFoundException("Product does not exist");
            }
            Product product = productMapper.responseDtoToEntity(productResponseDTO);

            if(orderDetailDTO.getQuantity() < 1) {
                throw new BadRequestException("Quantity must be greater than zero");
            }

            if(orderDetailDTO.getQuantity() > product.getStock()) {
                throw new NotFoundException("There is no stock for any of the products");
            }

            OrderDetail orderDetail = new OrderDetail();
            orderDetail.setQuantity(orderDetailDTO.getQuantity());
            orderDetail.setPrice(orderDetailDTO.getQuantity()*product.getUnitPrice());
            orderDetail.setOrder(orderToCreate);
            orderDetail.setProduct(product);
            orderDetail.setCreatedAt(LocalDateTime.now());

            totalPrice += orderDetail.getPrice();

            productService.updateStockProduct(orderDetailDTO.getQuantity(), product.getProductId());

            orderDetailList.add(orderDetail);

        }

        orderToCreate.setOrderDetailList(orderDetailList);
        orderToCreate.setCreatedAt(LocalDateTime.now());
        orderToCreate.setTotalPrice(totalPrice);
        orderToCreate.setUser(userExist);

        Order orderCreated = orderRepository.save(orderToCreate);

        return orderMapper.entityToResponseDto(orderCreated);

        //Creamos la lista de order detail vacía

            //Recorremos el array con un for
            //Buscamos el producto por id (el prod existe pero verificar igual)
            //Verificamos si qtity es menor que el stock
            //Creamos un order detail con el producto
            //Lo agregamos a la lista

        //Seteamos la lista de order details a la orden
        //Guardamos la orden

    }

}
