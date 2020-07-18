package org.accenture.training.day2;

class ParentClass{
	
	int a;
	
	public ParentClass() {
		a=10;
		System.out.println("Parent class constructor : "+a);
	}
}


class ChildClass extends ParentClass {
	
	
	public ChildClass() {
		super();
		System.out.println("Child class constructor : "+a);
	}
	
}


public class ConstructorChanining {

	public static void main(String[] args) {
		
		//1st step ----> Parent constructor get invoked first then child constructor get executed
		ChildClass ch = new ChildClass();
		//ParentClass par = new ParentClass();
		

	}

}
