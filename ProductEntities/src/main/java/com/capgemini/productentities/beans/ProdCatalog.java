package com.capgemini.productentities.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "PROD_CATALOG")
public class ProdCatalog {
	
	@Id
	@GeneratedValue
	private int prodCatalogId;
	@OneToMany(mappedBy="prodCatalog", cascade = CascadeType.ALL)
	private List<ProdCatalogCategory> ProdCatalogCategory;
	
	private String catalogName;
	private String useQuickAdd;
	private String styloSheet;
	private String hederLogo;
	public ProdCatalog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProdCatalog(int prodCatalogId,
			List<com.capgemini.productentities.beans.ProdCatalogCategory> prodCatalogCategory, String catalogName,
			String useQuickAdd, String styloSheet, String hederLogo) {
		super();
		this.prodCatalogId = prodCatalogId;
		ProdCatalogCategory = prodCatalogCategory;
		this.catalogName = catalogName;
		this.useQuickAdd = useQuickAdd;
		this.styloSheet = styloSheet;
		this.hederLogo = hederLogo;
	}
	public int getProdCatalogId() {
		return prodCatalogId;
	}
	public void setProdCatalogId(int prodCatalogId) {
		this.prodCatalogId = prodCatalogId;
	}
	public List<ProdCatalogCategory> getProdCatalogCategory() {
		return ProdCatalogCategory;
	}
	public void setProdCatalogCategory(List<ProdCatalogCategory> prodCatalogCategory) {
		ProdCatalogCategory = prodCatalogCategory;
	}
	public String getCatalogName() {
		return catalogName;
	}
	public void setCatalogName(String catalogName) {
		this.catalogName = catalogName;
	}
	public String getUseQuickAdd() {
		return useQuickAdd;
	}
	public void setUseQuickAdd(String useQuickAdd) {
		this.useQuickAdd = useQuickAdd;
	}
	public String getStyloSheet() {
		return styloSheet;
	}
	public void setStyloSheet(String styloSheet) {
		this.styloSheet = styloSheet;
	}
	public String getHederLogo() {
		return hederLogo;
	}
	public void setHederLogo(String hederLogo) {
		this.hederLogo = hederLogo;
	}
	@Override
	public String toString() {
		return "ProdCatalog [prodCatalogId=" + prodCatalogId + ", ProdCatalogCategory=" + ProdCatalogCategory
				+ ", catalogName=" + catalogName + ", useQuickAdd=" + useQuickAdd + ", styloSheet=" + styloSheet
				+ ", hederLogo=" + hederLogo + "]";
	}
	
}
