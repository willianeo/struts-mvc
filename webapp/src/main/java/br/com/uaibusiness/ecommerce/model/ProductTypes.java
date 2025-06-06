package br.com.uaibusiness.ecommerce.model;
// Generated Nov 24, 2019, 2:33:23 PM by Hibernate Tools 3.6.0.Final

import java.util.HashSet;
import java.util.Set;

/**
 * ProductTypes generated by hbm2java
 */
public class ProductTypes implements java.io.Serializable {

	private int id;
	private Categories categories;
	private String name;
	private Set<ProductMOptionValues> productMOptionValueses = new HashSet<ProductMOptionValues>(0);
	private Set<ProductTypeMOptions> productTypeMOptionses = new HashSet<ProductTypeMOptions>(0);
	private Set<BrandModels> brandModelses = new HashSet<BrandModels>(0);
	private Set<Options> optionses = new HashSet<Options>(0);
	private Set<Products> productses = new HashSet<Products>(0);

	public ProductTypes() {
	}

	public ProductTypes(int id, Categories categories, String name) {
		this.id = id;
		this.categories = categories;
		this.name = name;
	}

	public ProductTypes(int id, Categories categories, String name, Set<ProductMOptionValues> productMOptionValueses,
			Set<ProductTypeMOptions> productTypeMOptionses, Set<BrandModels> brandModelses, Set<Options> optionses,
			Set<Products> productses) {
		this.id = id;
		this.categories = categories;
		this.name = name;
		this.productMOptionValueses = productMOptionValueses;
		this.productTypeMOptionses = productTypeMOptionses;
		this.brandModelses = brandModelses;
		this.optionses = optionses;
		this.productses = productses;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Categories getCategories() {
		return this.categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<ProductMOptionValues> getProductMOptionValueses() {
		return this.productMOptionValueses;
	}

	public void setProductMOptionValueses(Set<ProductMOptionValues> productMOptionValueses) {
		this.productMOptionValueses = productMOptionValueses;
	}

	public Set<ProductTypeMOptions> getProductTypeMOptionses() {
		return this.productTypeMOptionses;
	}

	public void setProductTypeMOptionses(Set<ProductTypeMOptions> productTypeMOptionses) {
		this.productTypeMOptionses = productTypeMOptionses;
	}

	public Set<BrandModels> getBrandModelses() {
		return this.brandModelses;
	}

	public void setBrandModelses(Set<BrandModels> brandModelses) {
		this.brandModelses = brandModelses;
	}

	public Set<Options> getOptionses() {
		return this.optionses;
	}

	public void setOptionses(Set<Options> optionses) {
		this.optionses = optionses;
	}

	public Set<Products> getProductses() {
		return this.productses;
	}

	public void setProductses(Set<Products> productses) {
		this.productses = productses;
	}

}
