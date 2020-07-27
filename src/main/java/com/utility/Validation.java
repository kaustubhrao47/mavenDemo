package com.utility;

import java.util.regex.*;

public class Validation {

	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	public static final Pattern VALID_MOBILE_NUMBER_REGEX = Pattern.compile("(?:\\(\\d{3}\\)|\\d{3}[-]*)\\d{3}[-]*\\d{4}");
	public boolean validateEmail(String email) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        return matcher.find();
	}
	
	public boolean validatePhone(String mobileNumber) {
		Matcher matcher = VALID_MOBILE_NUMBER_REGEX.matcher(mobileNumber);
        return matcher.find();
	}
	/*public static void main(String[] args) {
		Validation obj=new Validation();
		System.out.println(obj.validateEmail("kaustubhrao47@gmail.com"));
		System.out.println(obj.validateEmail("kaustubhrao47gmail.com"));
		System.out.println(obj.validatePhone("9930682356"));
		System.out.println(obj.validatePhone("(+91)9930682356"));
	}*/
	
}
