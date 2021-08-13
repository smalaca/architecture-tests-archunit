package com.smalaca.command.category;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Category {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    private Category() {}

    Category(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }
}
