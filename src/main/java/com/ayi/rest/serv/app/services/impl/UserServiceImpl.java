package com.ayi.rest.serv.app.services.impl;

import com.ayi.rest.serv.app.dtos.request.UserLoginDTO;
import com.ayi.rest.serv.app.dtos.request.UserRegisterDTO;
import com.ayi.rest.serv.app.dtos.response.UserResponseDTO;
import com.ayi.rest.serv.app.entities.Address;
import com.ayi.rest.serv.app.entities.User;
import com.ayi.rest.serv.app.exceptions.customExceptions.BadRequestException;
import com.ayi.rest.serv.app.exceptions.customExceptions.NotFoundException;
import com.ayi.rest.serv.app.mappers.IAddressMapper;
import com.ayi.rest.serv.app.mappers.IUserMapper;
import com.ayi.rest.serv.app.repositories.IUserRepository;
import com.ayi.rest.serv.app.services.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Objects;

@AllArgsConstructor
@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private IUserMapper userMapper;

    @Autowired
    private IAddressMapper addressMapper;

    @Override
    public User findUserByEmail(String email){

        if (Objects.equals(email, "")){
            throw new BadRequestException("Email cannot be empty");
        }

        return userRepository.findByEmail(email);

    }

    @Override
    public UserResponseDTO userLogin(UserLoginDTO user){

        User userExist = findUserByEmail(user.getEmail());

        if(userExist == null || !BCrypt.checkpw(user.getPassword(), userExist.getPassword())) {
            throw new NotFoundException("Email or password invalid");
        }

        return userMapper.entityToResponseDto(userExist);

    }

    @Override
    public UserResponseDTO userRegister(UserRegisterDTO user){

        User userExist = findUserByEmail(user.getEmail());

        if(userExist != null){
            throw new BadRequestException("User email already exists");
        }

        User userToRegister = userMapper.requestDtoToEntity(user);

        String password_hash = BCrypt.hashpw(userToRegister.getPassword(), BCrypt.gensalt(10));
        userToRegister.setPassword(password_hash);

        Address addressToRegister = addressMapper.requestDtoToEntity(user.getAddress());

        userToRegister.setAddress(addressToRegister);
        addressToRegister.setCreatedAt(LocalDateTime.now());
        userToRegister.setCreatedAt(LocalDateTime.now());


        User userRegistered = userRepository.save(userToRegister);

        return userMapper.entityToResponseDto(userRegistered);

    }
}
