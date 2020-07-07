package com.capgemini.productentities.services;

import java.util.List;

import com.capgemini.productentities.beans.ProdCatalogCategory;
import com.capgemini.productentities.beans.ProdCatalog;
import com.capgemini.productentities.beans.ProductCategory;
import com.capgemini.productentities.exceptions.ProductEntitiesException;

public interface ProdCatalogCategoryService {
	List<ProdCatalog> getAllProductCatalogs();
	ProdCatalog getByProdCatalogId(int prodCatalogId);
	List<ProdCatalog> deleteProdCatalog(int prodCatalogId) throws ProductEntitiesException;
	
	List<ProductCategory> getAllProductCategories();
	ProductCategory getByProdCategoryId(int prodCategoryId);
	List<ProductCategory> deleteProdCategory(int productCategoryId)throws ProductEntitiesException;

}
