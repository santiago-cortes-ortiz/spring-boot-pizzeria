package com.jeisson.pizzeria.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tbl_customers")
@Getter
@Setter
@NoArgsConstructor
public class CustomerData {
    @Id
    @Column(nullable = false, length = 15)
    private String id;

    @Column(nullable = false, length = 60)
    private String name;

    @Column(length = 100)
    private String address;

    @Column(length = 50, unique = true, nullable = false)
    private String email;

    @Column(length = 20)
    private String phoneNumber;
}
