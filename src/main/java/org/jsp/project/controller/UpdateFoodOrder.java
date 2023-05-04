package org.jsp.project.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.project.dto.FoodOrder;
import org.jsp.project.dto.User;

public class UpdateFoodOrder {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		Scanner op=new Scanner(System.in);
		System.out.println("enter the id");
		int id=op.nextInt();
		FoodOrder f=manager.find(FoodOrder.class, id);
		if(f!=null)
		{
			System.out.println("enter the orderitem");
			String st=op.next();
			f.setItemname(st);
			manager.merge(f);
			tx.begin();
			tx.commit();
			System.out.println("update food name  success");
		}
		else
		{
			System.out.println("not found");
		}
	}
}


