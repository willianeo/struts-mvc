package br.com.uaibusiness.ecommerce.model;
// Generated Nov 24, 2019, 2:33:23 PM by Hibernate Tools 3.6.0.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Options generated by hbm2java
 */
public class Options implements java.io.Serializable {

	private int id;
	private ProductTypes productTypes;
	private String name;
	private Set<ProductOptionValues> productOptionValueses = new HashSet<ProductOptionValues>(0);
	private Set<OptionValues> optionValueses = new HashSet<OptionValues>(0);

	public Options() {
	}

	public Options(int id, ProductTypes productTypes, String name) {
		this.id = id;
		this.productTypes = productTypes;
		this.name = name;
	}

	public Options(int id, ProductTypes productTypes, String name, Set<ProductOptionValues> productOptionValueses,
			Set<OptionValues> optionValueses) {
		this.id = id;
		this.productTypes = productTypes;
		this.name = name;
		this.productOptionValueses = productOptionValueses;
		this.optionValueses = optionValueses;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ProductTypes getProductTypes() {
		return this.productTypes;
	}

	public void setProductTypes(ProductTypes productTypes) {
		this.productTypes = productTypes;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<ProductOptionValues> getProductOptionValueses() {
		return this.productOptionValueses;
	}

	public void setProductOptionValueses(Set<ProductOptionValues> productOptionValueses) {
		this.productOptionValueses = productOptionValueses;
	}

	public Set<OptionValues> getOptionValueses() {
		return this.optionValueses;
	}

	public void setOptionValueses(Set<OptionValues> optionValueses) {
		this.optionValueses = optionValueses;
	}

}
