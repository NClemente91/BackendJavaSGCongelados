package com.ayi.rest.serv.app.exceptions;

import com.ayi.rest.serv.app.dtos.response.DataResponseDTO;
import com.ayi.rest.serv.app.exceptions.customExceptions.BadRequestException;
import com.ayi.rest.serv.app.exceptions.customExceptions.NotFoundException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({
            BadRequestException.class,
            MethodArgumentTypeMismatchException.class,
            DataIntegrityViolationException.class,
            HttpMessageNotReadableException.class
    })
    @ResponseBody
    public ResponseEntity<DataResponseDTO<?>> badRequestHandlerException(HttpServletRequest request, Exception exception) {
        DataResponseDTO<?> error = DataResponseDTO
                .builder()
                .timestamp(LocalDateTime.now())
                .data(null)
                .responseCode(HttpStatus.BAD_REQUEST.value())
                .status("error: Bad Request")
                .message(exception.getMessage())
                .path(request.getRequestURI())
                .build();

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public ResponseEntity<DataResponseDTO<?>> argumentNotValidHandlerException(HttpServletRequest request, MethodArgumentNotValidException exception) {

        Map<String, String> errors = new HashMap<>();

        exception.getBindingResult().getFieldErrors().forEach(error -> {
            errors.put(error.getField(), error.getDefaultMessage());
        });

        DataResponseDTO<?> error = DataResponseDTO
                .builder()
                .timestamp(LocalDateTime.now())
                .data(null)
                .responseCode(HttpStatus.BAD_REQUEST.value())
                .status("error: Bad Request")
                .message(errors.toString())
                .path(request.getRequestURI())
                .build();

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler({
            NotFoundException.class,
            IllegalArgumentException.class,
    })
    @ResponseBody
    public ResponseEntity<DataResponseDTO<?>> notFoundHandlerException(HttpServletRequest request, Exception exception) {

        DataResponseDTO<?> error = DataResponseDTO
                .builder()
                .timestamp(LocalDateTime.now())
                .data(null)
                .responseCode(HttpStatus.NOT_FOUND.value())
                .status("error: Not Found")
                .message(exception.getMessage())
                .path(request.getRequestURI())
                .build();

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseEntity<DataResponseDTO<?>> runtimeHandlerException(HttpServletRequest request, Exception exception) {

        DataResponseDTO<?> error = DataResponseDTO
                .builder()
                .timestamp(LocalDateTime.now())
                .data(null)
                .responseCode(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .status("error: Internal Server Error")
                .message(exception.getMessage())
                .path(request.getRequestURI())
                .build();

        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
