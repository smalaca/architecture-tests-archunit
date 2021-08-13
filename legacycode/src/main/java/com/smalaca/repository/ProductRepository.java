package com.smalaca.repository;

import com.smalaca.entity.Product;

import java.util.UUID;

public interface ProductRepository {
    UUID save(Product product);

    Product findById(UUID id);
}
