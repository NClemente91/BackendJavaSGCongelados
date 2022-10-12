package com.ayi.rest.serv.app.repositories;

import com.ayi.rest.serv.app.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product,Long> {
}
