package com.jeisson.pizzeria.persistence.repository;

import com.jeisson.pizzeria.persistence.entity.OrderData;
import org.springframework.data.repository.ListCrudRepository;

public interface OrderRepository extends ListCrudRepository<OrderData,Integer> {
}
