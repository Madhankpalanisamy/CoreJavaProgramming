package org.accenture.training.day1;


 		//Class is an blue print or template from which objects are created
		public class Training {
	
			String courseName;
			int courseCode;
			String startdate;
			String endDate;
			String trainerName;
			
			public void gFT() {
				
				courseName = "GreenfiledTraining";
				courseCode = 1;
				startdate ="04-05-2020";
				endDate ="04-07-2020";
				trainerName = "Vijay";
				
			System.out.println("************************************************");		
			System.out.println("Welcome to GFT Training");
			System.out.println("Cours Name is : "+courseName);
			System.out.println("Cours Code is : " +courseCode);
			System.out.println("Course Start Data is : "+startdate);
			System.out.println("Course End Data is : "+endDate);
			System.out.println("Trainer Name is : "+trainerName);
			System.out.println();
				

			}
			
			public void coreJavaProgramming() {
				courseName = "coreJavaProgramming";
				courseCode = 2;
				startdate ="04-05-2020";
				endDate ="07-05-2020";
				trainerName = "Vijay";
				
			System.out.println("************************************************");	
			System.out.println("Welcome to Core Java Programming Training");
			System.out.println("Cours Name is : "+courseName);
			System.out.println("Cours Code is : " +courseCode);
			System.out.println("Course Start Data is : "+startdate);
			System.out.println("Course End Data is : "+endDate);
			System.out.println("Trainer Name is : "+trainerName);
			System.out.println("************************************************");
			System.out.println();
				

			}
			
			public void advancedJava() {
				courseName = "advancedJava";
				courseCode = 3;
				startdate ="11-05-2020";
				endDate ="15-05-2020";
				trainerName = "Vijay";
			
			System.out.println("************************************************");
			System.out.println("Welcome to Advanced Java Training");
			System.out.println("Cours Name is : "+courseName);
			System.out.println("Cours Code is : " +courseCode);
			System.out.println("Course Start Data is : "+startdate);
			System.out.println("Course End Data is : "+endDate);
			System.out.println("Trainer Name is : "+trainerName);
			System.out.println("************************************************");
			System.out.println();

			}
	
	

		public static void main(String[] args) {
			
			Training train = new Training();
			train.gFT();
			train.coreJavaProgramming();
			train.advancedJava();
	

	}

}
