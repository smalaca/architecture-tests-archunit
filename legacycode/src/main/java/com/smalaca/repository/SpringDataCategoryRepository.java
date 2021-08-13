package com.smalaca.repository;

import com.smalaca.entity.Category;
import com.smalaca.exception.CategoryException;
import com.smalaca.view.CategoryView;
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
