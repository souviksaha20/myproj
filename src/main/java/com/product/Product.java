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
@Table(name="Product")
class Product {

	@Id
	@Column(name="id")
	
	@GeneratedValue (strategy=GenerationType.AUTO)
	int id;
	@Column(name="Name")
	@Size(min = 2,message="name should be atlist 2 character")
    String name;
	@Column(name="Cost")
     float cost;
	@Column(name="Description")
	@Size(min = 2,message="description should be atlist 2 character")
    String description;
	@Column(name="quantity")
	@Min(1)
    int quantity;
	@Column(name="images",columnDefinition="varchar(255)")
	private String image;
	private transient MultipartFile images;
	
	public String  getimage( ) 
	{
		return image;
	}
	public void setimage(String image) {
		this.image = image;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public MultipartFile getImages() {
		return images;
	}
	public void setImages(MultipartFile images) {
		this.images = images;
	}
    
}
