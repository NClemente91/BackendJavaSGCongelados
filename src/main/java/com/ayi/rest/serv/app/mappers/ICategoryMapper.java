package com.ayi.rest.serv.app.mappers;

import com.ayi.rest.serv.app.dtos.response.CategoryResponseDTO;
import com.ayi.rest.serv.app.entities.Category;

public interface ICategoryMapper {

    CategoryResponseDTO entityToResponseDto(Category entity);

    Category responseDtoToEntity(CategoryResponseDTO responseDto);

}
