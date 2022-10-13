package com.ayi.rest.serv.app.services;

import com.ayi.rest.serv.app.dtos.response.CategoryResponseDTO;

public interface ICategoryService {
    CategoryResponseDTO findCategoryByName(String name);
}
