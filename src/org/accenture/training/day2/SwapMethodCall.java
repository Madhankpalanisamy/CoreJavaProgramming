package org.accenture.training.day2;

public class SwapMethodCall {
	
	public int swap(int num1, int num2) {   //Formal parameter 
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("Swapped Values: "+num1 + "<-->"+ num2);
		int c = num1+num2;
		System.out.println("Printing the C value: "+c);
		return c;
		//System.out.println("Commenting the below code because of return statement, control can't goes to the next statement");
		//System.out.println("Printing the C value: "+c);
		
		

	}
	

	public static void main(String[] args) {
		int number1 = 90;
		int number2 = 60;
		System.out.println("Actual Values: "+number1 + "<-->"+ number2);
		SwapMethodCall swp = new SwapMethodCall();
		int result = swp.swap(number1, number2); //Actual Parameter
		System.out.println("Returned Result is : "+result);
	}

}
