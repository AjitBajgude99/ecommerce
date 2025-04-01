package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Orderproduct;

public interface OrderproductRepo extends JpaRepository<Orderproduct, Integer> {

}
