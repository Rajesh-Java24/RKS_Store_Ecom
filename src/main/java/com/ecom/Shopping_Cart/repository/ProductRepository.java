package com.ecom.Shopping_Cart.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.Shopping_Cart.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    // Fetch all active products
    List<Product> findByIsActiveTrue();

    // Fetch products by category
    List<Product> findByCategory(String category);
    
    // Fetch products by title or category containing a search term, case insensitive
    List<Product> findByTitleContainingIgnoreCaseOrCategoryContainingIgnoreCase(String ch, String ch2);

    // Fetch active products with pagination
    Page<Product> findByIsActiveTrue(Pageable pageable);

    // Fetch products by category with pagination
    Page<Product> findByCategory(Pageable pageable, String category);

	Page<Product> findByTitleContainingIgnoreCaseOrCategoryContainingIgnoreCase(String ch, String ch2, Pageable pageable);

	Page<Product> findByisActiveTrueAndTitleContainingIgnoreCaseOrCategoryContainingIgnoreCase(String ch, String ch2,
			Pageable pageable);
}
