package com.dhliwayok.hopeworldwide;
import java.sql.Date;
import java.sql.Timestamp;

public class Child {
	
	private BMI bmi;
	private int id;
	private String name;
	private char odeama;
	private char gender;
	private Date dateOfBirth;
	
	public Child(int id, String name, char odeama, char gender, Date dateOfBirth, BMI bmi){
		this.id = id;
		this.name = name;
		this.odeama = odeama;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.bmi = bmi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getOdeama() {
		return odeama;
	}

	public void setOdeama(char odeama) {
		this.odeama = odeama;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public BMI getBmi() {
		return bmi;
	}

	public void setBmi(BMI bmi) {
		this.bmi = bmi;
	}

	@Override
	public String toString() {
		return "Child [name=" + name + ", odeama=" + odeama
				+ ", gender=" + gender + ", dateOfBirth=" + dateOfBirth +"BMI ="+bmi +"]";
	}
	
	
}
