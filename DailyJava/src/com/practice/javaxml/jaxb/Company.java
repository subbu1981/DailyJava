package com.practice.javaxml.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Company {

	Staff staff;

	public Staff getStaff() {
		return staff;
	}
	
	@XmlElement
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	
	
	
	
}
