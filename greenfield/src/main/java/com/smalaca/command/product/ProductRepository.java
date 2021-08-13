package com.smalaca.command.product;

import java.util.UUID;

public interface ProductRepository {
    UUID save(Product product);

    Product findById(UUID id);
}
