package com.ayi.rest.serv.app.repositories;

import com.ayi.rest.serv.app.entities.Category;
import com.ayi.rest.serv.app.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IProductRepository extends JpaRepository<Product,Long> {

    Page<Product> findAllByCategory(Category category, Pageable pageable);

    Optional<Product> findByName(String name);

}
