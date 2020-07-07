package com.capgemini.productentities.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.productentities.beans.ProdCatalog;
import com.capgemini.productentities.dao.ProductCatalogRepository;
import com.capgemini.productentities.exceptions.ProductEntitiesException;

@Service
public class ProdCatalogServiceImp implements ProdCatalogService {

	@Autowired
    private ProductCatalogRepository catdao;
	
	
	@Override
	public List<ProdCatalog> getAllProdCatalogs() {
		return catdao.findAll();
	}

	@Override
	public List<ProdCatalog> addProdCatalog(ProdCatalog productcatalog) {
		catdao.save(productcatalog);
		return getAllProdCatalogs();
	}

	@Override
	public List<ProdCatalog> updateProdCatalog(int prodCatalogId, ProdCatalog productCatalog) {
		if(catdao.exists(prodCatalogId)) {
			catdao.save(productCatalog);
			}
			return getAllProdCatalogs();
			
		}

	@Override
	public ProdCatalog getByProdCatalogId(int prodCatalogId) {
		return catdao.findOne(prodCatalogId);
	}

	@Override
	public List<ProdCatalog> deleteProdCatalog(int prodCatalogId) throws ProductEntitiesException {
		try{
			if(catdao.exists(prodCatalogId)) {
			catdao.delete(prodCatalogId);
			return getAllProdCatalogs();
		}else {
			throw new ProductEntitiesException("Product with Id: " + prodCatalogId + " does not exists.");
		}
	} catch (Exception e) {
		throw new ProductEntitiesException(e.getMessage());
	}
	}

	@Override
	public void deleteProdByCatalog(ProdCatalog productCatalog) {
		// TODO Auto-generated method stub
		
	}

}
