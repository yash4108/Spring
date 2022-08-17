package com.mindgate.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Address {
	
	 private String homeNo;
	 private String road;
	 private String city;
	 public Address() {
		
		 System.out.println("default constructor of address class");
	}
	 
	public Address(String homeNo, String road, String city) {
		super();
		this.homeNo = homeNo;
		this.road = road;
		this.city = city;
	}
	

	public String getHomeNo() {
		return homeNo;
	}

	public void setHomeNo(String homeNo) {
		this.homeNo = homeNo;
	}

	public String getRoad() {
		return road;
	}

	public void setRoad(String road) {
		this.road = road;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [homeNo=" + homeNo + ", road=" + road + ", city=" + city + "]";
	}
	 
	

}
