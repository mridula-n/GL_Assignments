package com.gl.BTreePairSum;

import java.util.*;

public class driver_class {
	
	
	// Node class with left and Right pointers
	static class Node {
		int nodeData;
		Node leftNode, rightNode;
	};
	
	
	//Method for creating and returing a new Node with data passed  
    static Node CreateNode(int data)
    {
    	Node nd = new Node();
    	nd.nodeData = data ;
    	nd.leftNode = null;
    	nd.rightNode = null;
    	return nd;
    }
	
	
    public Node CreateTree( Node root , int data )
    {
    	
    	if (root==null )
    		return CreateNode(data);
    	
    	if ( data < root.nodeData)
    		root.leftNode = CreateNode(data);
    	else 
    		root.rightNode = CreateNode(data);
    	
    	return root;
    	
    }
    

    public boolean CheckPairUtility(int sum , Node root, HashSet<Integer> set)
    {
    	
    	
    	//if root is null then no need to check as node is null .. return false
    	if (root ==null) return false ;
    	
    	if (CheckPairUtility(sum , root.leftNode,  set)) 
    		return true;
    	
		if (set.contains(sum - root.nodeData)) {
			System.out.println("Pair is found ("
					+ (sum - root.nodeData) + ", "
					+ root.nodeData + ")");
			return true;
		}
		else
			set.add(root.nodeData); // add to the set to check the 
		return CheckPairUtility(sum , root.rightNode,  set);
    	
    }
    
    public void PairWithGivenSum(Node root, int sum)
	{
		HashSet<Integer> set = new HashSet<Integer>();
		if (!(CheckPairUtility(sum, root,set)))
			System.out.print("Pairs do not exist");
	}

	// Driver code
	public static void main(String[] args)
	{
		Node root = null;
		
		driver_class pairSum = new driver_class();
		root = pairSum.CreateTree(root, 40);
		root = pairSum.CreateTree(root, 20);
		root = pairSum.CreateTree(root, 60);
		root = pairSum.CreateTree(root, 10);
		root = pairSum.CreateTree(root, 30);
		root = pairSum.CreateTree(root, 50);
		root = pairSum.CreateTree(root, 70);

		int sum =60;
		pairSum.PairWithGivenSum(root, sum);
	}
    
    
    
    
}
