package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Myorder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	double amount;
	int userid;
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
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Myorder [id=" + id + ", amount=" + amount + ", userid=" + userid + ", date=" + date + "]";
	}
	public Myorder(int id, double amount, int userid, Date date) {
		super();
		this.id = id;
		this.amount = amount;
		this.userid = userid;
		this.date = date;
	}
	public Myorder() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
