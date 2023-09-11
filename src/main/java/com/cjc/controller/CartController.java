package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.dto.CartDto;
import com.cjc.model.Cart;
import com.cjc.service.CartService;

@RestController
public class CartController {

	@Autowired
	private CartService service;
	
	@GetMapping("/carts/{cartId}")
	public Cart getCartDetails(@PathVariable int cartId) {
		return service.getCartDetails(cartId);
	}
	
	@GetMapping("/carts/cartDto/{cartId}")
	public 	CartDto getCartDetailswithProductInfo(@PathVariable int cartId) {
		return service.getcartDetailswithProductInfo(cartId);
	}
}
