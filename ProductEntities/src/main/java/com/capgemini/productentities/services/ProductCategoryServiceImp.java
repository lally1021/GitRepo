package com.capgemini.productentities.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.productentities.beans.ProdCatalog;
import com.capgemini.productentities.beans.ProductCategory;
import com.capgemini.productentities.dao.ProductCategoryRepository;
import com.capgemini.productentities.exceptions.ProductEntitiesException;

@Service
public class ProductCategoryServiceImp implements ProductCategoryService {

	@Autowired
    private ProductCategoryRepository catgdao;
	
	@Override
	public List<ProductCategory> getAllProductCategories() {
		return catgdao.findAll();
	}

	@Override
	public List<ProductCategory> addProductCategory(ProductCategory productcategory) {
		catgdao.save(productcategory);
		return getAllProductCategories();
	}

	@Override
	public List<ProductCategory> updateProductCategory(int prodCategoryId, ProductCategory productcategory) {
		if(catgdao.exists(prodCategoryId)) {
			catgdao.save(productcategory);
			}
			return getAllProductCategories();
			
		}

	@Override
	public ProductCategory getByProdCategoryId(int prodCategoryId) {
		return catgdao.findOne(prodCategoryId);
	}

	@Override
	public List<ProductCategory> deleteProdCatalog(int productCategoryId) throws ProductEntitiesException {
		try{
			if(catgdao.exists(productCategoryId)) {
			catgdao.delete(productCategoryId);
			return getAllProductCategories();
		}else {
			throw new ProductEntitiesException("Product with Id: " + productCategoryId + " does not exists.");
		}
	} catch (Exception e) {
		throw new ProductEntitiesException(e.getMessage());
	}
	}
	/*
	 * @Override public List<ProductCategory> deleteProductByCategoryId(int
	 * prodCategoryId) { catgdao.deleteAllByCategoryId(prodCategoryId);
	 * catgdao.delete(prodCategoryId); return getAllProductCategories(); }
	 */
	
	
}
