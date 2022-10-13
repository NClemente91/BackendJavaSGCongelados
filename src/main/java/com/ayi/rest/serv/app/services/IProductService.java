package com.ayi.rest.serv.app.services;

import com.ayi.rest.serv.app.dtos.request.ProductDTO;
import com.ayi.rest.serv.app.dtos.response.PagesResponseDTO;
import com.ayi.rest.serv.app.dtos.response.ProductResponseDTO;

public interface IProductService {
    PagesResponseDTO<ProductResponseDTO> findAllProducts(Integer page, Integer size);

    ProductResponseDTO findProductById(Long id);

    PagesResponseDTO<ProductResponseDTO> findProductsByCategory(Integer page, Integer size, String category);

    ProductResponseDTO createProduct(ProductDTO productDTO);

    ProductResponseDTO updateStockProduct(Integer quantity, Long id);

    void deleteProductById(Long id);
}
