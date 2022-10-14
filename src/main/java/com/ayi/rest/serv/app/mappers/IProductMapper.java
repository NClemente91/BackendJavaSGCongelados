package com.ayi.rest.serv.app.mappers;

import com.ayi.rest.serv.app.dtos.request.ProductDTO;
import com.ayi.rest.serv.app.dtos.response.ProductResponseDTO;
import com.ayi.rest.serv.app.entities.Product;

public interface IProductMapper {
    ProductResponseDTO entityToResponseDto(Product entity);

    Product requestDtoToEntity(ProductDTO requestDto);

    Product responseDtoToEntity(ProductResponseDTO responseDto);
}
