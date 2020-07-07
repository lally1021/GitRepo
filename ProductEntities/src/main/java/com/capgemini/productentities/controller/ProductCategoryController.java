package com.capgemini.productentities.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.productentities.beans.ProdCatalog;
import com.capgemini.productentities.beans.ProductCategory;
import com.capgemini.productentities.exceptions.ProductEntitiesException;
import com.capgemini.productentities.services.ProductCategoryService;


@RequestMapping("/productcategory")
@RestController
public class ProductCategoryController {
	
	@Autowired
	 private ProductCategoryService catgService;
	
	@GetMapping("/allcatg")
	public List<ProductCategory> getAllProductCategories(){
		//System.out.println(catgService.getAllProductCategories());
		return catgService.getAllProductCategories();
	}
	
	@PostMapping("/addpc")
	public List<ProductCategory> addProductCategory(@RequestBody ProductCategory productCategory){
		//System.out.println(productCategory);
		return catgService.addProductCategory(productCategory);
	}
	
	
	@DeleteMapping("/delete/{productCategoryId}")
	public List<ProductCategory> deleteProductCatalog(@PathVariable int productCategoryId) throws ProductEntitiesException{
		return catgService.deleteProdCatalog(productCategoryId);
	}


	
	@PutMapping("/{id}")
	public List<ProductCategory> updateProductCategory(@PathVariable int id,@RequestBody ProductCategory productCategory) throws ProductEntitiesException{
		return catgService.updateProductCategory(id,productCategory);
	}
	
	@GetMapping("/{id}")
	public ProductCategory getByProdCategoryId(@PathVariable int id) throws ProductEntitiesException
	{
		return catgService.getByProdCategoryId(id);
	}
}
