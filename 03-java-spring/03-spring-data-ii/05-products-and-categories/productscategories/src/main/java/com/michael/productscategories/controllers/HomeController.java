package com.michael.productscategories.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.michael.productscategories.models.Category;
import com.michael.productscategories.models.Product;
import com.michael.productscategories.services.AllService;

@Controller
public class HomeController {
	@Autowired
	private AllService aService;
	
	@GetMapping("/products/new")
	public String newProduct() {
		return "newProduct.jsp";
	}
	@GetMapping("/categories/new")
	public String newCategories() {
		return "newCategory.jsp";
	}
	
	@PostMapping("/newCategory")
	public String makeCategory(@RequestParam("cat") String  category) {
		Category newCategory = new Category();
		newCategory.setName(category);
		this.aService.createCategory(newCategory);
		return "redirect:/categories/new";
	}
	
	@PostMapping("/newProduct")
	public String makeProduct(@RequestParam("product") String  product,@RequestParam("description") String description, @RequestParam("price") Double price) {
		Product makeProduct = new Product(product, description,price);
		makeProduct.setName(product);
		this.aService.createProduct(makeProduct);
		return "redirect:/products/new";
	}
	
	@GetMapping("/{id}")
	public String showProduct(Model viewModel, @PathVariable("id") Long id) {
		Product productToShow = this.aService.getOneProduct(id);
	    viewModel.addAttribute("notInProduct",this.aService.findCategoryNotInProduct(productToShow));
	    viewModel.addAttribute("product", productToShow);
	    return "showProduct.jsp";
	}
	
	@GetMapping("/cat/{id}")
	public String showCategory(Model viewModel, @PathVariable("id") Long id) {
		Category catToShow = this.aService.getOneCategory(id);
		viewModel.addAttribute("notInCat", this.aService.findProductNotInCategory(catToShow));
		viewModel.addAttribute("category", catToShow);
		return "showCategory.jsp";
	}
	
	@PostMapping("/addCategoryToProduct/{id}")
	public String addCategoryToProduct(@RequestParam("cats") Long id, @PathVariable("id") Long productId) {
		Product productToAdd = this.aService.getOneProduct(productId);
		Category categoryToAdd = this.aService.getOneCategory(id);
		this.aService.addCatToProd(productToAdd, categoryToAdd);
		return "redirect:/{id}";
	}
	@PostMapping("/addProductToCategory/{id}")
	public String addProductToCategory(@RequestParam("prod") Long id, @PathVariable("id") Long categoryid ) {
		Category addToProduct = this.aService.getOneCategory(categoryid);
		Product addToCat = this.aService.getOneProduct(id);
		this.aService.addProdToCat(addToProduct, addToCat);
		return "redirect:/cat/{id}";
	}
}
