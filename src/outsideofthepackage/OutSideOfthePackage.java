package outsideofthepackage;

import packagelevelvaraibales.AccessModify;


public class OutSideOfthePackage extends AccessModify  {

	public static void main(String[] args) {
		
		AccessModify tyobj = new AccessModify();
		//public variables can be accessed by any of the class of the project
		System.out.println(tyobj.c);
		
		//Default variable any of the class with in a package
		//System.out.println(tyobj.d);
		
		//Protected with in a package
		//System.out.println(tyobj.b);
		
		//We cant access the private variable out side of the class
		//System.out.println(tyobj.a);
		
		
		//exobj.accessmodifyDefaultMethod();
				//exobj.accessmodifyProctedMethod(); //Relationship
				tyobj.accessmodifyPublicMethod();
				
				//exobj.accessmodifyPrivateMethod();
		
		
				OutSideOfthePackage exobj = new OutSideOfthePackage();
		
		System.out.println(exobj.c);
		
		//System.out.println(exobj.d);
		
		System.out.println(exobj.b);
		
		//exobj.accessmodifyDefaultMethod();
			exobj.accessmodifyProctedMethod();
			exobj.accessmodifyPublicMethod();
		
		//exobj.accessmodifyPrivateMethod();
			
			
			


	}

}
