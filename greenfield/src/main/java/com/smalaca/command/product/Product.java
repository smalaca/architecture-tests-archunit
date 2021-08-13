package com.smalaca.command.product;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String description;

    @Embedded
    private Price price;

    private Product() {}

    private Product(Builder builder) {
        name = builder.name;
        description = builder.description;
        price = builder.price;
    }

    public UUID getId() {
        return id;
    }

    void update(UpdateProductCommand command) {
        description = command.getDescription();
        price = Price.of(command.getPrice());
    }

    static class Builder {
        private String name;
        private String description;
        private Price price;

        static Builder product() {
            return new Builder();
        }

        Builder withName(String name) {
            this.name = name;
            return this;
        }

        Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        Builder withPrice(BigDecimal price) {
            this.price = Price.of(price);
            return this;
        }

        Product build() {
            return new Product(this);
        }
    }
}
