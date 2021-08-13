package com.smalaca.persistency.category;

import java.util.UUID;

class CategoryException extends RuntimeException {
    private CategoryException(String message) {
        super(message);
    }

    static RuntimeException notFound(UUID id) {
        return new CategoryException("Category with id: " + id + " not found.");
    }
}
