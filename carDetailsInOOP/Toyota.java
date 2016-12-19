package carDetailsInOOP;

import java.util.Scanner;

public class Toyota extends CarsDetails implements CarInterface {
	
	Scanner scanner = new Scanner(System.in);
	//private fields
	private final String ManufacturerName = "TOYOTA";
	private String password;
	private double price;
	private double priceWithTax;
	private final double tax = 0.05;
	private boolean availability;
	private final int warranty = 5;
	
	
	public void setPassword() {
		System.out.print("Enter password of your car : ");
		password = sc.next();
	}
	
	public String getPassword() {
		return password;
	}
	
	@Override
	public boolean matchPassword(String userInput) {
		// TODO Auto-generated method stub
		return userInput.equals(password);
	}	

	public void setPrice() {
		// TODO Auto-generated method stub
		System.out.print("Enter car price : ");
		price = scanner.nextDouble();
	}
	
	public double getPrice() {
		return price;
	}
	
	@Override
	public double getPriceWithTax() {
		priceWithTax = price + (price * tax);
		return priceWithTax;
	}

	@Override
	public void setAvailability(boolean ava) {
		// TODO Auto-generated method stub
		this.availability = ava;
	}
	
	private boolean checkAvailability() {
		return availability;
	}
	
	@Override
	public void addToCart(double priceWithTax) {
		// TODO Auto-generated method stub
		if(this.priceWithTax == priceWithTax) {
			System.out.println("!!!You Have Successfully Bought a Toyota!!!");
		} else {
			System.out.println("Sorry!!! You Have To Pay First...");
		}	
	}
	
	protected void disPlayCarDetailsOfToyota() {
		System.out.println("Manufacturer's Name : " + ManufacturerName);
		System.out.println("Price Including Tax : " + getPriceWithTax());
		System.out.println("Is The Car Available Now ? - " + checkAvailability());
	}
	
	protected void welcomeBuyerForToyota() {
		System.out.println("This car has warranty of : " + warranty + " years.");
		System.out.println("Does The Password Match : " + matchPassword("toyota"));
	}
	
}
