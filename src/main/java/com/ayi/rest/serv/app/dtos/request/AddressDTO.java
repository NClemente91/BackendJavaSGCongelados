package com.ayi.rest.serv.app.dtos.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.NotBlank;
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
        value = "AddressDTO",
        description = "Represents the partial data needed to create addresses."
)
public class AddressDTO implements Serializable {

    @ApiModelProperty(position = 1, notes = "Street is required.")
    @NotNull(message = "Cannot be null")
    @NotBlank(message = "Cannot be empty")
    private String street;

    @ApiModelProperty(position = 2, notes = "StreetNumber is required.")
    @NotNull(message = "Cannot be null")
    @NotBlank(message = "Cannot be empty")
    private String streetNumber;

    @ApiModelProperty(position = 3, notes = "Apartment is required.")
    @NotNull(message = "Cannot be null")
    private String apartment;

    @ApiModelProperty(position = 4, notes = "Postcode is required.")
    @NotNull(message = "Cannot be null")
    @NotBlank(message = "Cannot be empty")
    private String postcode;

    @ApiModelProperty(position = 5, notes = "City is required.")
    @NotNull(message = "Cannot be null")
    @NotBlank(message = "Cannot be empty")
    private String city;

    @ApiModelProperty(position = 6, notes = "Province is required.")
    @NotNull(message = "Cannot be null")
    @NotBlank(message = "Cannot be empty")
    private String province;

    @ApiModelProperty(position = 7, notes = "Country is required.")
    @NotNull(message = "Cannot be null")
    @NotBlank(message = "Cannot be empty")
    private String country;

    @ApiModelProperty(position = 9, notes = "Email is required.")
    @NotNull(message = "Cannot be null")
    @Pattern(regexp = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$", message = "Invalid email")
    private String userEmail;

}
