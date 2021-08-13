package com.smalaca.query.category;

import com.smalaca.persistency.category.CategoryReadModel;
import com.smalaca.persistency.category.SpringDataCategoryRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

import static java.util.stream.Collectors.toList;

@Repository
public class CategoryQueryRepository {
    private final SpringDataCategoryRepository repository;

    CategoryQueryRepository(SpringDataCategoryRepository repository) {
        this.repository = repository;
    }

    public List<CategoryView> findAll() {
        return repository.findAll().stream().map(this::asCategoryView).collect(toList());
    }

    public CategoryView findById(UUID id) {
        return asCategoryView(repository.findCategoryById(id));
    }

    private CategoryView asCategoryView(CategoryReadModel category) {
        return new CategoryView(category.getId(), category.getName());
    }
}
