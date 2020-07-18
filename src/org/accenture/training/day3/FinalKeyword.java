package org.accenture.training.day3;

	class ParentClassA{
		
		final float pi = 3.14f;
		
		public final void display() {
			System.out.println("Final Method cannot be Over ridden");

		}
		
	}
	
	final class ParentClassB{
		
		public void show() {
			System.out.println("Final class Cannot be inherited");

		}
	}
	
	
/*class child extends ParentClassB{
		
		
	}*/
	
	
	class child extends ParentClassA{
		public void print() {
			System.out.println("Value of pi "+pi);
			System.out.println();
			
			//pi++;
			
			/*public final display()	{
				
			}*/

		}
		
	}
	

public class FinalKeyword {

	public static void main(String[] args) {
		
		ParentClassA obj = new ParentClassA();
		System.out.println(obj.pi);
		obj.display();
		

	}

}
