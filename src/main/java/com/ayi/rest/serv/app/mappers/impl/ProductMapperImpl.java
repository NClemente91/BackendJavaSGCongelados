package com.ayi.rest.serv.app.mappers.impl;

import com.ayi.rest.serv.app.dtos.request.ProductDTO;
import com.ayi.rest.serv.app.dtos.response.ProductResponseDTO;
import com.ayi.rest.serv.app.entities.Product;
import com.ayi.rest.serv.app.mappers.IProductMapper;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ProductMapperImpl implements IProductMapper {

    private final ModelMapper modelMapper;

    @Override
    public ProductResponseDTO entityToResponseDto(Product entity) {
        return modelMapper.map(entity, ProductResponseDTO.class);
    }

    @Override
    public Product requestDtoToEntity(ProductDTO requestDto) {
        return modelMapper.map(requestDto, Product.class);
    }

}
