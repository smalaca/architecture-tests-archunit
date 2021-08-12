package com.smalaca.persistency.product;

import com.smalaca.command.product.Product;
import com.smalaca.command.product.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class SpringDataProductRepository implements ProductRepository {
    private final SpringDataJpaProductRepository repository;

    SpringDataProductRepository(SpringDataJpaProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public UUID save(Product product) {
        return repository.save(product).getId();
    }

    @Override
    public Product findById(UUID id) {
        return repository.findById(id).orElseThrow(() -> ProductException.notFound(id));
    }

    public List<ProductReadModel> findAll() {
        return repository.findAllProducts();
    }

    public ProductReadModel findProductById(UUID id) {
        return repository.findProductById(id).orElseThrow(() -> ProductException.notFound(id));
    }
}
