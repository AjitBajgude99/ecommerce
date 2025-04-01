package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Cart;
import com.example.demo.projection.CartUi;

public interface CartRepo  extends JpaRepository<Cart, Integer>{
	
	int countByProductidAndUserid(int productid,int userid);

	@Query(value="select * from product p join Cart c on p.id=c.productid where c.userid=?" , nativeQuery = true)
	List<CartUi> getAllProductsByProductid(int userid);

	
}
