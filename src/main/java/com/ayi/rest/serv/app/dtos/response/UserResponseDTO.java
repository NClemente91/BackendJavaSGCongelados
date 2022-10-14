package com.ayi.rest.serv.app.dtos.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
@ApiModel(
        value = "UserResponseDTO",
        description = "Represents the data returned for users"
)
public class UserResponseDTO implements Serializable {

    private Long userId;

    @ApiModelProperty(position = 1, notes = "Name is required.")
    private String name;

    @ApiModelProperty(position = 2, notes = "Last name is required.")
    private String lastName;

    @ApiModelProperty(position = 3, notes = "Email is required.")
    private String email;

    @ApiModelProperty(position = 4, notes = "Address is required.")
    private AddressResponseDTO address;

}
