package com.michael.productscategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michael.productscategories.models.Category;
import com.michael.productscategories.models.Product;
import com.michael.productscategories.repositories.CategoryRepository;
import com.michael.productscategories.repositories.ProductRepository;

@Service
public class AllService {
	@Autowired
	private ProductRepository pRepo;
	@Autowired
	private CategoryRepository cRepo;
	
	public Product createProduct(Product product) {
		return this.pRepo.save(product);
	}
	public Category createCategory(Category category) {
		return this.cRepo.save(category);
	}
	public Category getOneCategory(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
	
	public Product getOneProduct(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	public List<Category> findCategoryNotInProduct(Product product){
		return this.cRepo.findByProductsNotContains(product);
	}
	public List<Product> findProductNotInCategory(Category category){
		return this.pRepo.findByCategoriesNotContains(category);
	}
	
	public void addCatToProd(Product product, Category category) {
		List<Category> existingCats = product.getCategories();
		existingCats.add(category);
		this.pRepo.save(product);
	}
	
	public void addProdToCat(Category category, Product product ) {
		List<Product> exisitingProd = category.getProducts();
		exisitingProd.add(product);
		this.cRepo.save(category);
	}

}
