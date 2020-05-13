package com.employeeWageUsingMethods;

class EmployeeWageViaMethods 
{	
	static final int IS_FULL_TIME=1 ,IS_PART_TIME=2;
	static int workingHoursComputation(int empCheck)
	{
		int empDailyHours;
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
	//computation of Monthly wage and its display	
	static void monthlyWageComputation(String companyName,int maxWorkingDays,int maxWorkingHours, int wagePerHour)
	{
		int empDailyWage=0, empDailyHours=0, empMonthlyWage=0, empWorkingHours=0, empWorkingDays=0;
		while(empWorkingDays<=maxWorkingDays && empWorkingHours<maxWorkingHours)
		{	
			int empCheck=(int)(Math.floor(Math.random()*10)%3);
			empDailyHours=workingHoursComputation(empCheck);	
			empDailyWage=empDailyHours*wagePerHour;
			empMonthlyWage+=empDailyWage;
			empWorkingDays++;
			empWorkingHours+=empDailyHours;
		}
		System.out.println("Monthly Wage of Employee for "+companyName+" is :"+empMonthlyWage);
	}
	public static void main(String args[])
	{	//welcome message
		System.out.println("Welcome to Employee Wage Computation Program");		
		monthlyWageComputation("D-mart",20,100,20);	
		monthlyWageComputation("Reliance",22,120,15);
		
		
	}
}
