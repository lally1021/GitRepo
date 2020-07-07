package com.capgemini.productentities.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.productentities.beans.ProductCategory;

@Repository

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

	//List<ProductCategory>  deleteAllByCategoryId(int prodCategoryId);


}
