package com.smalaca.persistency.product;

import java.util.UUID;

public class ProductException extends RuntimeException {
    private ProductException(String message) {
        super(message);
    }

    static RuntimeException notFound(UUID id) {
        return new ProductException("Product with id: " + id + " not found.");
    }
}
