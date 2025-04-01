package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Orderproduct {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	double amount;
	int productid;
	int orderid;
	Date date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Orderproduct [id=" + id + ", amount=" + amount + ", productid=" + productid + ", orderid=" + orderid
				+ ", date=" + date + "]";
	}
	public Orderproduct(int id, double amount, int productid, int orderid, Date date) {
		super();
		this.id = id;
		this.amount = amount;
		this.productid = productid;
		this.orderid = orderid;
		this.date = date;
	}
	public Orderproduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
