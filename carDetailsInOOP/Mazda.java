package carDetailsInOOP;

import java.util.Scanner;

public class Mazda extends CarsDetails implements CarInterface {
	
	Scanner scanner = new Scanner(System.in);
	//private fields
	private final String ManufacturerName = "MAZDA";
	private String password;
	private double price;
	private double priceWithTax;
	private final double tax = 0.1;
	private boolean availability;
	private final int warranty = 7;

	
	public void setPassword() {
		System.out.print("Enter password your car : ");
		password = sc.next();
	}
	
	public String getPassword() {
		return password;
	}
	
	@Override
	public boolean matchPassword(String userInput) {
		// TODO Auto-generated method stub
		return password.equals(password);
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
	public double getPriceWithTax() {;
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
	
	protected void disPlayCarDetailsOfMazda() {
		System.out.println("Manufacturer's Name : " + ManufacturerName);
		System.out.println("Price Including Tax : " + getPriceWithTax());
		System.out.println("Is The Car Available Now ? - " + checkAvailability());
	}
	
	protected void welcomeBuyerForMazda() {
		System.out.println("Does The Password Match : " + matchPassword("mazda"));
		System.out.println("This car has warranty of : " + warranty + " years.");
	}
}
