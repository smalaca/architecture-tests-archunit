package com.smalaca.dto;

import com.smalaca.command.CreateNewProductCommand;
import com.smalaca.command.UpdateProductCommand;

import java.math.BigDecimal;
import java.util.UUID;

public class ProductDto {
    private String id;
    private String name;
    private BigDecimal price;
    private String description;

    public CreateNewProductCommand asCreateNewProduct() {
        return new CreateNewProductCommand(name, price, description);
    }

    public UpdateProductCommand asUpdateProduct(UUID id) {
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
