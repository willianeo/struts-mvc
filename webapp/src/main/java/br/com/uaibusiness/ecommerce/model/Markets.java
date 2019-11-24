package br.com.uaibusiness.ecommerce.model;
// Generated Nov 24, 2019, 12:12:18 AM by Hibernate Tools 3.6.0.Final

/**
 * Markets generated by hbm2java
 */
public class Markets implements java.io.Serializable {

	private int id;
	private String name;
	private String address;
	private int shopsCount;
	private int productsCount;
	private String photo;
	private byte status;

	public Markets() {
	}

	public Markets(int id, String name, String address, int shopsCount, int productsCount, String photo, byte status) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.shopsCount = shopsCount;
		this.productsCount = productsCount;
		this.photo = photo;
		this.status = status;
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

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getShopsCount() {
		return this.shopsCount;
	}

	public void setShopsCount(int shopsCount) {
		this.shopsCount = shopsCount;
	}

	public int getProductsCount() {
		return this.productsCount;
	}

	public void setProductsCount(int productsCount) {
		this.productsCount = productsCount;
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

}
