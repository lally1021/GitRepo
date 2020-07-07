package com.capgemini.productentities.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.productentities.beans.ProdCatalogCategory;
import com.capgemini.productentities.beans.ProdCatalog;
import com.capgemini.productentities.beans.ProductCategory;
import com.capgemini.productentities.dao.ProdCatalogCategoryRepository;
import com.capgemini.productentities.dao.ProductCatalogRepository;
import com.capgemini.productentities.dao.ProductCategoryRepository;
import com.capgemini.productentities.exceptions.ProductEntitiesException;
@Service
public class ProdCatalogCategoryServiceImp implements ProdCatalogCategoryService {

	@Autowired
    private ProdCatalogCategoryRepository proddao;

	@Autowired
    private ProductCategoryRepository catgdao;
	
	@Autowired
    private ProductCatalogRepository catdao;
	
	@Override
	public List<ProdCatalog> getAllProductCatalogs() {
		return catdao.findAll();
	}

	@Override
	public ProdCatalog getByProdCatalogId(int prodCatalogId) {
	return catdao.findOne(prodCatalogId);
	}

	@Override
	public List<ProductCategory> getAllProductCategories() {
		return catgdao.findAll();
	}

	@Override
	public ProductCategory getByProdCategoryId(int prodCategoryId) {
		return catgdao.findOne(prodCategoryId);
	}

	@Override
	public List<ProdCatalog> deleteProdCatalog(int prodCatalogId) throws ProductEntitiesException {
		try{
			if(catdao.exists(prodCatalogId)) {
				catdao.delete(prodCatalogId);
			return getAllProductCatalogs();
		}else {
			throw new ProductEntitiesException("Product with Id: " + prodCatalogId + " does not exists.");
		}
	} catch (Exception e) {
		throw new ProductEntitiesException(e.getMessage());
	}
	}

	@Override
	public List<ProductCategory> deleteProdCategory(int productCategoryId) throws ProductEntitiesException {
		try{
			if(proddao.exists(productCategoryId)) {
				proddao.delete(productCategoryId);
			return getAllProductCategories();
		}else {
			throw new ProductEntitiesException("Product with Id: " + productCategoryId + " does not exists.");
		}
	} catch (Exception e) {
		throw new ProductEntitiesException(e.getMessage());
	}
	}

}
