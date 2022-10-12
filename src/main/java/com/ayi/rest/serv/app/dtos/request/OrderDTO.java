package com.ayi.rest.serv.app.dtos.request;

import com.ayi.rest.serv.app.entities.Address;
import com.ayi.rest.serv.app.entities.OrderDetail;
import com.ayi.rest.serv.app.entities.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
@ApiModel(
        value = "OrderDTO",
        description = "Represents the data needed to create orders."
)
public class OrderDTO implements Serializable {

    @ApiModelProperty(position = 1, notes = "User email is required.")
    @NotNull(message = "Cannot be null")
    @Pattern(regexp = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$", message = "Invalid email")
    private String userEmail;

    @ApiModelProperty(position = 2, notes = "Address Id is required.")
    @NotNull(message = "Cannot be null")
    private Long addressId;

    @ApiModelProperty(position = 3, notes = "Cart is required.")
    @NotNull(message = "Cannot be null")
    private List<OrderDetailDTO> cart = new ArrayList<>();


}
