package com.jeisson.pizzeria.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_orders")
public class OrderData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;

    @Column(nullable = false, length = 15)
    private String idCustomer;

    @Column(nullable = false, columnDefinition = "DATETIME")
    private LocalDateTime date;

    @Column(nullable = false, columnDefinition = "DECIMAL(6,2)")
    private Double total;

    @Column(nullable = false, columnDefinition = "CHAR(1)")
    private Character paymentMethod;

    @Column(nullable = false, length = 200)
    private String additionalInfo;
}
