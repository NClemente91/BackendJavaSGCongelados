package com.ayi.rest.serv.app.dtos.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "YYYY-DD-MM HH:MM:SS")
    private LocalDateTime timestamp;

    @ApiModelProperty(position = 2)
    private ResponseDTO data;

    @ApiModelProperty(position = 3)
    private Integer responseCode;

    @ApiModelProperty(position = 4)
    private String status;

    @ApiModelProperty(position = 5)
    private String message;

    @ApiModelProperty(position = 6)
    private String path;

}
