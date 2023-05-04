package org.jsp.project.dto;

import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@Entity
public class FoodOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@UpdateTimestamp
	private LocalTime deliverytime;
	@CreationTimestamp
	private LocalTime ordertime;
	private double price;
	private String address;
	private String itemname;
	@ManyToOne( cascade=CascadeType.ALL)
	@JoinColumn
	private User user;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalTime getDeliverytime() {
		return deliverytime;
	}
	public void setDeliverytime(LocalTime deliverytime) {
		this.deliverytime = deliverytime;
	}
	public LocalTime getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(LocalTime ordertime) {
		this.ordertime = ordertime;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	

}
