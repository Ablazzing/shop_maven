package com.jaacademy.shop.food;

import com.javaacademy.shop.Product;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString(callSuper = true)
public class Food extends Product {
    private int calories;

    public Food(@NonNull BigDecimal price, @NonNull String name, int calories) {
        super(price, name);
        this.calories = calories;
    }
}
