package com.smalaca.rest.product;

import com.smalaca.command.product.CreateNewProductCommand;
import com.smalaca.command.product.UpdateProductCommand;

import java.math.BigDecimal;
import java.util.UUID;

public class ProductDto {
    private static final String NO_ID = null;

    private final String id;
    private final String name;
    private final BigDecimal price;
    private final String description;

    public ProductDto(String name, BigDecimal price, String description) {
        this(NO_ID, name, price, description);
    }

    public ProductDto(String id, String name, BigDecimal price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    CreateNewProductCommand asCreateNewProduct() {
        return new CreateNewProductCommand(name, price, description);
    }

    UpdateProductCommand asUpdateProduct(UUID id) {
        return new UpdateProductCommand(id, price, description);
    }
}
