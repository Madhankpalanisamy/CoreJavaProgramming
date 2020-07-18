package org.accenture.training.day3;

interface Myinterface1{
	void method1(String str);
}

interface Myinterface2{
	void method2();
}

interface Myinterface3 extends Myinterface1,Myinterface2 {
	void method3();
}

class Myclass implements Myinterface3{

	@Override
	public void method1(String str) {
		System.out.println("Method 1: String to display :: "+str);
		
	}

	@Override
	public void method2() {
		System.out.println("Method is implemented in myclass ");
		
	}

	@Override
	public void method3() {
		System.out.println("Method is implemented in myclass ");
		
	}
	
}


public class TwoInterfaceInheritebyChildClass {

	public static void main(String[] args) {
		Myinterface3 myint3 = new Myclass();
		myint3.method1("Madhan");
		myint3.method2();
		myint3.method3();

	}

}
