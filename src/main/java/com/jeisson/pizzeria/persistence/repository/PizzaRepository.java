package com.jeisson.pizzeria.persistence.repository;

import com.jeisson.pizzeria.persistence.entity.PizzaData;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;
import java.util.Optional;

public interface PizzaRepository extends ListCrudRepository<PizzaData, Integer> {
    List<PizzaData> findAllByAvailableTrueOrderByPrice();

    Optional<PizzaData> findByAvailableTrueAndNameIgnoreCase(String name);
}
