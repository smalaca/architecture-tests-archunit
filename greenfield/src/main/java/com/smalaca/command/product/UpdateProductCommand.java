package com.smalaca.command.product;

import java.math.BigDecimal;
import java.util.UUID;

public class UpdateProductCommand {
    private final UUID id;
    private final BigDecimal price;
    private final String description;

    public UpdateProductCommand(UUID id, BigDecimal price, String description) {
        this.id = id;
        this.price = price;
        this.description = description;
    }

    UUID getId() {
        return id;
    }

    BigDecimal getPrice() {
        return price;
    }

    String getDescription() {
        return description;
    }
}
