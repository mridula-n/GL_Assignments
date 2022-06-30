package com.greatlearning.oopsAssignments;

import java.util.Random;
import java.util.Scanner;

public class Oops_Assignment1 {
	
	static final String orgMail = "tcs.com";

	public static void main(String args[]) {
		
		CredentialService csObj = new CredentialService();
		String deptChoice;
		String empFname, empLname, empDept;
		
		//Asking the Employee to provide First name, Last Name and Dept as inputs 
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Please Enter your First Name");
		empFname = myObj.nextLine();
		System.out.println("Please Enter your Last Name");
		empLname = myObj.nextLine();
		Employee eObj = new Employee(empFname, empLname);
		System.out.println("Please Enter your Department From the Following " + "\n" + "1. Techincal" + "\n"
				+ "2. Admin " + "\n" + "3. HumanResources\n4. Legal");
		deptChoice = myObj.nextLine();
		
		//Mapping the dept entered by Employee with short codes
		
		switch (deptChoice) {
		case "Techincal":
			empDept = "tech";
			break;
		case "Admin":
			empDept = "adm";
			break;
		case "HumanResources":
			empDept = "hr";
			break;
		case "Legal":
			empDept = "legal";
			break;
		default:
			empDept = "notassigned";
			break;
		}
		//Show Details for the Employee
		if (empDept != "notassigned") {
			eObj.setDepartment(empDept);
			csObj.showCredentials(eObj);
		} else
			System.out.println("No Department assigned yet , pls contact HR");
	}
}