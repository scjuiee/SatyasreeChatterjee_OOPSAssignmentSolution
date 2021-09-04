package com.greatlearning.iitr.fullstacktraining.java.oops.departments;

public class SuperDepartment {

	public String departmentName = "Super Department";
	public String todayWork = "No Work as of now";
	public String workDeadLine = "Nil";
	public String holidayStr = "Today is not a holiday";

	public String getDepartmentName() {
		return this.departmentName;
	}

	public String getTodaysWork() {
		return this.todayWork;
	}

	public String getWorkDeadline() {
		return this.workDeadLine;
	}

	public String isTodayAHoliday() {
		return this.holidayStr;
	}

}
