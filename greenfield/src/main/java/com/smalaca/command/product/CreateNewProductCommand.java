package com.smalaca.command.product;

import java.math.BigDecimal;

public class CreateNewProductCommand {
    private final String name;
    private final BigDecimal price;
    private final String description;

    public CreateNewProductCommand(String name, BigDecimal price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    String getName() {
        return name;
    }

    BigDecimal getPrice() {
        return price;
    }

    String getDescription() {
        return description;
    }
}
