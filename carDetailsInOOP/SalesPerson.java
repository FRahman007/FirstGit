package carDetailsInOOP;

import java.util.Scanner;

public class SalesPerson extends Person {
		
	    private double monthlySalary;
	    private double yearlySalary;
	    private final double partTimeBonus = 0.02;

	    Scanner scanner = new Scanner(System.in);
	    
	    protected void inputMmonthlySalary() {
	    	System.out.print("Enter Monthly Salary : ");
	    	monthlySalary = scanner.nextDouble();
	    }
	    
	    protected double getMonthlySalary() {
	    	return monthlySalary;
	    }
	    
	    protected void printMonthlySalary() {
	    	System.out.println("Monthly Salary : " + monthlySalary);
	    } 
	    
	    protected double getYearlySalary() {
	    	yearlySalary = getMonthlySalary() + (getMonthlySalary()* partTimeBonus) + (getMonthlySalary() * 12);
			return yearlySalary;
		}
	    
	    protected void printYearlySalary() {
	    	System.out.println("Yearly Salary for SalesPerson is : " + getYearlySalary());
	    }

}
