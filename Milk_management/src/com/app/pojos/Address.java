package com.app.pojos;
import javax.persistence.*;
import javax.persistence.Embeddable;

@Embeddable 
public class Address 
{
  private Integer street_No;
  private String building;
  private String area,city,state,country;
  private Integer pincode;
  
  public Address()
  {  }

public Address(Integer street_No, String building, String area, String city, String state, String country,
		Integer pincode) {
	super();
	this.street_No = street_No;
	this.building = building;
	this.area = area;
	this.city = city;
	this.state = state;
	this.country = country;
	this.pincode = pincode;
}


public Integer getStreet_No() {
	return street_No;
}

public void setStreet_No(Integer street_No) {
	this.street_No = street_No;
}
@Column(length = 30)
public String getBuilding() {
	return building;
}

public void setBuilding(String building) {
	this.building = building;
}

@Column(length = 50)
public String getArea() {
	return area;
}

public void setArea(String area) {
	this.area = area;
}

@Column(length = 50)
public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

@Column(length = 30)
public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

@Column(length = 50)
public String getCountry() 
{
	return country;
}


public void setCountry(String country) 
{
	this.country = country;
}


@Column(length = 20)
public Integer getPincode() 
{
	return pincode;
}

public void setPincode(Integer pincode) 
{
	this.pincode = pincode;
}

@Override
public String toString() 
{
	return "Address [street_No=" + street_No + ", building=" + building + ", area=" + area + ", city=" + city
			+ ", state=" + state + ", country=" + country + ", pincode=" + pincode + "]";
}
  
  
}