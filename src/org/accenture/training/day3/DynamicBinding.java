package org.accenture.training.day3;

class Bank{
	public void houseLoanIntrest() {
		System.out.println("Bank Intrest 5 %");
		}
	
}

class SBI extends Bank{
	
	
	@Override
	public void houseLoanIntrest() {
		System.out.println("SBI Intrest 10 %");
	}
	}

	
class ICICI extends Bank {
	
	@Override
	public void houseLoanIntrest() {
		System.out.println("ICICI Intrest 15 %");
		
	}
	
	public void show() {
		System.out.println("Concrete Method of ICICI Class");

	}
	
}

public class DynamicBinding {

	public static void main(String[] args) {
		
		Bank ban = new Bank();  //Static Binding
		ban.houseLoanIntrest();
		
		ban= new SBI();//Dynamic Binding : Runtime object control goes to another class 
		ban.houseLoanIntrest();
	
		
		ban = new ICICI();
		ban.houseLoanIntrest();
		
		ICICI ic = new ICICI();
		ic.show();
		
	}

}
