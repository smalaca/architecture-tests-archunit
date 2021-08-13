package com.smalaca.repository;

import com.smalaca.entity.Category;
import com.smalaca.view.CategoryView;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
interface SpringDataJpaCategoryRepository extends CrudRepository<Category, UUID> {
    @Query("SELECT new com.smalaca.view.CategoryView(id, name) FROM Category")
    List<CategoryView> findAllCategories();

    Optional<CategoryView> findCategoryById(UUID id);
}
