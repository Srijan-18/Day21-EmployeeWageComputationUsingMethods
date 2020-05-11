package com.employeeWageUsingMethods;

class EmployeeWageViaMethods 
{
	public static void main(String args[])
	{	
		final int isFullTime=1 ,isPartTime=2;
		int empDailyWage=0, empDailyHours=0, empWagePerHour=20;
		System.out.println("Welcome to Employee Wage Computation Program");
		int empCheck=(int)(Math.floor(Math.random()*10)%3);
		switch (empCheck)
		{
			case isFullTime :
				System.out.println("Employee is Present");
				empDailyHours=8;
			break;
			case isPartTime :
				System.out.println("Employee is present part time");
				empDailyHours=4;
			break;
			default :
				System.out.println("Employee is Absent");
		}	
		empDailyWage=empDailyHours*empWagePerHour;
		System.out.println("Today's Wage of Employee is :"+empDailyWage);
	}

}
