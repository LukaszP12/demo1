package edu.pjwstk.sri.lab2.dto;

import edu.pjwstk.sri.lab2.model.Product;

import java.io.Serializable;

public class OrderItem implements Serializable {
	private Product product;
	private Integer amount;
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
}
