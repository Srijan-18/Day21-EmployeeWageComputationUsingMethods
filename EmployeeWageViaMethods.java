package com.employeeWageUsingMethods;

class EmployeeWageViaMethods {
	static final int IS_FULL_TIME=1 ,IS_PART_TIME=2;
	String company;
	int maxWorkingDays, maxWorkingHours, empWagePerHour;
	public EmployeeWageViaMethods(String company,int empWagePerHour, int maxWorkingDays, int maxWorkingHours)
	{
		this.company=company;
		this.empWagePerHour=empWagePerHour;
		this.maxWorkingDays=maxWorkingDays;
		this.maxWorkingHours=maxWorkingHours;
	}
	static int workingHoursComputation(int empCheck)
	{	int empDailyHours=0;
		switch (empCheck)
		{
			case IS_FULL_TIME :
				empDailyHours=8;
			break;
			case IS_PART_TIME :
				empDailyHours=4;
			break;
			default :
				empDailyHours=0;
				}
		return empDailyHours;
	}
	//computation of Monthly wage with maximum working days in a month according to company	
	void monthlyWageComputation()
	{	
		int empDailyWage, empWorkingDays=0,empWorkingHours=0, empMonthlyWage=0;
		while(empWorkingDays<=maxWorkingDays && empWorkingHours<maxWorkingHours)
		{	
			int empCheck=(int)(Math.floor(Math.random()*10)%3);
			int empDailyHours=workingHoursComputation(empCheck);	
			empDailyWage=empDailyHours*empWagePerHour;
			empMonthlyWage+=empDailyWage;
			empWorkingDays++;
			empWorkingHours+=empDailyHours;
		}
		System.out.println("Total Employee wage for company "+ company +" is " +empMonthlyWage);
	}
	public static void main(String args[])
	{	//welcome message
		System.out.println("Welcome to Employee Wage Computation Program");		
		EmployeeWageViaMethods dmart=new EmployeeWageViaMethods("D-mart",20,20,120);
		dmart.monthlyWageComputation();
		EmployeeWageViaMethods reliance=new EmployeeWageViaMethods("Reliance",15,22,140);
		reliance.monthlyWageComputation();
	}
}
