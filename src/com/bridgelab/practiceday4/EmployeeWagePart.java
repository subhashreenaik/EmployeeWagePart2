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
		        switch(empType) {
		        case FULL_TIME:
			      {
				   System.out.println("Employee is workinf fulltime");
				   working_hour=8;
				   break;
			       }
			       case PART_TIME:
			       {
				   System.out.println("Employee is working parttime");
				   working_hour=4;
				   break;
			
			       }
			       default:
			       {
				   System.out.println("Employee is absent");
				   working_hour=0;
				   break;
			       }
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
		