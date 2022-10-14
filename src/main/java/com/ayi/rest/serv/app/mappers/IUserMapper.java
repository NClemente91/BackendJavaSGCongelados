package com.ayi.rest.serv.app.mappers;

import com.ayi.rest.serv.app.dtos.request.UserLoginDTO;
import com.ayi.rest.serv.app.dtos.request.UserRegisterDTO;
import com.ayi.rest.serv.app.dtos.response.UserLoginResponseDTO;
import com.ayi.rest.serv.app.dtos.response.UserResponseDTO;
import com.ayi.rest.serv.app.entities.User;

public interface IUserMapper {

    UserResponseDTO entityToResponseDto(User entity);

    UserLoginResponseDTO entityToLoginResponseDto(User entity);

    User requestDtoToEntity(UserRegisterDTO requestDto);

}
