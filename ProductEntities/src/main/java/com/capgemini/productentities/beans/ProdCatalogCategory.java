package com.capgemini.productentities.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "PROD_CATALOG_CATEGORY")
//uniqueConstraints = {UniqueConstraint(columnNames = ["prodCatalogCategoryTypeId"])})
@IdClass(ProdCatalogCategory.class)
public class ProdCatalogCategory implements Serializable {
	
	@Id
	@ManyToOne
	@JoinColumn(name = "productCategoryId", insertable = false, updatable = false)
	private ProductCategory productCategory;
	private int productCategoryId;
	@Id
	private int prodCatalogId;
	private int prodCatalogCategoryTypeId;
	private Date fromDate;
	private Date thruDate;
	private int sequenceNum;
	
	
	

	@ManyToOne
	@JoinColumn(name = "prodCatalogId",insertable = false, updatable = false)
	private ProdCatalog prodCatalog;

	
	public int getProductCatagoryId() {
		return productCategoryId;
	}
	public void setProductCatagoryId(int productCatagoryId) {
		this.productCategoryId = productCatagoryId;
	}
	public int getProdCatalogId() {
		return prodCatalogId;
	}
	public void setProdCatalogId(int prodCatalogId) {
		this.prodCatalogId = prodCatalogId;
	}
	public int getProdCatalogCategoryTypeId() {
		return prodCatalogCategoryTypeId;
	}
	public void setProdCatalogCategoryTypeId(int prodCatalogCategoryTypeId) {
		this.prodCatalogCategoryTypeId = prodCatalogCategoryTypeId;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getThruDate() {
		return thruDate;
	}
	public void setThruDate(Date thruDate) {
		this.thruDate = thruDate;
	}
	public int getSequenceNum() {
		return sequenceNum;
	}
	public void setSequenceNum(int sequenceNum) {
		this.sequenceNum = sequenceNum;
	}
	@Override
	public String toString() {
		return "ProdCatalogCategory [productCategoryId=" + productCategoryId + ", prodCatalogId=" + prodCatalogId
				+ ", prodCatalogCategoryTypeId=" + prodCatalogCategoryTypeId + ", fromDate=" + fromDate + ", thruDate="
				+ thruDate + ", sequenceNum=" + sequenceNum + "]";
	}
	
	
	
	

}
