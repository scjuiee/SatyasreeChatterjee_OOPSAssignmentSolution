package com.greatlearning.iitr.fullstacktraining.java.oops.departments;

public class Main {
	
	public static void main(String args[]) {
		//Invoking Admin Department
		invokeAdminDepartment();
		System.out.println("");
		
		//Invoking HR Department
		invokeHRDepartment();
		System.out.println("");
		
		//Invoking Tech Department
		invokeTechDepartment();

	}
	
	static void invokeAdminDepartment() {
		AdminDepartment adminDepartment = new AdminDepartment();
		System.out.println(adminDepartment.getTodaysWork());
		System.out.println(adminDepartment.getWorkDeadline());
		System.out.println(adminDepartment.isTodayAHoliday());
	}
	
	static void invokeHRDepartment() {
		HRDepartment hrDepartment = new HRDepartment();
		System.out.println(hrDepartment.doActivity());
		System.out.println(hrDepartment.getTodaysWork());
		System.out.println(hrDepartment.getWorkDeadline());
		System.out.println(hrDepartment.isTodayAHoliday());
	}
	
	static void invokeTechDepartment() {
		TechDepartment techDepartment = new TechDepartment();
		
		System.out.println(techDepartment.getTodaysWork());
		System.out.println(techDepartment.getWorkDeadline());
		System.out.println(techDepartment.getTechStackInformation());
		System.out.println(techDepartment.isTodayAHoliday());
	}

}
