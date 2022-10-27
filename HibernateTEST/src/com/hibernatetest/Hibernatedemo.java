package com.hibernatetest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.akadircicek.Personnel;

public class Hibernatedemo {
	public static void main(String[] args) {
		
		Personnel personnel = new Personnel();
		personnel.setPersonnelId(1);
		personnel.setPersonnelName("Ahmet");
		personnel.setPersonnelSurname("Kadir");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(personnel);
		session.getTransaction().commit();
		
	}

}
