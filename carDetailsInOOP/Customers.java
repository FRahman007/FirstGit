package carDetailsInOOP;

import java.util.Scanner;

public class Customers extends Person {
	
	protected String countryName;
	Scanner scanner = new Scanner(System.in);
	
	public void setCountryName() {
		System.out.print("Enter The CountryName of The Customer : ");
		countryName = scanner.next();
	}
	
	public String getName() {
		return countryName;
	}
	
	public void printSellerInfo() {
		super.printSellerInfo();
		System.out.println("Customer's Country : " + countryName);
	}
}
