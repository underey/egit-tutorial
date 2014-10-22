package edu.bionic.sverkunov.com.DAO.classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Staff {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int staff_id;
	private String staff_first_name;
	private String staff_surname;
	private String staff_login;
	private String staff_password;
	private String staff_security_question;
	private String staff_security_answer;
	private String staff_phone;
	private String staff_email;
	
	public int getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}
	public String getStaff_first_name() {
		return staff_first_name;
	}
	public void setStaff_first_name(String staff_first_name) {
		this.staff_first_name = staff_first_name;
	}
	public String getStaff_surname() {
		return staff_surname;
	}
	public void setStaff_surname(String staff_surname) {
		this.staff_surname = staff_surname;
	}
	public String getStaff_login() {
		return staff_login;
	}
	public void setStaff_login(String staff_login) {
		this.staff_login = staff_login;
	}
	public String getStaff_password() {
		return staff_password;
	}
	public void setStaff_password(String staff_password) {
		this.staff_password = staff_password;
	}
	public String getStaff_security_question() {
		return staff_security_question;
	}
	public void setStaff_security_question(String staff_security_question) {
		this.staff_security_question = staff_security_question;
	}
	public String getStaff_security_answer() {
		return staff_security_answer;
	}
	public void setStaff_security_answer(String staff_security_answer) {
		this.staff_security_answer = staff_security_answer;
	}
	public String getStaff_phone() {
		return staff_phone;
	}
	public void setStaff_phone(String staff_phone) {
		this.staff_phone = staff_phone;
	}
	public String getStaff_email() {
		return staff_email;
	}
	public void setStaff_email(String staff_email) {
		this.staff_email = staff_email;
	}
		
	
}
