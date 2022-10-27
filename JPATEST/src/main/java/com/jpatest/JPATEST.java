package com.jpatest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.akadircicek.Personnel;

public class JPATEST {

	public static void main(String[] args) {
			EntityManagerFactory emf;
			EntityManager em;
			
			Personnel personnel = new Personnel();
			personnel.setPersonnelName("Kadir");
			personnel.setPersonnelSurname("Osman");

			
			emf = Persistence.createEntityManagerFactory("JPATEST");
			em = emf.createEntityManager();
			
			EntityTransaction et = em.getTransaction();
			
			et.begin();
				em.persist(personnel);
			et.commit();
			
			System.out.println("\nID :" + personnel.getPersonnelId() +
					"\nName :" + personnel.getPersonnelName() +
					"\nSurname :" + personnel.getPersonnelSurname());
			
			em.close();
			emf.close();
	}

}
