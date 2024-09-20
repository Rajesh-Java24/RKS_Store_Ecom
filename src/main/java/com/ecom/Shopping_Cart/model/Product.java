package com.ecom.Shopping_Cart.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(length=500)
	private String title;
	
	@Column(length=5000)
	private String description;
	
	private String category;
	
	private Double price;
	
	private int stock;
	
	private String image;
	
	private int discount;
	
	private Double discountPrice;
	
	private Boolean isActive;

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getCategory() {
		return category;
	}

	public Double getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}

	public String getImage() {
		return image;
	}

	public int getDiscount() {
		return discount;
	}

	public Double getDiscountPrice() {
		return discountPrice;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public void setDiscountPrice(Double discountPrice) {
		this.discountPrice = discountPrice;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	

	
}
