package com.ignasval.car;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name="Cars")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Car {
    private Long id;
    private String model;
    private String year;
    private Integer horsepower;
    private BigDecimal price;

    public Car() {
    }

    public Car(Long id,
               String model,
               String year,
               Integer horsepower,
               BigDecimal price) {
        this.id = id;
        this.model = model;
        this.year = year;
        this.horsepower = horsepower;
        this.price = price;
    }

    public Car(String model,
               String year,
               Integer horsepower,
               BigDecimal price) {
        this.model = model;
        this.year = year;
        this.horsepower = horsepower;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Integer getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(Integer horsepower) {
        this.horsepower = horsepower;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", horsepower=" + horsepower +
                ", price=" + price +
                '}';
    }
}
