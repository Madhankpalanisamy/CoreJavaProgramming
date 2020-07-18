package org.accenture.training.day3;

interface PManager{
	
	public abstract void doActivity1();
	public abstract void doActivity2();
}

class Programer implements PManager{

	@Override
	public void doActivity1() {
		System.out.println("Implementation of Activity1");
		
	}

	@Override
	public void doActivity2() {
		System.out.println("Implementation of Activity2");
		}
	
	public void ownActivity() {
		System.out.println("Child class own activity");
	}
	
	
}


public class Interface {

	public static void main(String[] args) {
		PManager obj	= new Programer();
		obj.doActivity1();
		obj.doActivity2();
		
		Programer pobj= new Programer();
		pobj.ownActivity();
		

	}

}
