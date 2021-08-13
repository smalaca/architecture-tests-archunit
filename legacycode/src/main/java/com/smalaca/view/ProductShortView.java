package com.smalaca.view;

import com.smalaca.readmodel.ProductReadModel;

import java.math.BigDecimal;
import java.util.UUID;

public class ProductShortView {
    private final UUID id;
    private final String name;
    private final BigDecimal price;

    public ProductShortView(ProductReadModel product) {
        id = product.getId();
        name = product.getName();
        price = product.getPrice();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
