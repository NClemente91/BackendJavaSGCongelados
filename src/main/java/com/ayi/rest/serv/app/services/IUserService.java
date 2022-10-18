package com.ayi.rest.serv.app.services;

import com.ayi.rest.serv.app.dtos.request.UserLoginDTO;
import com.ayi.rest.serv.app.dtos.request.UserRegisterDTO;
import com.ayi.rest.serv.app.dtos.response.UserResponseDTO;
import com.ayi.rest.serv.app.entities.User;

public interface IUserService {
    User findUserByEmail(String email);

    UserResponseDTO userLogin(UserLoginDTO user);

    UserResponseDTO userRegister(UserRegisterDTO user);
}
