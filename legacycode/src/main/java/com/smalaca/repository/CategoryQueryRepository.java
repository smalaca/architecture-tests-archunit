package com.smalaca.repository;

import com.smalaca.view.CategoryView;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class CategoryQueryRepository {
    private final SpringDataCategoryRepository repository;

    CategoryQueryRepository(SpringDataCategoryRepository repository) {
        this.repository = repository;
    }

    public List<CategoryView> findAll() {
        return repository.findAll();
    }

    public CategoryView findById(UUID id) {
        return repository.findCategoryById(id);
    }
}
