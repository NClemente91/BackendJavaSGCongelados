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
        value = "UserLoginDTO",
        description = "Represents the data needed to login user."
)
public class UserLoginDTO implements Serializable {

    @ApiModelProperty(position = 1, notes = "Email is required.")
    @NotNull(message = "Cannot be null")
    @Pattern(regexp = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$", message = "Invalid email")
    private String email;

    @ApiModelProperty(position = 2, notes = "Password is required.")
    @NotNull(message = "Cannot be null")
    private String password;

}
