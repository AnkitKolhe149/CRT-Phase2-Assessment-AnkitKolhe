package com.question;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface Q7_ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p WHERE p.price < :price AND p.category = :category")
    List<Product> findByPriceLessThanAndCategory(
            @Param("price") double price,
            @Param("category") String category
    );
}
