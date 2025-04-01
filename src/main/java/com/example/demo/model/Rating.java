package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Rating {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	int userid;
	int productid;
	Date date;
	int stars;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date2) {
		this.date = date2;
	}
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
	@Override
	public String toString() {
		return "Rating [id=" + id + ", userid=" + userid + ", productid=" + productid + ", date=" + date + ", stars="
				+ stars + "]";
	}
	public Rating(int id, int userid, int productid, Date date, int stars) {
		super();
		this.id = id;
		this.userid = userid;
		this.productid = productid;
		this.date = date;
		this.stars = stars;
	}
	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
