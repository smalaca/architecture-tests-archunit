package com.smalaca.query.category;

import java.util.UUID;

public class CategoryView {
    private final UUID id;
    private final String name;

    public CategoryView(UUID id, String name) {
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
