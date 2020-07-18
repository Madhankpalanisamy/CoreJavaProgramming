package org.accenture.training.day3;

interface Vehicle{
	
	public int averageSpeed=40;

	
	final public static int b =25;
	public static final int c=20;
	public final static int d=58;
	
	
	void move();
}


class Auto implements Vehicle{

	@Override
	public void move() {
		System.out.println("Move method implemted");
		System.out.println("Average speed of auto is : "+averageSpeed );
		
		//averageSpeed++; //final variable we cannot modify;
		
	}
	
}


public class InterfaceVariables {

	public static void main(String[] args) {
		Vehicle obj =  new Auto();
		obj.move();
		System.out.println("interface variable default access modifier is static : "+  Vehicle.averageSpeed);
		
		
	}

}
