package com.smalaca.query.product;

import com.smalaca.command.product.Price;
import com.smalaca.persistency.product.ProductReadModel;

import java.util.UUID;

public class DetailedProductView {
    private final UUID id;
    private final String name;
    private final String description;
    private final Price price;

    DetailedProductView(ProductReadModel product) {
        id = product.getId();
        name = product.getName();
        description = product.getDescription();
        price = product.getPrice();
    }
}
