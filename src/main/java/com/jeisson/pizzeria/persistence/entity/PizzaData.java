package com.jeisson.pizzeria.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "tbl_pizzas")
@Getter
@Setter
@NoArgsConstructor
public class PizzaData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;

    @Column(nullable = false, length = 30, unique = true)
    private String name;

    @Column(nullable = false, length = 150)
    private String description;

    @Column(nullable = false, columnDefinition = "Decimal(5,2)")
    private Double price;

    @Column(columnDefinition = "TINYINT(1)")
    private Boolean vegetarian;

    @Column(columnDefinition = "TINYINT(1)")
    private Boolean vegan;

    @Column(nullable = false,columnDefinition = "TINYINT(1)")
    private Boolean available;
}
