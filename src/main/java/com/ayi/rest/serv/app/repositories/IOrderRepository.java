package com.ayi.rest.serv.app.repositories;

import com.ayi.rest.serv.app.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepository extends JpaRepository<Order,Long> {
}
