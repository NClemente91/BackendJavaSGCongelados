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
        value = "ProductDTO",
        description = "Represents the data needed to create or update products."
)
public class ProductDTO implements Serializable {

    @ApiModelProperty(position = 1, notes = "Name is required.")
    @NotNull(message = "Cannot be null")
    private String name;

    @ApiModelProperty(position = 2, notes = "Description is required.")
    @NotNull(message = "Cannot be null")
    private String description;

    @ApiModelProperty(position = 3, notes = "Unit price is required.")
    @NotNull(message = "Cannot be null")
    private Double unitPrice;

    @ApiModelProperty(position = 4, notes = "Stock is required.")
    @NotNull(message = "Cannot be null")
    private Integer stock;

    @ApiModelProperty(position = 5, notes = "Image url is required.")
    @NotNull(message = "Cannot be null")
    private String imageUrl;

    @ApiModelProperty(position = 6, notes = "Category is required.")
    @NotNull(message = "Cannot be null")
    private Long categoryId;

}
