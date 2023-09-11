package com.cjc.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cjc.model.Product;

@FeignClient(name = "product-service")
public interface ProductServiceProxy {
	
	@GetMapping("/products/{productId}")
	public Product retriveProductDetails(@PathVariable int productId);

}
