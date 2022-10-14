package com.ayi.rest.serv.app.mappers.impl;

import com.ayi.rest.serv.app.dtos.response.OrderDetailResponseDTO;
import com.ayi.rest.serv.app.dtos.response.OrderResponseDTO;
import com.ayi.rest.serv.app.dtos.response.UserResponseDTO;
import com.ayi.rest.serv.app.entities.Order;
import com.ayi.rest.serv.app.entities.OrderDetail;
import com.ayi.rest.serv.app.mappers.IOrderMapper;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class OrderMapperImpl implements IOrderMapper {

    private final ModelMapper modelMapper;

    @Override
    public OrderResponseDTO entityToResponseDto(Order entity) {

        List<OrderDetailResponseDTO> orderDetailResponseDTOS = new ArrayList<>();

        for (OrderDetail od:entity.getOrderDetailList()){
            orderDetailResponseDTOS.add(modelMapper.map(od,OrderDetailResponseDTO.class));
        }

        return OrderResponseDTO.builder()
                .orderId(entity.getOrderId())
                .user(modelMapper.map(entity.getUser(), UserResponseDTO.class))
                .totalPrice(entity.getTotalPrice())
                .orderDetail(orderDetailResponseDTOS)
                .created_at(entity.getCreatedAt())
                .build();

    }

}
