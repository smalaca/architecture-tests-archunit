package com.smalaca.exception;

import java.util.UUID;

public class CategoryException extends RuntimeException {
    private CategoryException(String message) {
        super(message);
    }

    public static RuntimeException notFound(UUID id) {
        return new CategoryException("Category with id: " + id + " not found.");
    }
}
