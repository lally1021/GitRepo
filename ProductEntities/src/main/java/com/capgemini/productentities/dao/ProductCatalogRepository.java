package com.capgemini.productentities.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.capgemini.productentities.beans.ProdCatalog;


@Repository

public interface ProductCatalogRepository extends JpaRepository<ProdCatalog, Integer> {

	//List<ProdCatalog> deleteAllByProdCatalogId(int prodCatlogId);


}
