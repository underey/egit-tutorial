package edu.bionic.sverkunov.com.DAODB3.classes;

public class ResultStaffForAdmin {

	private int id;
	private String name;
	private String surname;
	private String login;
	private String email;
	private boolean isactivated;
	private Accesslevel accesslevel;
	private Staffrole staffrole;
	
	public ResultStaffForAdmin(int id, String name, String surname,
			String login, String email, boolean isactivated,
			Accesslevel accesslevel, Staffrole staffrole) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.login = login;
		this.email = email;
		this.isactivated = isactivated;
		this.accesslevel = accesslevel;
		this.staffrole = staffrole;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

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

	public Staffrole getStaffrole() {
		return staffrole;
	}

	public void setStaffrole(Staffrole staffrole) {
		this.staffrole = staffrole;
	}

	@Override
	public String toString() {
		return  "surname: " + surname 
				+ "\n name: " + name 
				+ "\n staff id: " + id
				+ "\n login: " + login 
				+ "\n email: " + email
				+ "\n role id: " + staffrole
				+ "\n isactivated: " + isactivated 
				+ "\n accesslevel:" + accesslevel 
				+"\n" + "\n";
	}
	
}
