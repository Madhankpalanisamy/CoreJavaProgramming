package org.accenture.training.day2;

public class MethodOverLoading {
	
	public void studentInfo(int studentRollNo ) {
		
		System.out.println("Student Roll No" + "\t" + studentRollNo);
	}

	public void studentInfo(int studentRollNo, String studentName) {
	
	System.out.println("Student Roll No" + "\t" + studentRollNo + "\t" + "studentName" + studentName);

	}
	
	public void studentInfo(int studentRollNo, String studentName, int studentAge ) {
		
		System.out.println("Student Roll No" + "\t" + studentRollNo + "\t" + "studentName" + studentName + "\t"+ "studentAge" + studentAge );
	}

	public static void main(String[] args) {
		MethodOverLoading obj = new MethodOverLoading();
		obj.studentInfo(1);
		obj.studentInfo(1, "Madhan");
		obj.studentInfo(1, "Madhan", 25);

	}

}
