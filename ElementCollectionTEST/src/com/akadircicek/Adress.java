package com.akadircicek;

import javax.persistence.Embeddable;

@Embeddable
public class Adress {
	
	private String Province;
	private String District;
	private String Neighborhood;
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
