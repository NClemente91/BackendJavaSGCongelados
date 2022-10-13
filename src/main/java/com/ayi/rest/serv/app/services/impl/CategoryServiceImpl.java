package com.ayi.rest.serv.app.services.impl;

import com.ayi.rest.serv.app.dtos.response.CategoryResponseDTO;
import com.ayi.rest.serv.app.entities.Category;
import com.ayi.rest.serv.app.exceptions.customExceptions.NotFoundException;
import com.ayi.rest.serv.app.mappers.ICategoryMapper;
import com.ayi.rest.serv.app.repositories.ICategoryRepository;
import com.ayi.rest.serv.app.services.ICategoryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@AllArgsConstructor
@Service
@Transactional
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private ICategoryRepository categoryRepository;

    @Autowired
    private ICategoryMapper categoryMapper;

    @Override
    public CategoryResponseDTO findCategoryByName(String name){

        Optional<Category> optionalCategory = categoryRepository.findByName(name);

        if (optionalCategory.isEmpty()){
            throw new NotFoundException("Category " + name + " does not exist");
        }

        return categoryMapper.entityToResponseDto(optionalCategory.get());

    }

}
