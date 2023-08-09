package com.jeisson.pizzeria.persistence.entity.orderitem;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class OrderItemId implements Serializable {
    private Integer idOrder;
    private Integer idItem;
}
