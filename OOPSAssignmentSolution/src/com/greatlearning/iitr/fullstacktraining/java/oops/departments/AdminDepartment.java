package com.greatlearning.iitr.fullstacktraining.java.oops.departments;

public class AdminDepartment extends SuperDepartment{

	public String departmentName = "Admin Department ";
	public String todayWork = "Complete your documents Submission";
	public String workDeadLine="Complete by EOD";
	
	public AdminDepartment() {
		System.out.println("Welcome to Admin department");
	}
	
	public String getDepartmentName() {
		return this.departmentName;
	}
	
	public String getTodaysWork() {
		return this.todayWork;
	}
	
	public String getWorkDeadline() {
		return this.workDeadLine;
	}
	
}
