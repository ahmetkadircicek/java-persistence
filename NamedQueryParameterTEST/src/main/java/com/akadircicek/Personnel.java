package com.akadircicek;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@NamedQueries({ 
	@NamedQuery(name = "Personnel.findAll", query = "SELECT p FROM Personnel p"), 
	@NamedQuery(name = "Personnel.findPersonnel", query = "SELECT p FROM Personnel p WHERE p.personnelId = :p_id") 
})
public class Personnel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	private int personnelId;
	private String personnelName;
	private String personnelSurname;

	public Personnel() {
	}
	
	public Personnel(String name, String surname) {
		this.personnelName = name;
		this.personnelSurname = surname;
	}

	@Column(name="Id")
	public int getPersonnelId() {
		return this.personnelId;
	}


	public void setPersonnelId(int personnelId) {
		this.personnelId = personnelId;
	}

	@Column(name="Name")
	public String getPersonnelName() {
		return this.personnelName;
	}

	public void setPersonnelName(String personnelName) {
		this.personnelName = personnelName;
	}

	@Column(name="Surname")
	public String getPersonnelSurname() {
		return this.personnelSurname;
	}

	public void setPersonnelSurname(String personnelSurname) {
		this.personnelSurname = personnelSurname;
	}
	
	public void FindAll(EntityManager em) {
		Query query = em.createNamedQuery("Personnel.findAll");
		List<?> list =query.getResultList();
		
		for(Object obj : list) {
			Personnel personnel = (Personnel) obj;
			
			System.out.println("\nID :" + personnel.getPersonnelId() +
					"\nName :" + personnel.getPersonnelName() +
					"\nSurname :" + personnel.getPersonnelSurname());
		}
	}

	public void FindPersonnel(EntityManager em, int inputData) {
		Query query = em.createNamedQuery("Personnel.findPersonnel").setParameter("p_id", inputData);
		List<?> list = query.getResultList();
		
		for(Object obj : list) {
			Personnel personnel = (Personnel) obj;
			
			System.out.println("\nID :" + personnel.getPersonnelId() +
					"\nName :" + personnel.getPersonnelName() +
					"\nSurname :" + personnel.getPersonnelSurname());
		}
		
	}

	

}