package com.michael.productscategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.michael.productscategories.models.Category;
import com.michael.productscategories.models.Product;

@Repository

public interface ProductRepository extends CrudRepository<Product, Long> {
		List<Product> findAll();
		List<Product> findByCategoriesNotContains(Category category);
}
