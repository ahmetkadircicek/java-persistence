package com.akadircicek;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Personnel {
	
	private int personnelId;
	private String personnelName, personnelSurname;
	
	@Id
	public int getPersonnelId() {
		return personnelId;
	}
	public void setPersonnelId(int personnelId) {
		this.personnelId = personnelId;
	}
	public String getPersonnelName() {
		return personnelName;
	}
	public void setPersonnelName(String personnelName) {
		this.personnelName = personnelName;
	}
	public String getPersonnelSurname() {
		return personnelSurname;
	}
	public void setPersonnelSurname(String personnelSurname) {
		this.personnelSurname = personnelSurname;
	}
	
}
