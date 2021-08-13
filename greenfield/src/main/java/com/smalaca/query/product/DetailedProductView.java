package com.smalaca.query.product;

import com.smalaca.persistency.product.ProductReadModel;

import java.math.BigDecimal;
import java.util.UUID;

public class DetailedProductView {
    private final UUID id;
    private final String name;
    private final String description;
    private final BigDecimal price;

    DetailedProductView(ProductReadModel product) {
        id = product.getId();
        name = product.getName();
        description = product.getDescription();
        price = product.getPrice();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
