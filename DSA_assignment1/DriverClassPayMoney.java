package DSA_assignment1;

import java.util.Scanner;

public class DriverClassPayMoney {
	
	public static void main(String args[])
	{
		
		//get the lisyt of transactions 
		PayMoneyService psObj = new PayMoneyService();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please total transactions of the Day");
		int noOfTransactions = in.nextInt();
		
		int payMoneyTotTrans[] = new int[noOfTransactions];
		
		
		//Take the target values of the Array 

		System.out.println("Enter the values of array");
		
		for(int i=0; i<noOfTransactions;i++)
		{
			
			payMoneyTotTrans[i] = in.nextInt();
					
		}
		
		//To get the no of targets 
		System.out.println("Enter the total no of targets that needs to be achieved");
		int noOfTargetsToAcheive = in.nextInt();
		int payMoneyTargets[]  = new int[noOfTargetsToAcheive];
		
		for (int i = 0; i < noOfTargetsToAcheive; i++)
		{
		
			System.out.println("Enter the value of target ");
			payMoneyTargets[i] = in.nextInt();
			
			if (psObj.CheckTargetAchived( payMoneyTotTrans , payMoneyTargets[i] ) == -1 )
				System.out.println("Given target is not achieved");
			else
			System.out.println(" Target achieved after "+ String.valueOf(
					psObj.CheckTargetAchived( payMoneyTotTrans , payMoneyTargets[i])+" transactions"
			) );
			
		}
		 
		
	}

}
