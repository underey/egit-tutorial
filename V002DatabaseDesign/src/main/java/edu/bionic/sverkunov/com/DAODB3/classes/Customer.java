package edu.bionic.sverkunov.com.DAODB3.classes;

import java.sql.Date;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Customer{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String surname;
	private Date birthday;
	private String city;
	private String street;
	private String building;
	private String app;
	private String email;
	private String payment_info;
	private String phone;
	private String login;
	private String password;
	private boolean isactivated;

	
	public boolean isIsactivated() {
		return isactivated;
	}
	public void setIsactivated(boolean isactivated) {
		this.isactivated = isactivated;
	}
	public Accesslevel getAccesslevel() {
		return accesslevel;
	}
	public void setAccesslevel(Accesslevel accesslevel) {
		this.accesslevel = accesslevel;
	}


	@OneToMany(mappedBy="customer")
	private Collection<Orderr> orderrs;
	
	@ManyToOne
	@JoinColumn(name="access_id")
	private Accesslevel accesslevel;
	
	
	public Collection<Orderr> getOrderrs() {
		return orderrs;
	}
	public void setOrderrs(Collection<Orderr> orderrs) {
		this.orderrs = orderrs;
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

	
@Override
	public String toString() {
		return  "surname: " + surname 
				+ "\n name: " + name 
				+ "\n customer id: " + id
				+ "\n birthday: " + birthday 
				+ "\n city: " + city 
				+ "\n street:" + street 
				+ "\n building: " + building 
				+ "\n app: " + app
				+ "\n email: " + email 
				+ "\n payment_info: " + payment_info
				+ "\n phone: " + phone 
				+ "\n login: " + login 
//				+ "\n password: " + password
				+ "\n isactivated: " + isactivated 
				+ "\n accesslevel:" + accesslevel 
				+"\n" + "\n";
	}

}
