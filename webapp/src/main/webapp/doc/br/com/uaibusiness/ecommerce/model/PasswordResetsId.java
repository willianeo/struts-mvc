package br.com.uaibusiness.ecommerce.model;
// Generated Nov 24, 2019, 12:58:01 AM by Hibernate Tools 3.6.0.Final

/**
 * PasswordResetsId generated by hbm2java
 */
public class PasswordResetsId implements java.io.Serializable {

	private String email;
	private String token;

	public PasswordResetsId() {
	}

	public PasswordResetsId(String email, String token) {
		this.email = email;
		this.token = token;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PasswordResetsId))
			return false;
		PasswordResetsId castOther = (PasswordResetsId) other;

		return ((this.getEmail() == castOther.getEmail()) || (this.getEmail() != null && castOther.getEmail() != null
				&& this.getEmail().equals(castOther.getEmail())))
				&& ((this.getToken() == castOther.getToken()) || (this.getToken() != null
						&& castOther.getToken() != null && this.getToken().equals(castOther.getToken())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getEmail() == null ? 0 : this.getEmail().hashCode());
		result = 37 * result + (getToken() == null ? 0 : this.getToken().hashCode());
		return result;
	}

}
