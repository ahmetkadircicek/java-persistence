package com.akadircicek;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Personnel database table.
 * 
 */
@Entity
@NamedQuery(name="Personnel.findAll", query="SELECT p FROM Personnel p")
public class Personnel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int personnelId;

	private String personnelName;

	private String personnelSurname;

	public Personnel() {
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