package com.smalaca.command.category;

import java.util.UUID;

public interface CategoryRepository {
    UUID save(Category category);
}
