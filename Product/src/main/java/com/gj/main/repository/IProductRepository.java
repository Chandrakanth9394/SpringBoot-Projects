package com.gj.main.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gj.main.model.Product;


public interface IProductRepository extends JpaRepository<Product, UUID>{

}
