package packagelevelvaraibales;

public class TryAccessingModifiers {

	public static void main(String[] args) {
		
		AccessModify tyobj = new AccessModify();
		//public variables can be accessed by any of the class of the project
		System.out.println(tyobj.c);
		
		//Default variable any of the class with in a package
		System.out.println(tyobj.d);
		
		//Protected with in a package
		System.out.println(tyobj.b);
		
		//We cant access the private variable out side of the class
		//System.out.println(tyobj.a);
		
		
		TryAccessingModifiers acobj = new TryAccessingModifiers();
		//System.out.println(acobj.c);
		
		//System.out.println(acobj.d);
		
		//System.out.println(acobj.b);
		
		tyobj.accessmodifyDefaultMethod();
		tyobj.accessmodifyProctedMethod();
		tyobj.accessmodifyPublicMethod();
		
		//tyobj.accessmodifyPrivateMethod();
		
	}

}
