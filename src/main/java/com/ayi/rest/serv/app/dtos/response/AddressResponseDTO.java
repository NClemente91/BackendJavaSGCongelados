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
        value = "AddressResponseDTO",
        description = "Represents the data returned for addresses"
)
public class AddressResponseDTO implements Serializable {

    private Long addressId;

    @ApiModelProperty(position = 1, notes = "Street is required.")
    private String street;

    @ApiModelProperty(position = 2, notes = "StreetNumber is required.")
    private String streetNumber;

    @ApiModelProperty(position = 3, notes = "Apartment is not required.")
    private String apartment;

    @ApiModelProperty(position = 5, notes = "City is required.")
    private String city;

}
