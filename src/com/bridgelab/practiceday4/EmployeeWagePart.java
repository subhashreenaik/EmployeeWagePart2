package com.bridgelab.practiceday4;

public class EmployeeWagePart {

	//Declaring constant
	final static int FULL_TIME=1;
	final static int PART_TIME=2;
	private final  int wage_per_hour;
	private final String company;
	private final int no_workingday;
	private final int MaxhourPerMonth;
	
	EmployeeWagePart(String company,int wage_per_hour,int no_workingday,int MaxhourPerMonth ){
		
		this.wage_per_hour=wage_per_hour;
		this.company = company;
		this.MaxhourPerMonth=MaxhourPerMonth;
		this.no_workingday=no_workingday;
		
	}
		
		
		//This method returns daily wage of employee
		  public int computeDailyWage(int wage_per_hour,int MaxhourPerMonth,int no_workingday,String company) {
		    	
		    	//Variable declaring
				 int working_hour=0;
				 int total_wage=0;
				 int totalhr=0;
				 int totalworkingdays=0;
				
			while(totalhr<=MaxhourPerMonth && totalworkingdays<no_workingday) {
	       	totalworkingdays++;

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
	        
	        totalhr +=working_hour;
		      
	}
			total_wage= totalhr * wage_per_hour;
			
		    return total_wage;
	}
		

	     public static void main(String[] args) {
	    	 
		EmployeeWagePart dmart =new EmployeeWagePart("DMart",20,20,100);
		double total_wage = dmart.computeDailyWage(dmart.wage_per_hour,dmart.MaxhourPerMonth,dmart.no_workingday,dmart.company);
		System.out.println("total empoyee wage for a month of DMART is  "+ total_wage);
		
		EmployeeWagePart v2 =new EmployeeWagePart("v2",20,25,150);
		double total_wage2 = v2.computeDailyWage(v2.wage_per_hour,v2.MaxhourPerMonth,v2.no_workingday,v2.company);
		System.out.println("total empoyee wage for a month of V2 is  "+ total_wage2);
		
		EmployeeWagePart vmart =new EmployeeWagePart("vmart",20,25,150);
		double total_wage3 = vmart.computeDailyWage(vmart.wage_per_hour,vmart.MaxhourPerMonth,vmart.no_workingday,vmart.company);
		System.out.println("total empoyee wage for a month VMART is  "+ total_wage3);
		 
		 
	 }
}
		