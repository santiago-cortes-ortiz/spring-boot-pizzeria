package com.jeisson.pizzeria.web.controller;

import com.jeisson.pizzeria.persistence.entity.OrderData;

import com.jeisson.pizzeria.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @GetMapping
    public ResponseEntity<List<OrderData>> findAll() {
        return ResponseEntity.ok(this.orderService.findAll());
    }
}
