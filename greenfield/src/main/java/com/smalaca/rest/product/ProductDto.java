package com.smalaca.rest.product;

import com.smalaca.command.product.CreateNewProductCommand;
import com.smalaca.command.product.UpdateProductCommand;

import java.math.BigDecimal;
import java.util.UUID;

public class ProductDto {
    private static final String NO_ID = null;

    private String id;
    private String name;
    private BigDecimal price;
    private String description;

    public ProductDto() {}

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

    void setId(String id) {
        this.id = id;
    }

    void setName(String name) {
        this.name = name;
    }

    void setPrice(BigDecimal price) {
        this.price = price;
    }

    void setDescription(String description) {
        this.description = description;
    }
}
