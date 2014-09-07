package dto.database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	Integer id;
	String userEmail;
	String jawboneHash;
	String venmoHash;
	String phone;
	
	public User() {
		super();
	}
	@Id
	@GeneratedValue
	@Column(name = "ID")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name = "useremail")
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	@Column(name = "jawbonehash")
	public String getJawboneHash() {
		return jawboneHash;
	}
	public void setJawboneHash(String jawboneHash) {
		this.jawboneHash = jawboneHash;
	}
	@Column(name = "venmohash")
	public String getVenmoHash() {
		return venmoHash;
	}
	public void setVenmoHash(String venmoHash) {
		this.venmoHash = venmoHash;
	}
	@Column(name = "phone")
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
