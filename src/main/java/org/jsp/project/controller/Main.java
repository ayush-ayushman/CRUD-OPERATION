package org.jsp.project.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.project.dto.FoodOrder;
import org.jsp.project.dto.User;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		User u=new User();
		u.setName("ayush");
		u.setEmail("ayush123");
		u.setGender("m");
		u.setPassword("123");
		u.setPhone(12345);
		FoodOrder f1=new FoodOrder();
		f1.setPrice(78.56);
		f1.setAddress("jp nager");
		f1.setItemname("rice");
		f1.setUser(u);
		FoodOrder f2=new FoodOrder();
		f2.setPrice(78);
		f2.setAddress("jp nager 12");
		f2.setItemname("rice bath");
		f2.setUser(u);
		List<FoodOrder> f=new ArrayList<FoodOrder>(Arrays.asList(f1,f2));
		u.setFood(f);
		manager.persist(u);
		tx.begin();
		tx.commit();
		
		
		
		
		
	}

}
