package com.example.application.data.service;

import com.example.application.data.entity.Produk;
import com.example.application.data.entity.SamplePerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProdukRepository extends JpaRepository<Produk, Long>,
        JpaSpecificationExecutor<Produk> {
}
