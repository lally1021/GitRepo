package com.capgemini.productentities.services;

import java.util.List;

import com.capgemini.productentities.beans.ProdCatalog;
import com.capgemini.productentities.exceptions.ProductEntitiesException;



public interface ProdCatalogService {
	ProdCatalog getByProdCatalogId(int prodCatalogId);
	List<ProdCatalog> getAllProdCatalogs();
  List<ProdCatalog> addProdCatalog(ProdCatalog productCatalog);
    List<ProdCatalog> updateProdCatalog(int prodCatalogId,ProdCatalog productCatalog);
    public void deleteProdByCatalog(ProdCatalog productCatalog) ;
	List<ProdCatalog> deleteProdCatalog(int prodCatalogId) throws ProductEntitiesException;
    

}
