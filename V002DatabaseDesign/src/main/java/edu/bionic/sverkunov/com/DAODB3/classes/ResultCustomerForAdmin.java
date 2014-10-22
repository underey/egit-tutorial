package edu.bionic.sverkunov.com.DAODB3.classes;

import java.sql.Date;

public class ResultCustomerForAdmin {

	private int id;
	private String name;
	private String surname;
	private String login;
	private java.sql.Date birthday;
	private String city;
	private String street;
	private String building;
	private String app;
	private String email;
	private String payment_info;
	private String phone;
	private boolean isactivated;

	public ResultCustomerForAdmin(int id, String name, String surname, String login, Date birthday,
			String city, String street, String building, String app,
			String email, String payment_info, String phone, boolean isactivated) {

		this.id = id;
		this.name = name;
		this.surname = surname;
		this.login = login;
		this.birthday = birthday;
		this.city = city;
		this.street = street;
		this.building = building;
		this.app = app;
		this.email = email;
		this.payment_info = payment_info;
		this.phone = phone;
		this.isactivated = isactivated;
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public java.sql.Date getBirthday() {
		return birthday;
	}

	public void setBirthday(java.sql.Date birthday) {
		this.birthday = birthday;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPayment_info() {
		return payment_info;
	}

	public void setPayment_info(String payment_info) {
		this.payment_info = payment_info;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isIsactivated() {
		return isactivated;
	}

	public void setIsactivated(boolean isactivated) {
		this.isactivated = isactivated;
	}

	@Override
	public String toString() {
		return  "surname: " + surname 
				+ "\n name: " + name 
				+ "\n customer id: " + id
				+ "\n login: " + login 
				+ "\n birthday: " + birthday 
				+ "\n city: " + city 
				+ "\n street:" + street 
				+ "\n building: " + building 
				+ "\n app: " + app
				+ "\n email: " + email 
				+ "\n payment_info: " + payment_info
				+ "\n phone: " + phone 
				+ "\n isactivated: " + isactivated  
				+"\n" + "\n";
	}

}
