/*
 * Author : Ferdaus Rahman
 * ID : 152 - 35 - 1200
 * Section : A
 * 
 * Scenario : You're supposed to build an application for a Car-Shop. The shop has cars from three world-class 
 * 			  manufacturer namely Toyota, Mazda and BMW. These cars have colour, menufacturingYear, modelName, 
 * 			  fuelType, size of engin, capacity of fuel. 
 * 			  But every single brands have unique key value for its cars, cars from all these manufacturer is 
 * 			  available in that shop. Tax 5%, 10%, 15% should be added for every single cars from Toyota, Mazda,
 * 			  BMW respectively with their price.
 * 			  Both the manager, salesperson have name, id, address and monthly salary. If manager and 
 * 		      salesperson work extra hours they will get 10% and 2% bonus respectively. Customers from any 
 * 			  country can buy cars from this shop. 
 *			   
 * 			  Now demonstrate with different kinds of behaviour of the shop using proper OOP concepts in Java.
 */
package carDetailsInOOP;

import java.util.Scanner;

public class CarsDetails {
	
	//public fields
	//public String menufacturerName;
	public String color;
	public int menufacturingYear;
	//private fields
	private String modelName;
	//private boolean carKeyValue;	
	private String fuelType;
	
	//default fields
	int enginSize;
	
	//protected fields
	
	//protected double price;
	//protected boolean availability;
	protected double fuelCapacity;
	
	Scanner sc = new Scanner(System.in);

	public void setColor() {
		System.out.print("Enter Color Name : ");
		color = sc.next();
	}
	
	public String getColor() {
		return color;
	}
	
	public void setMenufacturingYear() {
		System.out.print("Enter Manufacturing Year : ");	
		menufacturingYear = sc.nextInt();
	}

	public int getMenufacturingYear() {
		return menufacturingYear;
	}
	
	public void setModelName() {
		System.out.print("Enter Model Name : ");
		modelName = sc.next();
	}
	
	public String getModelName() {
		return modelName;
	}
	
	public void setFuelType() {
		System.out.print("Enter Fuel Type : ");
		fuelType = sc.next();
	}
	
	public String getFuelType() {
		return fuelType;
	}

	public void setEnginSize() {
		System.out.print("Enter Engin Size : ");
		enginSize = sc.nextInt();
	}

	public int getEnginSize() {
		return enginSize;
	}

	public void setFuelCapacity() {
		System.out.print("Enter Maximum Amount of Fuel It Can Assume : ");
		fuelCapacity = sc.nextDouble();
	}

	public double getFuelCapacity() {
		return fuelCapacity;
	}

	public void displayCarDetails() {
		System.out.println("Car Color : " + color);
		System.out.println("Manufaturing Year of Car : " + menufacturingYear);
		System.out.println("Car Model : " + modelName);
		System.out.println("Car Fuel Type : " + fuelType);
		System.out.println("Car Engin Size : " + enginSize);
		System.out.println("Maximum Amount of Fuel : " + fuelCapacity);
	}
	
}