package com.ayi.rest.serv.app.dtos.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
@ApiModel(
        value = "OrderResponseDTO",
        description = "Represents the data returned for orders"
)
public class OrderResponseDTO {

    private Long orderId;

    @ApiModelProperty(position = 1, notes = "Address is required.")
    private UserResponseDTO user;

    @ApiModelProperty(position = 2, notes = "Order detail is required.")
    private List<OrderDetailResponseDTO> orderDetail;

    @ApiModelProperty(position = 3, notes = "totalPrice detail is required.")
    private Double totalPrice;

    @ApiModelProperty(position = 4, notes = "Created at is required.")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:SS")
    private LocalDateTime created_at;

}
