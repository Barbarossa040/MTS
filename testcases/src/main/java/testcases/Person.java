package testcases;

import java.util.Scanner;

public class Person {
	
	private String name;
	private double personLength;
	private double personWeight;
	Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {	 
		
		

	}
	
	public Person(){
		
		
		
	}
	
	public Person(String inputName, double inputLength, double inputWeight){
		
		this.name = inputName;
		this.personLength = inputLength;
		this.personWeight = inputWeight;
		
	}

	public void setPersonName(String newName) {
		
		this.name = newName;
		
	}

	public String getPersonName() {
		
		return name;
		
	}
	
	public void setPersonLength(double newPersonLength) {
		
		this.personLength = newPersonLength;
		
	}

	public double getPersonLength() {
		
		return personLength;
		
	}
	
	public void setPersonWeight(double newPersonWeight) {
		
		this.personWeight = newPersonWeight;
		
	}

	public double getPersonWeight() {
		
		return personWeight;
		
	}

}
