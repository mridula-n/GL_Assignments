package com.greatlearning.oopsAssignments;

public class CredentialService {
	public String generateEmailAddress(Employee e) {
		//static value of company name assigned to Oops_Assignment1.orgMail
		return e.firstName + "." + e.lastName + "@" + e.department + "." + Oops_Assignment1.orgMail;
	}

	public String GeneratePwd() {
		
		String pwdGen;
		char pwdlLCaseChar = 0;
		char pwdlUCaseChar = 0;
		char pwdSplChar = 0;
		String PwdGen;
		
		//Ascii char conversion to int for lower ,upper and special characters
		int lwAscLowCase = 'a';
		int hwAscLowCase = 'z';
		int lwAscUppCase = 'A';
		int hwAscUppCase = 'Z';
		char[] spcharArr = { 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 64, 91,
				92, 93, 94, 95, 96, 123, 124, 125, 126 };
		//random no generator range -> max -min +1 
		int range = spcharArr.length ;
		
		//lowercase random generator based on ascii value range
		int tempNoGen = (int) Math.floor(Math.random() * (hwAscLowCase - lwAscLowCase + 1) + lwAscLowCase);
		pwdlLCaseChar = (char) (tempNoGen);
		PwdGen = String.valueOf(pwdlLCaseChar);
		//uppercase random generator 
		tempNoGen = (int) Math.floor(Math.random() * (hwAscUppCase - lwAscUppCase + 1) + lwAscUppCase);
		pwdlUCaseChar = (char) (tempNoGen);
		PwdGen = PwdGen + String.valueOf(pwdlUCaseChar);
		//special random generator for any random index between 1 and to number of special characters 
		pwdSplChar = spcharArr[(int) (Math.random() * range)];
		PwdGen = PwdGen + String.valueOf(pwdSplChar);
		//number random generator for range of 100 
		tempNoGen = (int) Math.floor(Math.random() * 100);
		PwdGen = PwdGen + String.valueOf(tempNoGen);
		return (PwdGen);
	};

	public void showCredentials(Employee e) {
		String empGenPwd = GeneratePwd();
		String empEmailId = generateEmailAddress(e);
		System.out.println("Dear " + e.getFirstName() + " " + " your generated credentials are as follows ");
		System.out.println("Email ---> " + empEmailId);
		System.out.println("Password ---> " + empGenPwd);
	}
}