package com.javaacademy.shop.drug;

import com.javaacademy.shop.Product;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@ToString(callSuper = true)
public class Drug extends Product {
    @NonNull
    private Boolean isNeedReceipt;

    public Drug(@NonNull BigDecimal price, @NonNull String name, @NonNull Boolean isNeedReceipt) {
        super(price, name);
        this.isNeedReceipt = isNeedReceipt;
    }
}
