package com.employeeWageUsingMethods;

class EmployeeWageViaMethods 
{	
	static final int isFullTime=1 ,isPartTime=2;
	static int empDailyWage=0, empDailyHours=0, empWagePerHour=20;
	static int empMonthlyWage=0 , empWorkingHours=0, empWorkingDays=0;
	
	static int workingHoursComputation(int empCheck)
	{
		switch (empCheck)
		{
			case isFullTime :
				empDailyHours=8;
			break;
			case isPartTime :
				empDailyHours=4;
			break;
			default :
				empDailyHours=0;
				}
		return empDailyHours;
	}
	//computation of Monthly wage with maximum working days in a month as 20	
	void monthlyWageComputation()
	{
		while(empWorkingDays<=20 && empWorkingHours<100)
		{	
			int empCheck=(int)(Math.floor(Math.random()*10)%3);
			empDailyHours=workingHoursComputation(empCheck);	
			empDailyWage=empDailyHours*empWagePerHour;
			empMonthlyWage+=empDailyWage;
			empWorkingDays++;
			empWorkingHours+=empDailyHours;
		}
		
	}
	public static void main(String args[])
	{	//welcome message
		System.out.println("Welcome to Employee Wage Computation Program");		
		EmployeeWageViaMethods employee=new EmployeeWageViaMethods();
		employee.monthlyWageComputation();
		System.out.println("Monthly Wage of Employee is :"+empMonthlyWage);
	}
}
