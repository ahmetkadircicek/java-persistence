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
		
		Adress homeadress = new Adress();
		homeadress.setProvince("Istanbul");
		homeadress.setDistrict("Başakşehir");
		homeadress.setNeighborhood("2.Kısım");
		homeadress.setRoad("Kartopu Sokak");
		
		Adress workadress = new Adress();
		workadress.setProvince("Istanbul");
		workadress.setDistrict("Halkalı");
		workadress.setNeighborhood("4. Kısım");
		workadress.setRoad("Pati Sokak");
		
		personnel.setHomeadress(homeadress);
		personnel.setWorkadress(workadress);
		
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
		
		System.out.println("\nHome\nProvince :" + personnel.getHomeadress().getProvince());
		System.out.println("District :" + personnel.getHomeadress().getDistrict());
		System.out.println("Neighborhood :" + personnel.getHomeadress().getNeighborhood());
		System.out.println("Road :" + personnel.getHomeadress().getRoad());
		
		System.out.println("\nWork\nProvince :" + personnel.getWorkadress().getProvince());
		System.out.println("District :" + personnel.getWorkadress().getDistrict());
		System.out.println("Neighborhood :" + personnel.getWorkadress().getNeighborhood());
		System.out.println("Road :" + personnel.getWorkadress().getRoad());
		
		session.close();

	}

}
