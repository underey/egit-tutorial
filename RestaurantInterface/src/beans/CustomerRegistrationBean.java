package beans;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "creg")
@RequestScoped
public class CustomerRegistrationBean implements Serializable {

	private String name;
	private String surname;
	private Date birthday;
	private String city;
	private String street;
	private String building;
	private String app;
	private String payment;
	private String phone;
	
	private String email;
	private String availableMail;
	private String login;
	private String password;
	private String passwordAgain;
	
	public CustomerRegistrationBean(){}

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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
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

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		String pass = "andre@gmail.com";
		if (email.equals(pass)) {
			this.email = null;
			this.availableMail = "Invalid mail";
		} else {
			this.email = email;
			this.availableMail = "Available";
		}
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordAgain() {
		return passwordAgain;
	}

	public void setPasswordAgain(String passwordAgain) {
		this.passwordAgain = passwordAgain;
	}

	public String getAvailableMail() {
		return availableMail;
	}

	public void setAvailableMail(String availableMail) {
		this.availableMail = availableMail;
	}

	
}
