package br.com.uaibusiness.ecommerce.model;
// Generated Nov 24, 2019, 12:58:01 AM by Hibernate Tools 3.6.0.Final

/**
 * OptionValues generated by hbm2java
 */
public class OptionValues implements java.io.Serializable {

	private int id;
	private Integer optionId;

	public OptionValues() {
	}

	public OptionValues(int id) {
		this.id = id;
	}

	public OptionValues(int id, Integer optionId) {
		this.id = id;
		this.optionId = optionId;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getOptionId() {
		return this.optionId;
	}

	public void setOptionId(Integer optionId) {
		this.optionId = optionId;
	}

}
