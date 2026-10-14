package com.ignasval.car;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class CarService {

    public List<Car> getCars() {
        BigDecimal price = new BigDecimal("223800.20");

        return List.of(
                new Car(1L,
                        "Porsche 911 GT3 RS",
                        "2023",
                        518,
                        price
                )
        );
    }
}
