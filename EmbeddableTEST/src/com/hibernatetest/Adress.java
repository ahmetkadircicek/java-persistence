package com.hibernatetest;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Adress {
	
	@Column(name ="Provincename")
	private String Province;
	
	@Column(name ="Districtname")
	private String District;
	
	@Column(name ="Neighborhoodname")
	private String Neighborhood;
	
	@Column(name ="Roadname")
	private String Road;
	
	
	public String getProvince() {
		return Province;
	}
	public void setProvince(String province) {
		Province = province;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public String getNeighborhood() {
		return Neighborhood;
	}
	public void setNeighborhood(String neighborhood) {
		Neighborhood = neighborhood;
	}
	public String getRoad() {
		return Road;
	}
	public void setRoad(String road) {
		Road = road;
	}
}
