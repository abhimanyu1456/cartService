package com.cjc.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.dao.CartRepository;
import com.cjc.dto.CartDto;
import com.cjc.model.Cart;
import com.cjc.model.Product;
import com.cjc.proxy.ProductServiceProxy;
import com.cjc.service.CartService;

@Service
public class CartServiceImpl implements CartService{

	@Autowired
	private CartRepository repo;
	
	@Autowired
	private ProductServiceProxy proxy;
	
	@Override
	public Cart getCartDetails(int cartId) {
		// TODO Auto-generated method stub
		return repo.findById(cartId).get();
	}
	@Override
	public CartDto getcartDetailswithProductInfo(int cartId) {
		if(repo.existsById(cartId)) {
			Cart cart = repo.findById(cartId).get();
			
			Product product=proxy.retriveProductDetails(cart.getProductId());
			
			CartDto cartdto=new CartDto(cartId, cart.getProductId(), product.getProductName(), product.getProductPrice());
			
			return cartdto;
		}
		// TODO Auto-generated method stub
		return null;
	}

}
