package org.accenture.training.day3;

class EmployeeResource{
	
	int EmpAge = 20;
	
	public void displayDetails() {
		System.out.println("Message from Parent class--->EmployeeResource");
		System.out.println("Employee Age is: "+EmpAge);
	}
}

class ManagerResource extends EmployeeResource {
	
	int EmpAge = 30;
	
	public void displayDetails() {
		System.out.println("Message from Parent class--->ManagerResource");
		System.out.println("Employee Age is: "+EmpAge);
	}
	
	public void showDetails() {
		System.out.println("I want to call the displayDetails method from base class");
		super.displayDetails();
		
		System.out.println("I want to call the displayDetails method from base class : "+super.EmpAge);
}
	
}

public class SuperKeywordOverriding {

	public static void main(String[] args) {
		ManagerResource man = new ManagerResource();
		man.displayDetails();
		man.showDetails();
		}

}
