package com.example.application.data.service;

import com.example.application.data.entity.Produk;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class ProdukService {
    private final ProdukService repository;

    public ProdukService(ProdukService repository) {
        this.repository = repository;
    }
    public Optional<Produk> get(Long id) {
        return repository.findById(id);
    }

    private Optional<Produk> findById(Long id) {
        return null;
    }
    public Produk update(Produk entity) {
        return repository.save(entity);
    }

    private Produk save(Produk entity) {
        return null;
    }
    public void delete(Long id) {
        repository.deleteById(id);
    }

    private void deleteById(Long id) {
    }
    public Page<Produk> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    private Page<Produk> findAll(Pageable pageable) {
        return null;
    }

    public int count() {
        return (int) repository.count();
    }
}
