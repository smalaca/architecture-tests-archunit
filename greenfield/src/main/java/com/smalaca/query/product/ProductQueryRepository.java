package com.smalaca.query.product;

import com.smalaca.persistency.product.SpringDataProductRepository;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class ProductQueryRepository {
    private final SpringDataProductRepository repository;

    public ProductQueryRepository(SpringDataProductRepository repository) {
        this.repository = repository;
    }

    public List<ProductShortView> findAll() {
        return repository.findAll().stream()
                .map(ProductShortView::new)
                .collect(Collectors.toList());
    }

    public DetailedProductView findById(UUID id) {
        return new DetailedProductView(repository.findProductById(id));
    }
}
