package com.cjc.service;

import com.cjc.dto.CartDto;
import com.cjc.model.Cart;

public interface CartService {

	Cart getCartDetails(int cartId);

	CartDto getcartDetailswithProductInfo(int cartId);

}
