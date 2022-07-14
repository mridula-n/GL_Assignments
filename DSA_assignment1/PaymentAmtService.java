package DSA_assignment1;
import java.util.Arrays;


public class PaymentAmtService {

	public int[] SortDenominations(int[] baseDenominationArray)
	{
		MergeSort mergesortObj = new MergeSort();
		
		mergesortObj.sortDsc(baseDenominationArray, 0, baseDenominationArray.length-1) ; 
		 
		mergesortObj.printArray(baseDenominationArray);
		return baseDenominationArray;
		
		
	}
	
	public  int[] checkDenominations(int[] noOfCurrDenominatios , int amtToPay)
	{

	 int[] amtToPayCurr = new int[noOfCurrDenominatios.length];
	 int noOfDenominations =0;
	 int j =0;
	 
	 for (int i : noOfCurrDenominatios) {
		
		 if (amtToPay > 0 )
		 {
		  noOfDenominations = amtToPay /i;
		 if (noOfDenominations > 0 )
		 {
		 amtToPay = amtToPay - (i*noOfDenominations)  ;
		 amtToPayCurr[Arrays.asList(noOfCurrDenominatios).indexOf(i)]= i;
		// amtToPayCurr
		 System.out.println(noOfDenominations +" "+ i);
		 }
		 }
	}
	 
	 return amtToPayCurr;
	}
	
	
}
