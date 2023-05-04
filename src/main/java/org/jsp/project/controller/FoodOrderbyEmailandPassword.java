package org.jsp.project.controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.project.dto.FoodOrder;
import org.jsp.project.dto.User;

public class FoodOrderbyEmailandPassword {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		Scanner op=new Scanner(System.in);
		System.out.println("enter the user email");
		String em=op.next();
		System.out.println("enter the user password");
		String pw=op.next();
		String st="select u from User u where u.email=?1 and u.password=?2";
		Query q=manager.createQuery(st);
		q.setParameter(1, em);
		q.setParameter(2, pw);
		User u=(User) q.getSingleResult();
		List<FoodOrder>f=u.getFood();
		for(FoodOrder s:f)
		{
			System.out.println(s.getItemname());
		}
				
		
		
		
		
	}

}
