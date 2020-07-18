package org.accenture.training.day2;

public class ConstructorOverloading {
	
	public ConstructorOverloading(int studentRollNo) {
		
		System.out.println("Student Roll No" + "\t" + studentRollNo);
	}
	
	public ConstructorOverloading(int studentRollNo, String studentName) {
		
		System.out.println("Student Roll No" + "\t" + studentRollNo + "\t" + "studentName" + "\t" + studentName);

		}
		
	public ConstructorOverloading(int studentRollNo, String studentName, int studentAge ) {
			
			System.out.println("Student Roll No" + "\t" + studentRollNo + "\t" + "studentName" + "\t" + studentName + "\t"+ "studentAge" +  "\t" + studentAge );
		}

	

	public static void main(String[] args) {
		ConstructorOverloading obj = new ConstructorOverloading(1);
		ConstructorOverloading obj1 = new ConstructorOverloading(1, "Madhan");
		ConstructorOverloading obj2 = new ConstructorOverloading(1, "Madhan", 25);
	}

}
