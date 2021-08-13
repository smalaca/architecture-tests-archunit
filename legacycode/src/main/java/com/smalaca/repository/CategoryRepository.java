package com.smalaca.repository;

import com.smalaca.entity.Category;

import java.util.UUID;

public interface CategoryRepository {
    UUID save(Category category);
}
