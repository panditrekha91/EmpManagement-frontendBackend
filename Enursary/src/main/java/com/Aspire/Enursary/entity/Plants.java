package com.Aspire.Enursary.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plants {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private double price;
	
	private int quantity;
	
	private String imgname;
	
	
	
	
	
	
	public Plants() {
		super();
	}


	public Plants(int id, String name, double price, int quantity,String imgname) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.imgname=imgname;
	}
	
	
	public int getId() {
		return id;
	}




	public String getImgname() {
		return imgname;
	}


	public void setImgname(String imgname) {
		this.imgname = imgname;
	}


	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public double getPrice() {
		return price;
	}




	public void setPrice(double price) {
		this.price = price;
	}




	public int getQuantity() {
		return quantity;
	}




	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "Plants [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", imgname="
				+ imgname + "]";
	}


	




	
	
	
	
	
	
}
