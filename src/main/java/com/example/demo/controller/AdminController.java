package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Category;
import com.example.demo.repo.CategoryRepo;

@RestController
@CrossOrigin
@RequestMapping("admin")
public class AdminController
{

	@Autowired
	CategoryRepo categoryRepo;
	@DeleteMapping("deleteCategory{id}")
	public boolean deleteByid(@PathVariable("id") int id)
	{
		boolean status=false;
		if(id!=0)
		{
			categoryRepo.deleteById(id);
			status=true;
		}
		return status;
	}
	@RequestMapping("getAllCategories")
	public List<Category> getAllCategories()
	{
		return categoryRepo.findAll();
	}
	
	@RequestMapping("addNewCategory{userid}")
	public Category addNewCategory(@PathVariable int userid, @RequestBody String name)
	{
		Category c= new Category();
		c.setDate(new Date());
		c.setName(name);
		c.setUserid(userid);
		return categoryRepo.save(c);
		
	}
}

