package com.jeisson.pizzeria.persistence.entity.orderitem;

import com.jeisson.pizzeria.persistence.entity.OrderData;
import com.jeisson.pizzeria.persistence.entity.PizzaData;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tbl_order_items")
@IdClass(OrderItemId.class)
@Getter
@Setter
@NoArgsConstructor
public class OrderItemData {
    @Id
    @Column(name = "id_order",nullable = false)
    private Integer idOrder;

    @Id
    @Column(name = "id_item",nullable = false)
    private Integer idItem;

    @Column(name = "id_pizza",nullable = false)
    private Integer idPizza;

    @Column(nullable = false, columnDefinition = "Decimal(2,1)")
    private Double quantity;

    @Column(nullable = false, columnDefinition = "Decimal(5,2)")
    private Double price;

    @OneToOne
    @JoinColumn(name = "id_pizza",
            referencedColumnName = "id", insertable = false, updatable = false)
    private PizzaData pizza;

    @ManyToOne
    @JoinColumn(name = "id_order",
            referencedColumnName = "id", insertable = false, updatable = false)
    private OrderData order;

}
