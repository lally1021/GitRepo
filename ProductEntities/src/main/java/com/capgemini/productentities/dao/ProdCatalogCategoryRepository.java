package com.capgemini.productentities.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.productentities.beans.ProdCatalogCategory;

@Repository

public interface ProdCatalogCategoryRepository extends JpaRepository<ProdCatalogCategory, Integer> {

	//List<ProdCatalogCategory> deleteAllByCategoryId(int prodCategoryId);

}
