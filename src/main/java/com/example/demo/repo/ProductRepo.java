package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Product;
import com.example.demo.projection.ProductUi;
import com.example.demo.projection.ProductUiBuyer;

public interface ProductRepo extends JpaRepository<Product, Integer>{

	List<Product> findByUserid(int userid);
	
	@Query(value = "SELECT p.id,p.name,p.description,p.discount,p.price,p.quantity,p.rating,c.name as cat from product p\r\n"
			+ " join category c on p.categoryid=c.id where p.userid=?1;" , nativeQuery = true)
	
	List<ProductUi> findProductByCategoryId(int userid);
	
	
	@Query(value = "SELECT id,name,price,description,discount,rating,quantity,datediff(now(),date) as days from product\r\n"
			+ " where categoryid=?1 and price>=?2 and price<=?3 and rating>=?4;" ,nativeQuery = true)
	
	List<ProductUiBuyer> getProductsByFilter(int categoryid,int minprice,int maxprice,int minrating);
	
	
	
}
