package com.akadircicek;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity (name = "Personnel")
@Table (name = "Personnel" )
public class Personnel implements Serializable {
	
	@Id
	@TableGenerator(name="Additional", table="Additional", pkColumnName="Unknown", pkColumnValue="Unknown", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "Additional")
	private int personnelId;
	
	@Basic
	private String personnelName;
	private String personnelSurname;
	
	@Temporal(TemporalType.DATE)
	private Date personnelDate;
	
	@Lob
	private String personnelAdress;
	
	
	private static final long serialVersionUID = 1L;
	
	@Column(name ="Id")
	public int getPersonnelId() {
		return personnelId;
	}
	public void setPersonnelId(int personnelId) {
		this.personnelId = personnelId;
	}
	
	@Column(name="Name")
	public String getPersonnelName() {
		return personnelName;
	}
	public void setPersonnelName(String personnelName) {
		this.personnelName = personnelName;
	}
	
	@Column(name="Surname")
	public String getPersonnelSurname() {
		return personnelSurname;
	}
	public void setPersonnelSurname(String personnelSurname) {
		this.personnelSurname = personnelSurname;
	}
	@Column(name="Date")
	public Date getPersonnelDate() {
		return personnelDate;
	}
	public void setPersonnelDate(Date personnelDate) {
		this.personnelDate = personnelDate;
	}
	
	@Column(name="Adress")
	public String getPersonnelAdress() {
		return personnelAdress;
	}
	public void setPersonnelAdres(String personnelAdress) {
		this.personnelAdress = personnelAdress;
	}

	
	
}
