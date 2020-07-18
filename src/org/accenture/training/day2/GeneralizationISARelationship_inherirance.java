package org.accenture.training.day2;

class Fruit{
	
	String color;
	
	public void parentMethod() {
		System.out.println("Parent class method");

	}
	
}


class Apple extends Fruit{
	
	public void childMethod() {
		color = "red";
		System.out.println("Child class Method");

	}
}



public class GeneralizationISARelationship_inherirance {

	public static void main(String[] args) {
		
		Apple ap = new Apple();
		ap.childMethod();
		
		ap.parentMethod();
		
		Fruit fr= new Apple();
		fr.parentMethod();

	}

}
