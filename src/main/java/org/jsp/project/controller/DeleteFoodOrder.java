package org.jsp.project.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.project.dto.FoodOrder;
import org.jsp.project.dto.User;

public class DeleteFoodOrder {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		Scanner op=new Scanner(System.in);
		System.out.println("enter the id");
		int id=op.nextInt();
		User u=manager.find(User.class,id);
		FoodOrder f=manager.find(FoodOrder.class,id);
		if(f !=null)
		{
			
			manager.remove(f);
			tx.begin();//it is compulsory to begin and commit the transaction.
			tx.commit();
			System.out.println("delete successful");
			
			
		}
		else
		{
			System.out.println("delete unsuccessful");
		}
		
		
		
	}

}
