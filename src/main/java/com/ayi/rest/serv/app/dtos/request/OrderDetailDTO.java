package com.ayi.rest.serv.app.dtos.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
@ApiModel(
        value = "OrderDetailDTO",
        description = "Represents the partial data needed to create orders."
)
public class OrderDetailDTO implements Serializable {

    @ApiModelProperty(position = 1, notes = "Product Id is required.")
    @NotNull(message = "Cannot be null")
    private Long productId;

    @ApiModelProperty(position = 2, notes = "Quantity Id is required.")
    @NotNull(message = "Cannot be null")
    private Integer quantity;

}
