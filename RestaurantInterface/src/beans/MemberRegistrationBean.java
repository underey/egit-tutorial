package beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "mreg")
@RequestScoped
public class MemberRegistrationBean implements Serializable {

	private String name;
	private String surname;
	private String email;
	private String availableMail;
	private String login;
	private String password;
	private String passwordAgain;
	private String isactivated;
	private int staffrole;

	public MemberRegistrationBean() {
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

	public String getIsactivated() {
		return isactivated;
	}

	public void setIsactivated(String isactivated) {
		this.isactivated = isactivated;
	}

	public int getStaffrole() {
		return staffrole;
	}

	public void setStaffrole(int staffrole) {
		this.staffrole = staffrole;
	}

	public String getAvailableMail() {
		return availableMail;
	}

	public void setAvailableMail(String availableMail) {
		this.availableMail = availableMail;
	}
	
	

}
