package com.inacioturist.secondproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inacioturist.secondproject.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
