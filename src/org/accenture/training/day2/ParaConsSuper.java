package org.accenture.training.day2;

class ParentClass1{
	
	int a;
	
	public ParentClass1(int x) {
		System.out.println("Parent class int para constructor "); 	
		a=x;
	}
	
	public void display() {
		System.out.println("The value of a is:"+a);

	}
	
}


class ch extends ParentClass1 {
	
	public ch() {
		super(6);
		System.out.println("Child class constructor");
	}
}


public class ParaConsSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ch h = new ch();
		h.display();

	}

}
