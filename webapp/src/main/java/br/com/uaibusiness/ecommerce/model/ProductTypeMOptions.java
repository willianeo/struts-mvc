package br.com.uaibusiness.ecommerce.model;
// Generated Nov 24, 2019, 12:12:18 AM by Hibernate Tools 3.6.0.Final

/**
 * ProductTypeMOptions generated by hbm2java
 */
public class ProductTypeMOptions implements java.io.Serializable {

	private int id;
	private Integer productTypeId;
	private Integer MOptionId;
	private Integer MOptionValueId;

	public ProductTypeMOptions() {
	}

	public ProductTypeMOptions(int id) {
		this.id = id;
	}

	public ProductTypeMOptions(int id, Integer productTypeId, Integer MOptionId, Integer MOptionValueId) {
		this.id = id;
		this.productTypeId = productTypeId;
		this.MOptionId = MOptionId;
		this.MOptionValueId = MOptionValueId;
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

	public Integer getMOptionValueId() {
		return this.MOptionValueId;
	}

	public void setMOptionValueId(Integer MOptionValueId) {
		this.MOptionValueId = MOptionValueId;
	}

}
