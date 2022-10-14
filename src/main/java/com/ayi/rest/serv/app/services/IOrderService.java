package com.ayi.rest.serv.app.services;

import com.ayi.rest.serv.app.dtos.request.OrderDTO;
import com.ayi.rest.serv.app.dtos.response.OrderResponseDTO;

public interface IOrderService {
    OrderResponseDTO createOrder(OrderDTO order);
}
