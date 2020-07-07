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
import com.capgemini.productentities.dao.ProductCatalogRepository;
import com.capgemini.productentities.beans.ProdCatalog;
import com.capgemini.productentities.exceptions.ProductEntitiesException;
import com.capgemini.productentities.services.ProdCatalogService;
@RequestMapping("/productcatalog")
@RestController
public class ProdCatalogController {

	@Autowired
	private ProdCatalogService catalogService;
	
	@GetMapping("/allcat")
	public List<ProdCatalog> getAllProductCatalogs(){
		//System.out.println(catalogService.getAllProdCatalogs());
		return catalogService.getAllProdCatalogs();
	}
	
	@PostMapping("/add")
	public List<ProdCatalog> addProductCatalog(@RequestBody ProdCatalog productCatalog){
		return catalogService.addProdCatalog(productCatalog);
	}
	
	
	@DeleteMapping("/delete/{prodCatalogId}")
	public List<ProdCatalog> deleteProductCatalog(@PathVariable int prodCatalogId) throws ProductEntitiesException{
		return catalogService.deleteProdCatalog(prodCatalogId);
	}
	
	
	@PutMapping("/{id}")
	public List<ProdCatalog> updateProductCategory(@PathVariable int id,@RequestBody ProdCatalog productCatalog) throws ProductEntitiesException{
		return catalogService.updateProdCatalog(id,productCatalog);
	}
	
	@GetMapping("/{id}")
	public ProdCatalog getByProdCatalogId(@PathVariable int id) throws ProductEntitiesException
	{
		return catalogService.getByProdCatalogId(id);
	}
}
