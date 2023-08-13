package com.jeisson.pizzeria.persistence.repository;

import com.jeisson.pizzeria.persistence.entity.PizzaData;
import org.springframework.data.repository.ListCrudRepository;

public interface PizzaRepository extends ListCrudRepository<PizzaData,Integer> {
}
