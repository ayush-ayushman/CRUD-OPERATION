package org.jsp.project.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.project.dto.FoodOrder;
import org.jsp.project.dto.User;



public class foodorderbyuserId {
  public static void main(String [] args)
  {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction tx=manager.getTransaction();
	Scanner op=new Scanner(System.in);
	System.out.println("enter the user id");
	int id=op.nextInt();
	User u=manager.find(User.class, id);
    List<FoodOrder> f=u.getFood();
    for(FoodOrder x:f)
    {
     System.out.println(x.getItemname());
    }
    
}	
}
			
	
