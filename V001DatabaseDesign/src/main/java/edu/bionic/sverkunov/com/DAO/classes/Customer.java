package edu.bionic.sverkunov.com.DAO.classes;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Customer {

	@Id
	@GeneratedValue
	private int customer_id;
	private String customer_name;
	private String customer_surname;
	private Date customer_birthday;
	private String customer_city;
	private String customer_street;
	private String customer_building;
	private String customer_app;
	private String customer_email;
	private String customer_payment_info;
	private String customer_phone;
	private String customer_login;
	private String customer_password;
	private String customer_security_question;
	private String customer_security_answer;
	
	@ManyToOne
	@JoinColumn(name="rest")
	private Restaurant restaurant_id;
	
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_surname() {
		return customer_surname;
	}
	public void setCustomer_surname(String customer_surame) {
		this.customer_surname = customer_surame;
	}
	public Date getCustomer_birthday() {
		return customer_birthday;
	}
	public void setCustomer_birthday(Date customer_birthday) {
		this.customer_birthday = customer_birthday;
	}
	public String getCustomer_city() {
		return customer_city;
	}
	public void setCustomer_city(String customer_city) {
		this.customer_city = customer_city;
	}
	public String getCustomer_street() {
		return customer_street;
	}
	public void setCustomer_street(String customer_street) {
		this.customer_street = customer_street;
	}
	public String getCustomer_building() {
		return customer_building;
	}
	public void setCustomer_building(String customer_building) {
		this.customer_building = customer_building;
	}
	public String getCustomer_app() {
		return customer_app;
	}
	public void setCustomer_app(String customer_app) {
		this.customer_app = customer_app;
	}
	public String getCustomer_email() {
		return customer_email;
	}
	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}
	public String getCustomer_payment_info() {
		return customer_payment_info;
	}
	public void setCustomer_payment_info(String customer_payment_info) {
		this.customer_payment_info = customer_payment_info;
	}
	public String getCustomer_phone() {
		return customer_phone;
	}
	public void setCustomer_phone(String customer_phone) {
		this.customer_phone = customer_phone;
	}
	public String getCustomer_login() {
		return customer_login;
	}
	public void setCustomer_login(String customer_login) {
		this.customer_login = customer_login;
	}
	public String getCustomer_password() {
		return customer_password;
	}
	public void setCustomer_password(String customer_password) {
		this.customer_password = customer_password;
	}
	public String getCustomer_security_question() {
		return customer_security_question;
	}
	public void setCustomer_security_question(String customer_security_question) {
		this.customer_security_question = customer_security_question;
	}
	public String getCustomer_security_answer() {
		return customer_security_answer;
	}
	public void setCustomer_security_answer(String customer_security_answer) {
		this.customer_security_answer = customer_security_answer;
	}
	public Restaurant getRestaurant_id() {
		return restaurant_id;
	}
	public void setRestaurant_id(Restaurant restaurant_id) {
		this.restaurant_id = restaurant_id;
	}
	
	
	

	
	
}
