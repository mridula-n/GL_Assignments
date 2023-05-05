package dsa.question1;
import java.io.*;
import java.util.Scanner;



public class Driver {

	
	public static void main(String[] args) {
		
		Scanner scO = new Scanner(System.in);
	
		//get the total number of floors to be constructed by user
		System.out.println("Please enter the floor size");
		int totalFloors = scO.nextInt();
		
		int[] dayWiseFloors = new int[totalFloors];
		//get the Day wise Construction Details
		for (int i =0 ;i<totalFloors; i++) {
			
			System.out.println("enter the floor size given on day"+i);
			dayWiseFloors[i]=scO.nextInt();
		}
		
		for (int i : dayWiseFloors) {
			System.out.println(i);
		}
	
		Service srvc = new Service();
		
		srvc.contructionDtls(dayWiseFloors, totalFloors);
		
	}
}
