package com.smalaca.persistency.category;

import com.smalaca.command.category.Category;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
interface SpringDataJpaCategoryRepository extends CrudRepository<Category, UUID> {
    @Query("SELECT new com.smalaca.persistency.category.CategoryReadModel(id, name) FROM Category")
    List<CategoryReadModel> findAllCategories();

    Optional<CategoryReadModel> findCategoryById(UUID id);
}
