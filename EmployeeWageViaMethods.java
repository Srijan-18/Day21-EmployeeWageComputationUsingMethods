package com.employeeWageUsingMethods;

import java.util.ArrayList;

interface IEmployeeWageViaMethods
{
	public void addCompany(String company, int maxWorkingDays, int maxWorkingHours,int empWagePerHour);
	public int workingHoursComputation(int empCheck);
	public void monthlyWageComputation();
}
class EmployeeWageViaMethods implements IEmployeeWageViaMethods 
{
	static final int IS_FULL_TIME=1 ,IS_PART_TIME=2;
	String company;
	private ArrayList<CompanySpecifics> companySpecificsArrayList;
	
	public EmployeeWageViaMethods()
	{
		companySpecificsArrayList=new ArrayList<CompanySpecifics>();
	}
	
	public void addCompany(String company, int maxWorkingDays, int maxWorkingHours,int empWagePerHour)
	{	
		CompanySpecifics companySpecifics=new CompanySpecifics(company,maxWorkingDays,maxWorkingHours,empWagePerHour);
		companySpecificsArrayList.add(companySpecifics);
	}
	//Daily Working Hours Selection
	public int workingHoursComputation(int empCheck)
	{	
		int empDailyHours=0;
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
	//computation of Monthly wage with maximum working days according to company	
	public void monthlyWageComputation()
	{	
		for (int i=0;i<companySpecificsArrayList.size();i++)
		{
			CompanySpecifics companySpecifics=companySpecificsArrayList.get(i);
			int empDailyWage, empWorkingDays=0,empWorkingHours=0, empMonthlyWage=0;
			while(empWorkingDays<=companySpecifics.maxMonthlyDays && empWorkingHours<companySpecifics.maxMonthlyHours)
			{	
				int empCheck=(int)(Math.floor(Math.random()*10)%3);
				int empDailyHours=this.workingHoursComputation(empCheck);	
				empDailyWage=empDailyHours*companySpecifics.wagePerHour;
				empMonthlyWage+=empDailyWage;
				empWorkingDays++;
				empWorkingHours+=empDailyHours;
			}
			System.out.println("Total Employee wage for company "+ companySpecifics.companyName +" is " +empMonthlyWage);
		}
	}
	public static void main(String args[])
	{	//welcome message
		System.out.println("Welcome to Employee Wage Computation Program");		
		EmployeeWageViaMethods employeeWage=new EmployeeWageViaMethods();
		employeeWage.addCompany("D-mart", 10, 80, 50);
		employeeWage.addCompany("Reliance", 20, 120, 40);
		employeeWage.addCompany("BigBasket", 22, 130, 100);
		employeeWage.monthlyWageComputation();
	}
}
class CompanySpecifics
{
	public final String companyName;
	public final int maxMonthlyDays;
	public final int maxMonthlyHours;
	public final int wagePerHour;

	public CompanySpecifics(String companyName,int maxMonthlyDays,int maxMonthlyHours,int wagePerHour)
	{
		this.companyName=companyName;
		this.maxMonthlyDays=maxMonthlyDays;
		this.maxMonthlyHours=maxMonthlyHours;
		this.wagePerHour=wagePerHour;
	}
}
