package beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "msgs")
@SessionScoped
public class MessageBean implements Serializable {
	private final String nameRequired = "Name field could not be empty";
	private final String nameConverter = "Name should has only letters";
	private final String nameRange = "Name field lenght between (2 - 15) characters";
	private final String surnameRequired = "Surname field could not be empty";
	private final String surnameConverter = "Surname should has only letters";
	private final String surnameRange = "Surname field lenght between (2 - 15) characters";
	private final String birthdayRequired = "Birthday field could not be empty";
	private final String birthdayConverter = "Birthday field has wrong date format";
	private final String cityRequired = "City field could not be empty";
	private final String cityConverter = "City field should has only letters";
	private final String streetConverter = "Street field should has only letters and white spaces";
	private final String buildingConverter = "Building field should has only letters, numbers and /";
	private final String appConverter = "App field should has only letters and numbers";
	private final String paymentConverter = "Payment field should has strictly digits";
	private final String paymentRange = "Payment field lenght strictly sixteen digits";
	private final String phoneRequired = "Phone field could not be empty";
	private final String phoneConverter = "Phone number consists of ten digits";
	private final String phoneRange = "Phone field example: xxx-yyyy-zzz";
	private final String emailRequired = "Email field could not be empty";
	private final String emailConverter = "Invalid email format";
	private final String emailRange = "Email field lenght at least 6 characters and consist of digits, letters, points and _";
	private final String loginRequired = "Login field could not be empty";
	private final String loginConverter = "Invalid login format. Only digits, letters, points and _ are available";
	private final String loginRange = "Login field lenght between (5 - 12) characters";
	private final String passwordRequired = "Password field could not be empty";
	private final String passwordRange = "Password field lenght between (6 - 20) characters and has at least one digit, one upper case letter, one lower case letter";
	private final String activationRequired = "Activated field could not be empty";
	private final String staffroleRequired = "Role field could not be empty";
	private final String phoneEx ="Example: xxx-yyyy-zzz";
	
	public MessageBean(){}

	public String getNameRequired() {
		return nameRequired;
	}

	public String getNameConverter() {
		return nameConverter;
	}

	public String getNameRange() {
		return nameRange;
	}

	public String getSurnameRequired() {
		return surnameRequired;
	}

	public String getSurnameConverter() {
		return surnameConverter;
	}

	public String getSurnameRange() {
		return surnameRange;
	}

	public String getBirthdayRequired() {
		return birthdayRequired;
	}

	public String getBirthdayConverter() {
		return birthdayConverter;
	}

	public String getCityRequired() {
		return cityRequired;
	}

	public String getCityConverter() {
		return cityConverter;
	}

	public String getStreetConverter() {
		return streetConverter;
	}

	public String getBuildingConverter() {
		return buildingConverter;
	}

	public String getAppConverter() {
		return appConverter;
	}

	public String getPaymentConverter() {
		return paymentConverter;
	}

	public String getPaymentRange() {
		return paymentRange;
	}

	public String getPhoneRequired() {
		return phoneRequired;
	}

	public String getPhoneConverter() {
		return phoneConverter;
	}

	public String getEmailRequired() {
		return emailRequired;
	}

	public String getEmailConverter() {
		return emailConverter;
	}

	public String getLoginRequired() {
		return loginRequired;
	}

	public String getLoginConverter() {
		return loginConverter;
	}

	public String getLoginRange() {
		return loginRange;
	}

	public String getPasswordRequired() {
		return passwordRequired;
	}

	public String getPasswordRange() {
		return passwordRange;
	}

	public String getPhoneRange() {
		return phoneRange;
	}

	public String getActivationRequired() {
		return activationRequired;
	}

	public String getStaffroleRequired() {
		return staffroleRequired;
	}

	public String getEmailRange() {
		return emailRange;
	}

	public String getPhoneEx() {
		return phoneEx;
	}


	
	
}
