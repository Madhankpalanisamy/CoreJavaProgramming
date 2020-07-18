package org.accenture.training.day3;

abstract class BankEntity {
	
	abstract int getRateOfIntrest();
	
	public void display() {
		System.out.println("Non Abstract method also there in abstract class");
	}
}


class SBIBank extends BankEntity {

	@Override
	int getRateOfIntrest() {
		System.out.println("5%");
		return 8;
	}
	
	public void show() {
		System.out.println("Concrete method of child class");

	}
}


public class AbstractClass {

	public static void main(String[] args) {
		SBIBank obj = new SBIBank();
		obj.display();
		obj.getRateOfIntrest();
		obj.show();
		
		

	}

}
