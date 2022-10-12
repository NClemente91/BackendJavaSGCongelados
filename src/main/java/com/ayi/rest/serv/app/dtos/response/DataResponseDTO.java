package com.ayi.rest.serv.app.dtos.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
@ToString
@ApiModel(
        value = "DataResponseDTO",
        description = "Represents the data returned for the endpoints"
)
public class DataResponseDTO<ResponseDTO> implements Serializable {

    @ApiModelProperty(position = 1)
    private LocalDateTime timestamp;

    @ApiModelProperty(position = 2)
    private List<ResponseDTO> data;

    @ApiModelProperty(position = 3)
    private Integer responseCode;

    @ApiModelProperty(position = 4)
    private String status;

    @ApiModelProperty(position = 5)
    private String message;

    @ApiModelProperty(position = 6)
    private String path;

}
