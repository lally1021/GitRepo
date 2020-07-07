package com.capgemini.productentities.services;

import java.util.List;

import com.capgemini.productentities.beans.ProdCatalog;
import com.capgemini.productentities.beans.ProductCategory;
import com.capgemini.productentities.exceptions.ProductEntitiesException;

public interface ProductCategoryService {

	List<ProductCategory> getAllProductCategories();
    List<ProductCategory> addProductCategory(ProductCategory productcategory);
    List<ProductCategory> updateProductCategory(int prodCategoryId,ProductCategory productcategory);
    ProductCategory getByProdCategoryId(int prodCategoryId);
	List<ProductCategory> deleteProdCatalog(int productCategoryId) throws ProductEntitiesException;
}
