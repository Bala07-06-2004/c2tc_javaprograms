//Program to define factory method
package com.tnsif.day08.interfaces.instanceofinterface;

public class PhoneFactory {
	public static Phone createPhone(String company) {
		if (company.equalsIgnoreCase("Samsung"))
			return new Samsung();
		else if (company.equalsIgnoreCase("Jio"))
			return new Jio();
		return null;
	}
}
