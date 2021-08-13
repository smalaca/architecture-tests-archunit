package com.smalaca.persistency.category;

import java.util.UUID;

public class CategoryReadModel {
    private final UUID id;
    private final String name;

    public CategoryReadModel(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
