package br.com.uaibusiness.ecommerce.model;
// Generated Nov 24, 2019, 2:33:23 PM by Hibernate Tools 3.6.0.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Shops generated by hbm2java
 */
public class Shops implements java.io.Serializable {

	private int id;
	private Markets markets;
	private String name;
	private String address;
	private int productTypesCount;
	private int productsCount;
	private int views;
	private String photo;
	private byte status;
	private Set<Admins> adminses = new HashSet<Admins>(0);
	private Set<Products> productses = new HashSet<Products>(0);

	public Shops() {
	}

	public Shops(int id, Markets markets, String name, String address, int productTypesCount, int productsCount,
			int views, String photo, byte status) {
		this.id = id;
		this.markets = markets;
		this.name = name;
		this.address = address;
		this.productTypesCount = productTypesCount;
		this.productsCount = productsCount;
		this.views = views;
		this.photo = photo;
		this.status = status;
	}

	public Shops(int id, Markets markets, String name, String address, int productTypesCount, int productsCount,
			int views, String photo, byte status, Set<Admins> adminses, Set<Products> productses) {
		this.id = id;
		this.markets = markets;
		this.name = name;
		this.address = address;
		this.productTypesCount = productTypesCount;
		this.productsCount = productsCount;
		this.views = views;
		this.photo = photo;
		this.status = status;
		this.adminses = adminses;
		this.productses = productses;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Markets getMarkets() {
		return this.markets;
	}

	public void setMarkets(Markets markets) {
		this.markets = markets;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getProductTypesCount() {
		return this.productTypesCount;
	}

	public void setProductTypesCount(int productTypesCount) {
		this.productTypesCount = productTypesCount;
	}

	public int getProductsCount() {
		return this.productsCount;
	}

	public void setProductsCount(int productsCount) {
		this.productsCount = productsCount;
	}

	public int getViews() {
		return this.views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public Set<Admins> getAdminses() {
		return this.adminses;
	}

	public void setAdminses(Set<Admins> adminses) {
		this.adminses = adminses;
	}

	public Set<Products> getProductses() {
		return this.productses;
	}

	public void setProductses(Set<Products> productses) {
		this.productses = productses;
	}

}
