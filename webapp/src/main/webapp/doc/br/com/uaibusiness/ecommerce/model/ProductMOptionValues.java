package br.com.uaibusiness.ecommerce.model;
// Generated Nov 24, 2019, 12:58:01 AM by Hibernate Tools 3.6.0.Final

/**
 * ProductMOptionValues generated by hbm2java
 */
public class ProductMOptionValues implements java.io.Serializable {

	private int id;
	private Integer productTypeId;
	private Integer MOptionId;

	public ProductMOptionValues() {
	}

	public ProductMOptionValues(int id) {
		this.id = id;
	}

	public ProductMOptionValues(int id, Integer productTypeId, Integer MOptionId) {
		this.id = id;
		this.productTypeId = productTypeId;
		this.MOptionId = MOptionId;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getProductTypeId() {
		return this.productTypeId;
	}

	public void setProductTypeId(Integer productTypeId) {
		this.productTypeId = productTypeId;
	}

	public Integer getMOptionId() {
		return this.MOptionId;
	}

	public void setMOptionId(Integer MOptionId) {
		this.MOptionId = MOptionId;
	}

}
