package com.smalaca.rest.category;

import com.smalaca.command.category.CategoryFacade;
import com.smalaca.query.category.CategoryQueryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/category")
public class CategoryController {
    private final CategoryFacade categoryFacade;
    private final CategoryQueryRepository categoryQueryRepository;

    public CategoryController(CategoryFacade categoryFacade, CategoryQueryRepository categoryQueryRepository) {
        this.categoryFacade = categoryFacade;
        this.categoryQueryRepository = categoryQueryRepository;
    }

    @PostMapping
    public String add(@RequestBody CategoryDto dto) {
        UUID id = categoryFacade.add(dto.getName());
        return id.toString();
    }

    @GetMapping
    public List<CategoryDto> findAll() {
        return categoryQueryRepository.findAll().stream()
                .map(CategoryDto::new)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public CategoryDto findById(@PathVariable UUID id) {
        return new CategoryDto(categoryQueryRepository.findById(id));
    }
}
