package DSA_assignment1;

public class PayMoneyService {
	
	public int  CheckTargetAchived(int payMoneyTotTrans[] , int targetToAcheive   )
	{
		
		int totTransValueAchived = 	0; 
	
		for (int i=0 ; i<payMoneyTotTrans.length;i++) 
		{
			
			totTransValueAchived =  payMoneyTotTrans[i]+totTransValueAchived ;
			
			if (targetToAcheive <=totTransValueAchived )
				return i+1 ;
		
		}
		
		if ( totTransValueAchived < targetToAcheive ) 
			return -1;
		else 
			return -1;
		
		
//		return totTransValueAchived;
		
	}
}
