package com.g3.spc.entities;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;

import io.swagger.annotations.ApiModelProperty;

@Embeddable 
public class Address {
	
	@ApiModelProperty(name = "Building name",value="Holds the building name in the address of student",required = true)
    @NotEmpty(message = "Building name cannot be null or blank")
	private String buildingName;
	
	@ApiModelProperty(name = "StreetName",value="Holds the street name in the address of student",required = true)
    @NotEmpty(message = "Street name cannot be null or blank")
	private String streetName;
	
	@ApiModelProperty(name = "CityName",value="Holds the city name in the address of student",required = true)
    @NotEmpty(message = "City name cannot be null or blank")
	private String cityName;
	
	@ApiModelProperty(name = "Pincode",value="Holds the pincode in the address of student",required = true)
    @NotEmpty(message = "Pincode cannot be null or blank")
	private String pincode;

	
	public Address(String buildingName, String streetName, String cityName, String pincode) {
		super();
		this.buildingName = buildingName;
		this.streetName = streetName;
		this.cityName = cityName;
		this.pincode = pincode;
	}


	public Address() {
		super();
	}


	public String getBuildingName() {
		return buildingName;
	}


	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}


	public String getStreetName() {
		return streetName;
	}


	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}


	public String getCityName() {
		return cityName;
	}


	public void setCityName(String cityName) {
		this.cityName = cityName;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}


	@Override
	public String toString() {
		return "Address [buildingName=" + buildingName + ", streetName=" + streetName + ", cityName=" + cityName
				+ ", pincode=" + pincode + "]";
	}
	
	
	
	
}
