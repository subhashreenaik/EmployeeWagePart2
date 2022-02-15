package com.bridgelab.practiceday4;

public class EmployeeWagePart {

	//Declaring constant
		final static int FULL_TIME=1;
		final static int PART_TIME=2;
		final static int WAGE_PER_HOUR=20;
		final int FULL_DAY_HOUR=8;
		final int PART_TIME_HOUR=4;
		
		//Variable declaring
		static int working_hour=0;
		
		//This method returns daily wage of employee
		 int computeDailyWage() {

	        int empType = (int) (Math.random() * 10) % 3;
	        if (empType == FULL_TIME)
	        {
	            System.out.println("Employee is working fulltime");
	            working_hour=8;

	        }else if (empType == PART_TIME)
	        {
	            System.out.println("Employee is working parttime");
	            working_hour=4;

	        }
	        else
	        {
	        	System.out.println("Employee is absent");
	        }
	        
	        int wage = working_hour*WAGE_PER_HOUR;
	        
			return wage;
		}
		
		

	 public static void main(String[] args) {
		 
		 //creation of object
		 EmployeeWagePart emp=new EmployeeWagePart();
		 System.out.println("Employee Daily Wage is " + emp.computeDailyWage());
		       	
		        
		    }
		}
		