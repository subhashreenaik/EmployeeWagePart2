package com.bridgelab.practiceday4;

public class EmployeeWagePart {

	//Declaring constant
	final static int FULL_TIME=1;
	final static int PART_TIME=2;
	final static int WAGE_PER_HOUR=20;
	final static int WORKINGDAY_MONTH=20;
	final int FULL_DAY_HOUR=8;
	final int PART_TIME_HOUR=4;
		
		//Variable declaring
		static int working_hour=0;
		static int total_wage=0;
		
		//This method returns daily wage of employee
		 int computeDailyWage() {

			 for(int day=1;day<=WORKINGDAY_MONTH;day++) {

			        int empType = (int) (Math.random() * 10) % 3;
			        switch(empType) {
			        case FULL_TIME:
				      {
					   working_hour=8;
					   break;
				       }
				       case PART_TIME:
				       {
					   working_hour=4;
					   break;
				
				       }
				       default:
				       {
					   working_hour=0;
					   break;
				       }
			        }
			        
			        int wage = working_hour*WAGE_PER_HOUR;
			        total_wage +=wage;
			        
				}
					
					return total_wage;
				}
		

	 public static void main(String[] args) {
		 EmployeeWagePart emp =new EmployeeWagePart();
		 System.out.println("total empoyee wage for a month is  "+emp.computeDailyWage());
		 
	 }
}
		