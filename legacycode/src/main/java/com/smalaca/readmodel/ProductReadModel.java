package com.smalaca.readmodel;

import com.smalaca.embeddable.Price;

import java.math.BigDecimal;
import java.util.UUID;

public class ProductReadModel {
    private final UUID id;
    private final String name;
    private final String description;
    private final Price price;

    public ProductReadModel(UUID id, String name, String description, Price price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
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
        return price.value();
    }
}
