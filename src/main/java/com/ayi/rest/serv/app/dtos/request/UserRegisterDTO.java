package com.ayi.rest.serv.app.dtos.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
@ApiModel(
        value = "UserRegisterDTO",
        description = "Represents the data needed to register user."
)
public class UserRegisterDTO implements Serializable {

    @ApiModelProperty(position = 1, notes = "Name is required.")
    @NotNull(message = "Cannot be null")
    private String name;

    @ApiModelProperty(position = 2, notes = "LastName is required.")
    @NotNull(message = "Cannot be null")
    private String lastName;

    @ApiModelProperty(position = 3, notes = "Email is required.")
    @NotNull(message = "Cannot be null")
    @Pattern(regexp = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$", message = "Invalid email")
    private String email;

    @ApiModelProperty(position = 4, notes = "Password is required.")
    @NotNull(message = "Cannot be null")
    private String password;

    @ApiModelProperty(position = 5, notes = "Address is required.")
//    @NotNull(message = "Cannot be null")
    private AddressDTO address;

}
