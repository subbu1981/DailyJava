package com.practice.javaxml.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


public class Staff {

	String firstname;
	String lastname;
	String nickname;
	int salary;
	int id;
	
	public String getFirstname() {
		return firstname;
	}
	
	@XmlElement
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	@XmlElement
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getNickname() {
		return nickname;
	}
	@XmlElement
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getSalary() {
		return salary;
	}
	@XmlElement
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	@XmlAttribute
	public void setId(int id) {
		this.id = id;
	}
	

}
