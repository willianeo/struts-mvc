package br.com.uaibusiness.ecommerce.model;
// Generated Nov 24, 2019, 12:12:18 AM by Hibernate Tools 3.6.0.Final

/**
 * ProductOptionValues generated by hbm2java
 */
public class ProductOptionValues implements java.io.Serializable {

	private int id;
	private Integer productId;
	private Integer optionId;
	private Integer optionValueId;

	public ProductOptionValues() {
	}

	public ProductOptionValues(int id) {
		this.id = id;
	}

	public ProductOptionValues(int id, Integer productId, Integer optionId, Integer optionValueId) {
		this.id = id;
		this.productId = productId;
		this.optionId = optionId;
		this.optionValueId = optionValueId;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getOptionId() {
		return this.optionId;
	}

	public void setOptionId(Integer optionId) {
		this.optionId = optionId;
	}

	public Integer getOptionValueId() {
		return this.optionValueId;
	}

	public void setOptionValueId(Integer optionValueId) {
		this.optionValueId = optionValueId;
	}

}
