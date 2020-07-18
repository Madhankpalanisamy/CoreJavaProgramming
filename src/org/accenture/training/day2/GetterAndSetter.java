package org.accenture.training.day2;

public class GetterAndSetter {
	
	private int employeeId;
	private float basicpay;
	
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public float getBasicpay() {
		return basicpay;
	}

	public void setBasicpay(float basicpay) {
		this.basicpay = basicpay;
	}
	

	public static void main(String[] args) {
	GetterAndSetter	gs = new GetterAndSetter();
	gs.setEmployeeId(101);
	gs.setBasicpay(10000.00f);
	System.out.println("Employee Id: "+gs.getEmployeeId());
	System.out.println("Employee Basic Pay: "+gs.getBasicpay());

	}

}
