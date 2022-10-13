package com.ayi.rest.serv.app.mappers.impl;

import com.ayi.rest.serv.app.dtos.request.CategoryDTO;
import com.ayi.rest.serv.app.dtos.response.CategoryResponseDTO;
import com.ayi.rest.serv.app.entities.Category;
import com.ayi.rest.serv.app.mappers.ICategoryMapper;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CategoryMapperImpl implements ICategoryMapper {

    private final ModelMapper modelMapper;

    @Override
    public CategoryResponseDTO entityToResponseDto(Category entity) {
        return modelMapper.map(entity, CategoryResponseDTO.class);
    }

    @Override
    public Category requestDtoToEntity(CategoryDTO requestDto) {
        return modelMapper.map(requestDto, Category.class);
    }

    @Override
    public Category responseDtoToEntity(CategoryResponseDTO responseDto) {
        return modelMapper.map(responseDto, Category.class);
    }

}
