package com.smalaca.persistency.category;

import com.smalaca.command.category.Category;
import com.smalaca.command.category.CategoryRepository;
import com.smalaca.query.category.CategoryView;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class SpringDataCategoryRepository implements CategoryRepository {
    private final SpringDataJpaCategoryRepository repository;

    SpringDataCategoryRepository(SpringDataJpaCategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public UUID save(Category category) {
        return repository.save(category).getId();
    }

    public List<CategoryView> findAll() {
        return repository.findAllCategories();
    }

    public CategoryView findCategoryById(UUID id) {
        return repository.findCategoryById(id).orElseThrow(() -> CategoryException.notFound(id));
    }
}
