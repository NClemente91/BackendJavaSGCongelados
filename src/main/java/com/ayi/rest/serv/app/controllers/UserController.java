package com.ayi.rest.serv.app.controllers;

import com.ayi.rest.serv.app.dtos.request.ProductDTO;
import com.ayi.rest.serv.app.dtos.request.UserLoginDTO;
import com.ayi.rest.serv.app.dtos.request.UserRegisterDTO;
import com.ayi.rest.serv.app.dtos.response.DataResponseDTO;
import com.ayi.rest.serv.app.dtos.response.ProductResponseDTO;
import com.ayi.rest.serv.app.dtos.response.UserLoginResponseDTO;
import com.ayi.rest.serv.app.dtos.response.UserResponseDTO;
import com.ayi.rest.serv.app.services.IUserService;
import io.swagger.annotations.*;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.LocalDateTime;

@AllArgsConstructor
@Api(value = "User Api", tags = {"User Service"})
@RestController
@RequestMapping(value = "/user", produces = {MediaType.APPLICATION_JSON_VALUE})
public class UserController {

    private IUserService userService;

    @PostMapping(value = "/login", produces = {MediaType.APPLICATION_JSON_VALUE})
    @ApiOperation(
            value = "Returns user logged in",
            httpMethod = "POST",
            response = UserLoginResponseDTO.class
    )
    @ApiResponses(value = {
            @ApiResponse(
                    code = 201,
                    message = "Body content with information about a successfully login",
                    response = UserLoginResponseDTO.class),
            @ApiResponse(
                    code = 400,
                    message = "Information about a login error")
    })
    public ResponseEntity<DataResponseDTO<UserLoginResponseDTO>> userLogin(
            @ApiParam(name = "user", required = true, value = "User")
            @Valid @RequestBody UserLoginDTO user) {

        UserLoginResponseDTO userLoginResponse = userService.userLogin(user);

        DataResponseDTO<UserLoginResponseDTO> result = new DataResponseDTO<>();
        result.setTimestamp(LocalDateTime.now());
        result.setData(userLoginResponse);
        result.setResponseCode(HttpStatus.OK.value());
        result.setStatus("SUCCESS");
        result.setMessage("OK");
        result.setPath("/user/login");

        return new ResponseEntity<>(result, HttpStatus.OK);

    }

    @PostMapping(value = "/register", produces = {MediaType.APPLICATION_JSON_VALUE})
    @ApiOperation(
            value = "Returns registered user",
            httpMethod = "POST",
            response = UserResponseDTO.class
    )
    @ApiResponses(value = {
            @ApiResponse(
                    code = 201,
                    message = "Body content with information about a successfully register",
                    response = UserResponseDTO.class),
            @ApiResponse(
                    code = 400,
                    message = "Information about a register error")
    })
    public ResponseEntity<DataResponseDTO<UserResponseDTO>> userRegister(
            @ApiParam(name = "user", required = true, value = "User")
            @Valid @RequestBody UserRegisterDTO user) {

        UserResponseDTO userResponse = userService.userRegister(user);

        DataResponseDTO<UserResponseDTO> result = new DataResponseDTO<>();
        result.setTimestamp(LocalDateTime.now());
        result.setData(userResponse);
        result.setResponseCode(HttpStatus.CREATED.value());
        result.setStatus("SUCCESS");
        result.setMessage("CREATED");
        result.setPath("/user/register");

        return new ResponseEntity<>(result, HttpStatus.CREATED);

    }

}
