package br.com.uaibusiness.ecommerce.model;
// Generated Nov 24, 2019, 2:33:23 PM by Hibernate Tools 3.6.0.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Brands generated by hbm2java
 */
public class Brands implements java.io.Serializable {

	private int id;
	private String name;
	private Set<BrandModels> brandModelses = new HashSet<BrandModels>(0);

	public Brands() {
	}

	public Brands(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Brands(int id, String name, Set<BrandModels> brandModelses) {
		this.id = id;
		this.name = name;
		this.brandModelses = brandModelses;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<BrandModels> getBrandModelses() {
		return this.brandModelses;
	}

	public void setBrandModelses(Set<BrandModels> brandModelses) {
		this.brandModelses = brandModelses;
	}

}
