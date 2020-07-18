package org.accenture.training.day2;


class StaticDemo{
	
	int a=0;
	static int b = 20;
	
	public static void display() {
		
		//System.out.println(a);
		
		System.out.println("Only static variable can access the static method: " +b);

	}
	
	public void show() {
		System.out.println("Non static Mehtod: "+ a + "===" + b);

	}
	
}
	

public class StaticMethod {

	public static void main(String[] args) {
		
		
		StaticDemo obj = new StaticDemo();
		obj.show();
		StaticDemo.display();

	}

}
