package com.greatlearning.javaprog.gradedassig1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Admindepartment admObj = new Admindepartment();
		Hrdepartment hrObj = new Hrdepartment();
		Techdepartment tchObj = new Techdepartment();

		System.out.println("Welcome to " + admObj.departmentName());
		System.out.println(admObj.getTodaysWork());
		System.out.println(admObj.getWorkDeadline());
		System.out.println(admObj.isTodayAHoliday());

		System.out.println("\nWelcome to " + hrObj.departmentName());
		System.out.println(hrObj.doActivity());
		System.out.println(hrObj.getTodaysWork());
		System.out.println(hrObj.getWorkDeadline());
		System.out.println(hrObj.isTodayAHoliday());

		System.out.println("\nWelcome to " + tchObj.departmentName());
		System.out.println(tchObj.getTodaysWork());
		System.out.println(tchObj.getWorkDeadline());
		System.out.println(tchObj.getTechStackInformation());
		System.out.println(tchObj.isTodayAHoliday());

	}

}
