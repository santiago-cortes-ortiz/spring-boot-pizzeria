package com.jeisson.pizzeria.service;

import com.jeisson.pizzeria.persistence.entity.OrderData;
import com.jeisson.pizzeria.persistence.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public List<OrderData> findAll() {
        return orderRepository.findAll();
    }
}
