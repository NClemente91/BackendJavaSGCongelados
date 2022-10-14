package com.ayi.rest.serv.app.mappers;

import com.ayi.rest.serv.app.dtos.response.OrderResponseDTO;
import com.ayi.rest.serv.app.entities.Order;

public interface IOrderMapper {
    OrderResponseDTO entityToResponseDto(Order entity);
}
