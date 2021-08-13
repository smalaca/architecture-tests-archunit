package com.smalaca.command.category;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class CategoryFacade {
    private final CategoryRepository repository;

    public CategoryFacade(CategoryRepository repository) {
        this.repository = repository;
    }

    public UUID add(String name) {
        Category category = new Category(name);
        return repository.save(category);
    }
}
