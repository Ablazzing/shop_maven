package com.jaacademy.shop;

import com.jaacademy.shop.food.Food;
import com.javaacademy.shop.Cashier;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

import static java.math.BigDecimal.valueOf;

@Slf4j
public class Runner {
    public static void main(String[] args) {
      //4.3.1 создано яблоко, 50 калорий, 100 рублей. Залогировать создание яблока.
        //4.3.2 создана пицца, 549 калорий, 500 рублей. Залогировать создание пиццы.
        //4.3.3 Создана касса и товары добавлены в кассу. Распечатать список товаров в кассе.
        Food apple = new Food(valueOf(100), "Яблоко", 50);
        log.info("создан товар - {}", apple);
        Food pizza = new Food(valueOf(500), "Яблоко", 549);
        log.info("создан товар - {}", pizza);
        Cashier cashier = new Cashier();
        cashier.addProduct(apple);
        cashier.addProduct(pizza);
        cashier.printProducts();
    }
}
