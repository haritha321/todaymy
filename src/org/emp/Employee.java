package org.emp;

public class Employee {
	
	
	private void empId() {
		 System.out.println("empId");
		 
	}
	
	private void empName() {
		System.out.println("jenith");
	}

	private void empDob() {
		System.out.println("05-05-95");
	}
	
	private void empPhone() {
		System.out.println("8682985133");
	}
	
	private void empEmail() {
		System.out.println("jenith@gmail.com");
	}
	
	private void empAddress() {
		System.out.println("no 48, cornelious street");
		
	}
	
	
	public static void main(String[] args) {
		
		Employee e=new Employee();
		
		e.empId();
		e.empName();
		e.empDob();
		e.empPhone();
		e.empEmail();
		e.empAddress();
		
	}
	
	
	
	
	
	
	
	
	
	
}
