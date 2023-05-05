package dsa.question1;
import java.util.PriorityQueue;

public class Service {

	public void contructionDtls(int[] dayWiseFloor,int totalFloors) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(java.util.Collections.reverseOrder());
		
		int[] queueArr = new int[totalFloors];
		//queueArr = dayWiseFloor ;
		int maxFloors =totalFloors;
		
		System.out.println("The order of construction is as follows");
		
		for(int i = 0; i<totalFloors ; i++)
		{
			
			
			pq.add(dayWiseFloor[i]);
			
			System.out.println("Day: "+i);
			
			// to check that last maximum floor is getting picked up
		while(!pq.isEmpty() && pq.peek()==maxFloors)
		{
			System.out.println(pq.poll());
			maxFloors--;
			
		}
			
			
		}
	}
	
}
