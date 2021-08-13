package com.smalaca.entity;

import com.smalaca.command.UpdateProductCommand;
import com.smalaca.embeddable.Price;

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

    public void update(UpdateProductCommand command) {
        description = command.getDescription();
        price = Price.of(command.getPrice());
    }

    public static class Builder {
        private String name;
        private String description;
        private Price price;

        public static Builder product() {
            return new Builder();
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder withPrice(BigDecimal price) {
            this.price = Price.of(price);
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
