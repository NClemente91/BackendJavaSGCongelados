package com.ayi.rest.serv.app.dtos.response;

import com.ayi.rest.serv.app.entities.Category;
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
        value = "ProductResponseDTO",
        description = "Represents the data returned for products"
)
public class ProductResponseDTO implements Serializable {

    private Long productId;

    @ApiModelProperty(position = 1, notes = "Name is required.")
    private String name;

    @ApiModelProperty(position = 2, notes = "Description is required.")
    private String description;

    @ApiModelProperty(position = 3, notes = "Unit price is required.")
    private Double unitPrice;

    @ApiModelProperty(position = 4, notes = "Stock is required.")
    private Integer stock;

    @ApiModelProperty(position = 5, notes = "Image Url is required.")
    private String imageUrl;

    @ApiModelProperty(position = 6, notes = "Category is required.")
    private CategoryResponseDTO category;

}
