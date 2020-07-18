package org.accenture.training.day1;

public class IfElseIf {

	public static void main(String[] args) {
		int marks = 75;
		if(marks<50) {
			System.out.println("Failed");	
		}
		//            75>=50 && 75<60
		else if ((marks>=50) && (marks<60)) {
			System.out.println("Grade D");
			}
		//				75>=50 && 75<60
		else if ((marks>=60) && (marks<70)) {
			System.out.println("Grade c");
			}
		else if ((marks>=70) && (marks<80)) {
			System.out.println("Grade b");
			}
		else if ((marks>=80) && (marks<90)) {
			System.out.println("Grade a");
			}
		else if ((marks>=90) && (marks<100)) {
			System.out.println("Grade a+");
			}
		else {
			System.out.println("Condition Invalid");
		}
			
		}

	}


