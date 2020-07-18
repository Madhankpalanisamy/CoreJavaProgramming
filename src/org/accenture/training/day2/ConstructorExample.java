package org.accenture.training.day2;

public class ConstructorExample {
	
	String trainingType;
	int trainingDays;
	String trainingName;
	
	//Constructor calling
	public ConstructorExample(String tType,
	int tDays,
	String tName) {
		trainingType=tType; 
		trainingDays=tDays;
		trainingName=tName;
	}

	public static void main(String[] args) {
		
		ConstructorExample cons = new ConstructorExample("Lateralpgm",15,"JavaStream");
		ConstructorExample newcons = new ConstructorExample("Fresherlpgm",22,"JavaStream");
		System.out.println(cons.trainingType);
		System.out.println(cons.trainingDays);
		System.out.println(cons.trainingName);
		
		System.out.println(newcons.trainingType);
		System.out.println(newcons.trainingDays);
		System.out.println(newcons.trainingName);
	}

}
