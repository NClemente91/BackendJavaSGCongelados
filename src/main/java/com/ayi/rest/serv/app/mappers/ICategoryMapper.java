package com.ayi.rest.serv.app.mappers;

import com.ayi.rest.serv.app.dtos.request.CategoryDTO;
import com.ayi.rest.serv.app.dtos.response.CategoryResponseDTO;
import com.ayi.rest.serv.app.entities.Category;

public interface ICategoryMapper {

    CategoryResponseDTO entityToResponseDto(Category entity);

    Category requestDtoToEntity(CategoryDTO requestDto);

    Category responseDtoToEntity(CategoryResponseDTO responseDto);
}
