package com.greatlearning.iitr.fullstacktraining.java.oops.departments;

public class TechDepartment extends SuperDepartment {
	public String departmentName = "Hr Department";
	public String todayWork = "Complete coding of module 1";
	public String workDeadLine = "Complete by EOD ";
	public String techStackInformation = "Core Java";

	public TechDepartment() {
		System.out.println("Welcome to Tech Department");
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

	public String getTechStackInformation() {
		return this.techStackInformation;
	}
}
