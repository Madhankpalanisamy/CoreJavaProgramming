package org.accenture.training.day3;

class Employee{
	
	public void display() {
		System.out.println("Parent----> Employee class");

	}
}


class Manager extends Employee {
	
	public void display() {
		System.out.println("Child-----> Manager Class");
	}
}


public class Overriding {

	public static void main(String[] args) {
		
		//Priority would be local class methods
		Employee emp = new Employee();
		emp.display();
		
		Manager man = new Manager();
		man.display();
		
	}

}
