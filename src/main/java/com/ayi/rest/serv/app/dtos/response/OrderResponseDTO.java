package com.ayi.rest.serv.app.dtos.response;

import com.ayi.rest.serv.app.entities.Address;
import com.ayi.rest.serv.app.entities.OrderDetail;
import com.ayi.rest.serv.app.entities.User;
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
    private AddressResponseDTO address;

    @ApiModelProperty(position = 2, notes = "Created at is required.")
    private LocalDateTime created_at;

    @ApiModelProperty(position = 3, notes = "Order detail is required.")
    private List<OrderDetail> orderDetail;

}
