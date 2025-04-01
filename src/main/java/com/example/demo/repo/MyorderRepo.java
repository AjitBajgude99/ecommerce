package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Myorder;

public interface MyorderRepo extends JpaRepository<Myorder, Integer> {

}
