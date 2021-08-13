package com.smalaca.command;

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

    public UUID getId() {
        return id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
