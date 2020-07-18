package packagelevelvaraibales;

public class AccessModify {
	
	private int a =10;
	protected int b=20;
	public int c=20;
	int d =20;
	
	protected void accessmodifyProctedMethod() {
		System.out.println("AccessModify===> Protected Access Modifier");
	}
	
	public void accessmodifyPublicMethod() {
		System.out.println("AccessModify===> Public Access Modifier");
	}
	
	private void accessmodifyPrivateMethod() {
		System.out.println("AccessModify===> Private Access Modifier");
	}
	
	
	 void accessmodifyDefaultMethod() {
		System.out.println("AccessModify===> Default Access Modifier");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
