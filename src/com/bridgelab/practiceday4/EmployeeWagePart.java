package com.bridgelab.practiceday4;

public class EmployeeWagePart {

	//This method checks attendance of employee
		 void checkEmployee() {

	        int empType = (int) (Math.random() * 10) % 2;
	        if (empType == 1)
	        {
	            System.out.println("Employee is Present");

	        } else
	        {
	            System.out.println("Employee is Absent");

	        }
		}
		
		

	 public static void main(String[] args) {
		 EmployeeWagePart emp = new EmployeeWagePart();
		 emp.checkEmployee();  	
		        
		    }
		}