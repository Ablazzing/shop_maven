package com.javaacademy.shop;

import com.javaacademy.shop.drug.Drug;
import lombok.extern.slf4j.Slf4j;

import static java.math.BigDecimal.valueOf;

@Slf4j
public class RunnerTest {

    public static void main(String[] args) {
        Drug drug = new Drug(valueOf(500), "Lorotadin", true);
        log.info("Создано новое лекарство - {}", drug);
        Cashier cashier = new Cashier();
        cashier.addProduct(drug);
        cashier.printProducts();
    }
}
