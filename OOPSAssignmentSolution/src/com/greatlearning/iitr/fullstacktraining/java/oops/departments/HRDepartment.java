package com.greatlearning.iitr.fullstacktraining.java.oops.departments;

public class HRDepartment extends SuperDepartment {

	public String departmentName = "Hr Department";
	public String todayWork = "Fill today’s worksheet and mark your attendance";
	public String workDeadLine = "Complete by EOD ";
	public String activity = "team Lunch";

	public HRDepartment() {
		System.out.println("Welcome to HRDepartment");
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

	public String doActivity() {
		return this.activity;
	}

}
