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
        value = "OrderDetailResponseDTO",
        description = "Represents the data returned for order details"
)
public class OrderDetailResponseDTO implements Serializable {

    @ApiModelProperty(position = 1, notes = "Product name is required.")
    private String productName;

    @ApiModelProperty(position = 2, notes = "Quantity is required.")
    private Integer quantity;

    @ApiModelProperty(position = 3, notes = "Price is required.")
    private Double price;

}
