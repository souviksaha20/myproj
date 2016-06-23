package com.product;
import java.beans.Transient;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.springframework.web.multipart.MultipartFile;

import com.sun.istack.internal.NotNull;

@Entity
@Table(name="user")
public class User 
{
	@Id
	@Column(name="id")
	@GeneratedValue (strategy=GenerationType.AUTO)
	int id;
	@Column(name="Name")
	@Size(min = 2,message="name should be atlist 2 character")
	private
    String name;
	@Column(name="Phone")
	@Size(min=10,max=11,message="please enter the write phone number")
	private
    long p;
	@Column(name="password")
	@Size(min=6,message="please enter the password")
	private
    String password;
	@Column(name="Enabled")
	@Size(min=2,message="chose the right thing")
	private
    String Enabled;
	@Column(name="role")
	@Size(min=2,message="chose the right role")
	private
    String role;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getP() {
		return p;
	}
	public void setP(long p) {
		this.p = p;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEnabled() {
		return Enabled;
	}
	public void setEnabled(String enabled) {
		Enabled = enabled;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
  


}
