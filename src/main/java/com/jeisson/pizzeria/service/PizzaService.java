package com.jeisson.pizzeria.service;

import com.jeisson.pizzeria.persistence.entity.PizzaData;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PizzaService {
    private final JdbcTemplate jdbcTemplate;

    public List<PizzaData> findAll() {
        return this.jdbcTemplate.query("SELECT * FROM tbl_pizzas", new BeanPropertyRowMapper<>(PizzaData.class));
    }
}
