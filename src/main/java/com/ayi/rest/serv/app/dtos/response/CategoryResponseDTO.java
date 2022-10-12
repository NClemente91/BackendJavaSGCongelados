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
        value = "CategoryResponseDTO",
        description = "Represents the data returned for categories"
)
public class CategoryResponseDTO implements Serializable {

    private Long categoryId;

    @ApiModelProperty(position = 1, notes = "Name is required.")
    private String name;

}
