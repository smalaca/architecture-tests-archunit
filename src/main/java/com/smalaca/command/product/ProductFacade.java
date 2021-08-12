package com.smalaca.command.product;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ProductFacade {
    private final ProductRepository productRepository;

    public ProductFacade(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public UUID add(CreateNewProductCommand command) {
        Product product = Product.Builder.product()
                .withName(command.getName())
                .withDescription(command.getDescription())
                .withPrice(command.getPrice())
                .build();

        return productRepository.save(product);
    }

    public void update(UpdateProductCommand command) {
        Product product = productRepository.findById(command.getId());

        product.update(command);

        productRepository.save(product);
    }
}
