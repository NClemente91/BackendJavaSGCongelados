package com.ayi.rest.serv.app.mappers.impl;

import com.ayi.rest.serv.app.dtos.request.UserLoginDTO;
import com.ayi.rest.serv.app.dtos.request.UserRegisterDTO;
import com.ayi.rest.serv.app.dtos.response.UserLoginResponseDTO;
import com.ayi.rest.serv.app.dtos.response.UserResponseDTO;
import com.ayi.rest.serv.app.entities.User;
import com.ayi.rest.serv.app.mappers.IUserMapper;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UserMapperImpl implements IUserMapper {

    private final ModelMapper modelMapper;

    @Override
    public UserResponseDTO entityToResponseDto(User entity) {
        return modelMapper.map(entity, UserResponseDTO.class);
    }

    @Override
    public UserLoginResponseDTO entityToLoginResponseDto(User entity) {
        return modelMapper.map(entity, UserLoginResponseDTO.class);
    }

    @Override
    public User requestDtoToEntity(UserLoginDTO requestDto) {
        return modelMapper.map(requestDto, User.class);
    }

    @Override
    public User requestDtoToEntity(UserRegisterDTO requestDto) {
        return modelMapper.map(requestDto, User.class);
    }

}
