package org.jsp.project.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.project.dto.User;

public class UpdateUser {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		Scanner op=new Scanner(System.in);
		System.out.println("enter the id");
		int id=op.nextInt();
		User u=manager.find(User.class, id);
		if(u!=null)
		{
		  System.out.println("enter the phoneno");
		    long str=op.nextLong();
			u.setPhone(str);
			manager.merge(u);
			tx.begin();
			tx.commit();
			System.out.println("update successfull");
		}
		else
		{
			System.out.println("user not found");
		}
		
	}

}
