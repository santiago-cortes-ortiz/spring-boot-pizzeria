package com.jeisson.pizzeria.service;

import com.jeisson.pizzeria.persistence.entity.PizzaData;
import com.jeisson.pizzeria.persistence.repository.PizzaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PizzaService {
    private final PizzaRepository pizzaRepository;

    public List<PizzaData> findAll() {
        return this.pizzaRepository.findAll();
    }

    public PizzaData findById(Integer id) {
        return this.pizzaRepository.findById(id).orElse(null);
    }
}
