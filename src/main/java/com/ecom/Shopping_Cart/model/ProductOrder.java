package com.ecom.Shopping_Cart.model;

import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProductOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String orderId;

	private LocalDate orderDate;

	@ManyToOne
	private Product product;

	private Double price;

	private Integer quantity;

	@ManyToOne
	private UserDtls user;

	private String status;

	private String paymentType;

	@OneToOne(cascade = CascadeType.ALL)
	private OrderAddress orderAddress;

	public Integer getId() {
		return id;
	}

	public String getOrderId() {
		return orderId;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public Product getProduct() {
		return product;
	}

	public Double getPrice() {
		return price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public UserDtls getUser() {
		return user;
	}

	public String getStatus() {
		return status;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public OrderAddress getOrderAddress() {
		return orderAddress;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public void setOrderDate(LocalDate localDate) {
		this.orderDate = localDate;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public void setUser(UserDtls user) {
		this.user = user;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public void setOrderAddress(OrderAddress orderAddress) {
		this.orderAddress = orderAddress;
	}
	
	
}
