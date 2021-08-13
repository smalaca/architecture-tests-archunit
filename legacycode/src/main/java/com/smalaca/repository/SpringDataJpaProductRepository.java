package com.smalaca.repository;

import com.smalaca.entity.Product;
import com.smalaca.readmodel.ProductReadModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
interface SpringDataJpaProductRepository extends CrudRepository<Product, UUID> {
    @Query("SELECT new com.smalaca.readmodel.ProductReadModel(id, name, description, price) FROM Product")
    List<ProductReadModel> findAllProducts();

    Optional<ProductReadModel> findProductById(UUID id);
}
