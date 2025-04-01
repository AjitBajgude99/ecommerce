package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.projection.ProductUi;
import com.example.demo.repo.ProductRepo;

@RestController
@CrossOrigin
@RequestMapping("seller")
public class SellerController {

	@Autowired
	ProductRepo productRepo;
	
	
	@RequestMapping("getAllProducts{userid}")
	public List<ProductUi> getAllProducts(@PathVariable int userid)
	{
		return productRepo.findProductByCategoryId(userid);
	}
	
	@RequestMapping("addNewProduct")
    public Product addNewProduct(@RequestBody Product product) {
        // Basic validation for null fields
        if (product.getName() == null || product.getName().isEmpty()) {
            System.out.println("Product name cannot be null or empty");
            return null; // You can return null or an error message here
        }

        if (product.getPrice() == 0) {
            System.out.println("Price cannot be null");
            return null;
        }

        // Set the date before saving
        product.setDate(new Date());

        // Save the product
        return productRepo.save(product);
    }
}
