package com.akadircicek;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

@Entity

public class Personnel implements Serializable {

	   
	@Id
	private int personnelId;
	
	private String personnelName;
	
	private String personnelSurname;
	
	private static final long serialVersionUID = 1L;

	public Personnel() {
		super();
	}   
	public int getPersonnelId() {
		return this.personnelId;
	}

	public void setPersonnelId(int personnelId) {
		this.personnelId = personnelId;
	}   
	public String getPersonnelName() {
		return this.personnelName;
	}

	public void setPersonnelName(String personnelName) {
		this.personnelName = personnelName;
	}   
	public String getPersonnelSurname() {
		return this.personnelSurname;
	}

	public void setPersonnelSurname(String personnelSurname) {
		this.personnelSurname = personnelSurname;
	}
   
}
