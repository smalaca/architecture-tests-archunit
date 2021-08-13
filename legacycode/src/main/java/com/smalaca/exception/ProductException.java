package com.smalaca.exception;

import java.util.UUID;

public class ProductException extends RuntimeException {
    private ProductException(String message) {
        super(message);
    }

    public static RuntimeException notFound(UUID id) {
        return new ProductException("Product with id: " + id + " not found.");
    }
}
