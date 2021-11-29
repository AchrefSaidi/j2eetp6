package com.example.j2eetp6.repositories;

import com.example.j2eetp6.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
    Product findByProdName(final String prodName);
}
