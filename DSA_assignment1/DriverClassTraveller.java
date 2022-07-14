package DSA_assignment1;

import java.util.Iterator;
import java.util.Scanner;

public class DriverClassTraveller {

	
	public static void main(String args[])
	{
		
		int noOfCurrDenominatios , amtToPay ;
		
		PaymentAmtService  paymentAmtRandmObj = new PaymentAmtService();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Take input of all the currency denominations ( random order)");
		noOfCurrDenominatios = in.nextInt();
		
		int currDenominations[] = new int[noOfCurrDenominatios];
		
		
		for (int i = 0; i<noOfCurrDenominatios; i++)
		{
			currDenominations[i]=in.nextInt();
			
		}
		
		System.out.println("Take Amount to pay");
		amtToPay = in.nextInt();
		
		currDenominations = paymentAmtRandmObj.SortDenominations(currDenominations); 
		
		int currResultDenominations[] = paymentAmtRandmObj.checkDenominations(currDenominations, amtToPay);
		
		for (int i : currResultDenominations) {
			
			
		}
		
	}
}
