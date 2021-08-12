package com.smalaca.rest.product;

import com.smalaca.command.product.ProductFacade;
import com.smalaca.query.product.DetailedProductView;
import com.smalaca.query.product.ProductQueryRepository;
import com.smalaca.query.product.ProductShortView;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductFacade productFacade;
    private final ProductQueryRepository productQueryRepository;

    public ProductController(ProductFacade productFacade, ProductQueryRepository productQueryRepository) {
        this.productFacade = productFacade;
        this.productQueryRepository = productQueryRepository;
    }

    @PostMapping
    public String add(@RequestBody ProductDto productDto) {
        UUID productId = productFacade.add(productDto.asCreateNewProduct());
        return productId.toString();
    }

    @PutMapping("/{id}")
    public void modify(@PathVariable UUID id, @RequestBody ProductDto productDto) {
        productFacade.update(productDto.asUpdateProduct(id));
    }

    @GetMapping
    public List<ProductShortView> findAll() {
        return productQueryRepository.findAll();
    }

    @GetMapping("/{id}")
    public DetailedProductView findById(@PathVariable UUID id) {
        return productQueryRepository.findById(id);
    }
}
