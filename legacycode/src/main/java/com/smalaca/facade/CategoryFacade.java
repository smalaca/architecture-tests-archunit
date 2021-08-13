package com.smalaca.facade;

import com.smalaca.entity.Category;
import com.smalaca.repository.CategoryRepository;
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
