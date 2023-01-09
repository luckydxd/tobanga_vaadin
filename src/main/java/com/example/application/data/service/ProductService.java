package com.example.application.data.service;

import com.example.application.data.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class ProductService {
    private final ProductService repository;

    public ProductService(ProductService repository) {
        this.repository = repository;
    }
    public Optional<Product> get(Long id) {
        return repository.findById(id);
    }

    private Optional<Product> findById(Long id) {
        return null;
    }
    public Product update(Product entity) {
        return repository.save(entity);
    }

    private Product save(Product entity) {
        return null;
    }
    public void delete(Long id) {
        repository.deleteById(id);
    }

    private void deleteById(Long id) {
    }
    public Page<Product> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    private Page<Product> findAll(Pageable pageable) {
        return null;
    }

    public int count() {
        return (int) repository.count();
    }
}
