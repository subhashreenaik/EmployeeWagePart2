package com.bridgelab.practiceday4;

public class EmployeeWagePart {

	//Declaring constant
	final static int WAGE_PER_HOUR=20;
	final int FULL_DAY_HOUR=8;
	
	//Variable declaring
	static int working_hour=0;
	
	//This method compute daily wage of employee
	 int computeDailyWage() {

        int empType = (int) (Math.random() * 10) % 2;
        if (empType == 1)
        {
            System.out.println("Employee is Present");
            working_hour=8;

        } else
        {
            System.out.println("Employee is Absent");
            working_hour=0;

        }
        int wage = working_hour*WAGE_PER_HOUR;
        
		return wage;
	}
	
	

 public static void main(String[] args) {
	 
	 EmployeeWagePart emp=new EmployeeWagePart();
	 System.out.println("Employee Daily Wage is " + emp.computeDailyWage());
	        
	    }
	}