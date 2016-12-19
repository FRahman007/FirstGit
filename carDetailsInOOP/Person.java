package carDetailsInOOP;

import java.util.Scanner;

public abstract class Person {
	
	protected String name;
	protected int id;
	protected String address;
	
Scanner scanner = new Scanner(System.in);
    
    protected void inputName() {
		System.out.print("Enter Name : ");
		name = scanner.nextLine();
	}
    
    protected String getName() {
		return name;
	}
    
    protected void inputId() {
		System.out.print("Enter ID : ");
		id = scanner.nextInt();
	}
    
    protected int getId() {
		return id;
	}
    
    protected void inputAddress() {
		System.out.print("Enter Address : ");
		address = scanner.next();
	}
    
    protected String getAddress() {
		return address;
	}
    
    public void printSellerInfo() {
    	System.out.println("Name : " + name);
    	System.out.println("ID : " + id);
    	System.out.println("Address : " + address);
    }
}
