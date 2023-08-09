package com.jeisson.pizzeria.persistence.entity;

import com.jeisson.pizzeria.persistence.entity.orderitem.OrderItemData;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tbl_orders")
@Getter
@Setter
@NoArgsConstructor
public class OrderData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;

    @Column(name = "id_customer",nullable = false, length = 15)
    private String idCustomer;

    @Column(nullable = false, columnDefinition = "DATETIME")
    private LocalDateTime date;

    @Column(nullable = false, columnDefinition = "DECIMAL(6,2)")
    private Double total;

    @Column(nullable = false, columnDefinition = "CHAR(1)")
    private Character paymentMethod;

    @Column(nullable = false, length = 200)
    private String additionalInfo;

    @OneToOne
    @JoinColumn(name = "id_customer",
            referencedColumnName = "id", insertable = false, updatable = false)
    private CustomerData customer;

    @OneToMany(mappedBy = "order")
    private List<OrderItemData> items;
}
