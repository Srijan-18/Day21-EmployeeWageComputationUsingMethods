package com.employeeWageUsingMethods;

class EmployeeWageViaMethods 
{
	public static void main(String args[])
	{	
		final int isPresent=1;
		int empDailyWage=0, empDailyHours=0, empWagePerHour=20;
		System.out.println("Welcome to Employee Wage Computation Program");
		int empCheck=(int)(Math.floor(Math.random()*10)%2);
		if(empCheck==isPresent)
		{	
			System.out.println("Employee is Present");
			empDailyHours=8;
		}	
		else
			System.out.println("Employee is Absent");
		empDailyWage=empDailyHours*empWagePerHour;
		System.out.println("Today's Wage of Employee is :"+empDailyWage);
	}
}
