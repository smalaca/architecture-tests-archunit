package com.smalaca.persistency.product;

import com.smalaca.command.product.Price;

import java.util.UUID;

public class ProductReadModel {
    private final UUID id;
    private final String name;
    private final String description;
    private final Price price;

    ProductReadModel(UUID id, String name, String description, Price price) {
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

    public Price getPrice() {
        return price;
    }
}
