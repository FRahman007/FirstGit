package carDetailsInOOP;

import java.util.Scanner;

public class Main {

	private static Scanner myScanner;

	public static void main(String[] args) {
		
		myScanner = new Scanner(System.in);
		
		System.out.println("\n----------- WELCOME TO THE CAR-SHOP -----------");
		
		System.out.print("\nEnter The Number of Customers Do You Want : ");
		int x = myScanner.nextInt();
		
		Customers[] customers = new Customers[x];
		
		for(int i = 0;i < x;i++) {
			System.out.println("Enter Customer's details : " + (i + 1));
			customers[i] = new Customers();
			customers[i].inputName();
			customers[i].inputId();
			customers[i].inputAddress();
			customers[i].setCountryName();
		}
		
		for(int i = 0;i < x;i++) {
			System.out.println("Customer's details : " + (i + 1));
			customers[i].printSellerInfo();
		}
					
		System.out.print("\n----------*********-----------");
		System.out.print("\n\nWe have Toyota, Mazda and BMW. Which Car Do You Want To Buy ? - ");
		
		String manufacturerName = myScanner.next();
		switch(manufacturerName) {
		case "Toyota" :
			System.out.print("Enter The Number of TOYOTA Cars Do You Want To Buy : ");
			int a = myScanner.nextInt();
			Toyota[] toyotas = new Toyota[a];
			
			for(int i = 0;i < a;i++) {
			System.out.println("Input for Toyota Car : " + (i + 1));
				toyotas[i] = new Toyota();
				toyotas[i].setModelName();
				toyotas[i].setMenufacturingYear();
				toyotas[i].setColor();
				toyotas[i].setEnginSize();
				toyotas[i].setFuelCapacity();
				toyotas[i].setFuelType();
				toyotas[i].setPrice();
				toyotas[i].setAvailability(true);				
			}
			
			for(int i = 0;i < a;i++) {
			System.out.println("Print Toyota -" + (i + 1) + " info : ");
				toyotas[i].displayCarDetails();
				toyotas[i].disPlayCarDetailsOfToyota();
			}
			
			for(int i = 0;i < a ;i++) {
				System.out.println("\n--- Add To Cart ---\n");
				
				System.out.print("Pay money : ");
					double priceWithTax = myScanner.nextDouble();
					toyotas[i].addToCart(priceWithTax);
					toyotas[i].setPassword();
					toyotas[i].matchPassword("toyota");
					toyotas[i].welcomeBuyerForToyota();
			}
			break;
			
			case "Mazda" : 
			System.out.print("Enter The Number of MAZDA Cars Do You Want To Buy  : ");
			int b = myScanner.nextInt();
			
			Mazda[] mazdas = new Mazda[b];
			for(int i =0 ;i < b;i++) {
				System.out.println("Input for Mazda car : " + (i + 1));
				mazdas[i] = new Mazda();
				mazdas[i].setModelName();
				mazdas[i].setMenufacturingYear();
				mazdas[i].setColor();
				mazdas[i].setEnginSize();
				mazdas[i].setFuelCapacity();
				mazdas[i].setFuelType();
				mazdas[i].setPrice();
				mazdas[i].setAvailability(true);
			}
			
			for(int i = 0;i < b;i++) {
				System.out.println("Print Mazda -" + (i + 1) + " info : ");
					mazdas[i].displayCarDetails();
					mazdas[i].disPlayCarDetailsOfMazda();
			}
				
			for(int i = 0;i < b ;i++) {
				System.out.println("--- Add To Cart ---");
				
				System.out.print("Pay money : ");
					double priceWithTax = myScanner.nextDouble();
					mazdas[i].addToCart(priceWithTax);
					mazdas[i].setPassword();
					mazdas[i].matchPassword("mazda");
					mazdas[i].welcomeBuyerForMazda();
			}
			break;
			
			case "BMW" : 
				System.out.print("Enter The Number of BMW Cars Do You Want To Buy 	 : ");
				int c = myScanner.nextInt();
				
				BMW[] bmws = new BMW[c];
				for(int i = 0 ;i < c;i++) {
					System.out.println("Input for BMW car : " + (i + 1));
					bmws[i] = new BMW();
					bmws[i].setModelName();
					bmws[i].setMenufacturingYear();
					bmws[i].setColor();
					bmws[i].setEnginSize();
					bmws[i].setFuelCapacity();
					bmws[i].setFuelType();		
					bmws[i].setPrice();
					bmws[i].setAvailability(true);
				}
				
				for(int i = 0;i < c;i++) {
					System.out.println("Print BMW -" + (i + 1) + " info : ");
						bmws[i].displayCarDetails();
						bmws[i].disPlayCarDetailsOfBMW();
				}
					
				for(int i = 0;i < c;i++) {
					System.out.println("\n--- Add To Cart ---\n");
					
					System.out.print("Pay money : ");
						double priceWithTax = myScanner.nextDouble();
						bmws[i].addToCart(priceWithTax);
						bmws[i].setPassword();
						bmws[i].matchPassword("bmw");
						bmws[i].welcomeBuyerForBMW();
				}
				break;
				default : System.out.println("Invalid choice!!!");
				          System.exit(0);
			}
		
		System.out.print("\nEnter The Number of Managers Do You Want : ");
		int d = myScanner.nextInt();
		Manager[] mangers = new Manager[d];
		for(int i = 0;i < d;i++) {
			mangers[i] = new Manager();
			mangers[i].inputName();
			mangers[i].inputId();
			mangers[i].inputAddress();
			mangers[i].inputMmonthlySalary();
		}
		
		for(int i = 0;i < d;i++) {
			mangers[i].printSellerInfo();
			mangers[i].printMonthlySalary();
			mangers[i].printYearlySalary();
		}
		
		System.out.print("\n----------*********-----------");

		System.out.print("\n\nEnter The Number of SalesPersons Do You Want : ");
		int e = myScanner.nextInt();
		SalesPerson[] salesPersons = new SalesPerson[e];
		
		for(int i = 0;i < e;i++) {
			salesPersons[i] = new SalesPerson();
			salesPersons[i].inputName();
			salesPersons[i].inputId();
			salesPersons[i].inputAddress();
			salesPersons[i].inputMmonthlySalary();
		}
		
		for(int i = 0;i < e;i++) {
			salesPersons[i].printSellerInfo();
			salesPersons[i].printMonthlySalary();
			salesPersons[i].printYearlySalary();
		}
	}
	
}

