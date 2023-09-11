package com.cjc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {

}
