package com.hibernatetest;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.akadircicek.Adress;
import com.akadircicek.Personnel;

public class Hibernatedemo {
	public static void main(String[] args) {
		
		Personnel personnel = new Personnel();
		//personnel.setPersonnelId(1);
		personnel.setPersonnelName("Ahmet");
		personnel.setPersonnelSurname("Kadir");
		personnel.setPersonnelDate(new Date());
		
		Adress mainadress = new Adress();
		mainadress.setProvince("Istanbul");
		mainadress.setDistrict("Başakşehir");
		mainadress.setNeighborhood("2.Kısım");
		mainadress.setRoad("Kartopu Sokak");
		
		personnel.getAdresslist().add(mainadress);
		
		Adress workadress = new Adress();
		workadress.setProvince("Istanbul");
		workadress.setDistrict("Halkalı");
		workadress.setNeighborhood("4. Kısım");
		workadress.setRoad("Pati Sokak");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
			session.save(personnel);
		session.getTransaction().commit();
		session.close();
		
		session = sessionFactory.openSession();
		session.beginTransaction();
		personnel = (Personnel) session.get(Personnel.class, 1);
		System.out.println("\nID :" + personnel.getPersonnelId());
		System.out.println("Name :" + personnel.getPersonnelName());
		System.out.println("Surname :" + personnel.getPersonnelSurname());
		System.out.println("Date :" + personnel.getPersonnelDate()); 
		
		session.close();

	}

}
