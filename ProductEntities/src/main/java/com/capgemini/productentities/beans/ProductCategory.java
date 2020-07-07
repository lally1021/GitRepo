package com.capgemini.productentities.beans;


import java.util.List;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT_CATEGORY")
//,uniqueConstraints = {UniqueConstraint(columnNames = ["prodCatalogCategoryTypeId"])})
public class ProductCategory {

	@Id
	@GeneratedValue
	private int productCategoryId;
	private int productCategoryTypeId;
	private int primaryParentCategoryId;
	private String categoryName;
	private String description;
	
	@OneToMany(mappedBy="productCategory", cascade = CascadeType.ALL)
	private List<ProdCatalogCategory> ProdCatalogCategory;
	
	public ProductCategory() {
		super();
	}


	public int getProductCategoryId() {
		return productCategoryId;
	}


	public void setProductCategoryId(int productCategoryId) {
		this.productCategoryId = productCategoryId;
	}


	public int getProductCategoryTypeId() {
		return productCategoryTypeId;
	}


	public void setProductCategoryTypeId(int productCategoryTypeId) {
		this.productCategoryTypeId = productCategoryTypeId;
	}


	public int getPrimaryParentCategoryId() {
		return primaryParentCategoryId;
	}


	public void setPrimaryParentCategoryId(int primaryParentCategoryId) {
		this.primaryParentCategoryId = primaryParentCategoryId;
	}


	public String getCategoryName() {
		return categoryName;
	}


	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	@Override
	public String toString() {
		return "ProductCategory [productCategoryId=" + productCategoryId + ", productCategoryTypeId="
				+ productCategoryTypeId + ", primaryParentCategoryId=" + primaryParentCategoryId + ", categoryName="
				+ categoryName + ", description=" + description + "]";
	}
	
}
