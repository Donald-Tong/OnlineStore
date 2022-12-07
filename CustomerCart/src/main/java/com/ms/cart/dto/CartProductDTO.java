package com.ms.cart.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.PositiveOrZero;

public class CartProductDTO {
	private Integer cartProductId;
	@Valid
	private ProductDTO product;
	@PositiveOrZero(message = "{cartproduct.invalid.quantity}")
	private Integer quantity;
	public Integer getCartProductId() {
		return cartProductId;
	}
	public void setCartProductId(Integer cartProductId) {
		this.cartProductId = cartProductId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	
}
