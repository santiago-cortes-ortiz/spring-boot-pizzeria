package com.jeisson.pizzeria.web.controller;

import com.jeisson.pizzeria.persistence.entity.PizzaData;
import com.jeisson.pizzeria.service.PizzaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pizzas")
@RequiredArgsConstructor
public class PizzaController {
    private final PizzaService pizzaService;

    @GetMapping
    public final ResponseEntity<List<PizzaData>> findAll() {
        return ResponseEntity.ok(this.pizzaService.findAll());
    }
}
