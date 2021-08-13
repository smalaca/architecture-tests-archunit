package com.smalaca.persistency.product;

import com.smalaca.command.product.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
interface SpringDataJpaProductRepository extends CrudRepository<Product, UUID> {
    @Query("SELECT new com.smalaca.persistency.product.ProductReadModel(id, name, description, price) FROM Product")
    List<ProductReadModel> findAllProducts();

    Optional<ProductReadModel> findProductById(UUID id);
}
