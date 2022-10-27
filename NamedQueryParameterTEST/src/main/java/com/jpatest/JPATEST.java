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
			personnel.setPersonnelName("Ahmet");
			personnel.setPersonnelSurname("Osman");

			
			emf = Persistence.createEntityManagerFactory("NamedQueryParameterTEST");
			em = emf.createEntityManager();
			
			EntityTransaction et = em.getTransaction();
			
			try {
			et.begin();
				em.persist(personnel);
				
				addPersonnel(em, "Ahmet", "Cicek");
				addPersonnel(em, "Kaan", "Bulut");
				addPersonnel(em, "Selis", "Yamak");
				
			et.commit();
			
			} catch (Exception e ) {
				et.rollback();
			} finally {
				
				if(em!=null) {
					
					personnel.FindAll(em);
					personnel.FindPersonnel(em,2);
					
					
					em.close();
					emf.close();
				}
			}
	}

	private static void addPersonnel(EntityManager em, String name, String surname) {
		Personnel personnelObject = new Personnel(name, surname);	
		em.persist(personnelObject);
	}
}
