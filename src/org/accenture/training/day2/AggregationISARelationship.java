package org.accenture.training.day2;

//Loosely coupled

class Parent{

	public void swim() {
		System.out.println("Parent skill is swim");

	}
}
	
	class Child{
		
		public void invokingparentskill() {
			
			Parent par = new Parent();
			par.swim();
			System.out.println("Utilized parent skill set in child class using"
					+ " creating parent class object "
					+ "in child class");

		}
		
		public void signing() {
			System.out.println("child skill is signing");
			
			

		}
	}
	
	
	public class AggregationISARelationship {
		public static void main(String[] args) {
			
			Child ch = new Child();
			ch.invokingparentskill();
			ch.signing();
			
		}
	}
	




