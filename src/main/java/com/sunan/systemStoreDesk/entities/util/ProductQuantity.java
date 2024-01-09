package com.sunan.systemStoreDesk.entities.util;

import java.io.Serializable;
import java.util.Objects;

import com.sunan.systemStoreDesk.entities.Product;

public class ProductQuantity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Product product;
	private Integer quantity;
	
	public ProductQuantity() {
		
	}
	
	public ProductQuantity(Product product, Integer quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(product.getId());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductQuantity other = (ProductQuantity) obj;
		return Objects.equals(product.getId(), other.product.getId());
	}

	@Override
	public String toString() {
		return "ProductQuantity [product=" + product + ", quantity=" + quantity + "]";
	}
	
}
