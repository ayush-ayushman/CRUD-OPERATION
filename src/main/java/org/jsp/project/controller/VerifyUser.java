package org.jsp.project.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.project.dto.User;

public class VerifyUser {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		Scanner op=new Scanner(System.in);
		System.out.println("enter the id");
		int id=op.nextInt();
		User u=manager.find(User.class,id);
		System.out.println("enter the email");
		String em=op.next();
		System.out.println("enter the password");
		String pw=op.next();
		User l=manager.find(User.class,1);
		if(em.equals(l.getEmail()) && pw.equals(l.getPassword()))
		{
			System.out.println(" login successful");
		}
		else
		{
			System.out.println(" login unsuccessful");
		}
		
		
	}

}
