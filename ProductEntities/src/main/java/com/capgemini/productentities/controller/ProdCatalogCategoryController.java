package com.capgemini.productentities.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.productentities.beans.ProdCatalog;
import com.capgemini.productentities.beans.ProdCatalogCategory;
import com.capgemini.productentities.beans.ProductCategory;
import com.capgemini.productentities.exceptions.ProductEntitiesException;
import com.capgemini.productentities.services.ProdCatalogCategoryService;

//@CrossOrigin("*")
@RequestMapping("/prodcatalogcatg")
@RestController
public class ProdCatalogCategoryController {
	
	@Autowired
	private ProdCatalogCategoryService catcatgService;
	
	@GetMapping("/pc")
	public List<ProdCatalog> getAllProductCatalogs(){
		System.out.println(catcatgService.getAllProductCatalogs());
		return catcatgService.getAllProductCatalogs();
	}
	
	@GetMapping("/{id}")
	public ProdCatalog getByProdCatalogId(@PathVariable int id) throws ProductEntitiesException
	{
		return catcatgService.getByProdCatalogId(id);
	}
	
	@GetMapping("/pcg")
	public List<ProductCategory> getAllProductCategories(){
		System.out.println(catcatgService.getAllProductCategories());
		return catcatgService.getAllProductCategories();
	}
	
	@GetMapping("/pcg/{id}")
	public ProductCategory getByProdCategoryId(@PathVariable int id) throws ProductEntitiesException
	{
		return catcatgService.getByProdCategoryId(id);
	}
	
	@DeleteMapping("/delete/{prodCatalogId}")
	public List<ProdCatalog> deleteProductCatalog(@PathVariable int prodCatalogId) throws ProductEntitiesException{
		return catcatgService.deleteProdCatalog(prodCatalogId);
	}
	

	@DeleteMapping("/delete/{productCategoryId}")
	public List<ProductCategory> deleteProductCategory(@PathVariable int productCategoryId) throws ProductEntitiesException{
		return catcatgService.deleteProdCategory(productCategoryId);
	}

}
