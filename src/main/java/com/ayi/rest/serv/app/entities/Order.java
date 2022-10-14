package com.ayi.rest.serv.app.entities;

import io.swagger.annotations.ApiModel;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
@SQLDelete(sql = "UPDATE orders SET deleted = true WHERE order_id=?")
@Where(clause = "deleted=false")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ApiModel(
        value = "Order",
        description = "Represents the data associated with orders"
)
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long orderId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "order")
    private List<OrderDetail> orderDetailList = new ArrayList<>();

    @Column(name = "total_price")
    private Double totalPrice;

    @Column(name = "deleted", nullable = false)
    private boolean deleted = false;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

}
