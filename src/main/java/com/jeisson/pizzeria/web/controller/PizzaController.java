package com.jeisson.pizzeria.web.controller;

import com.jeisson.pizzeria.persistence.entity.PizzaData;
import com.jeisson.pizzeria.service.PizzaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pizzas")
@RequiredArgsConstructor
public class PizzaController {
    private final PizzaService pizzaService;

    @GetMapping
    public ResponseEntity<List<PizzaData>> findAll() {
        return ResponseEntity.ok(this.pizzaService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PizzaData> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(this.pizzaService.findById(id));
    }

    @PostMapping
    public ResponseEntity<PizzaData> save(@RequestBody PizzaData pizzaData) {
        return ResponseEntity.ok(this.pizzaService.save(pizzaData));
    }
}
