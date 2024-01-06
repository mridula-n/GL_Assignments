package com.gl.BalanceBrackets;

import java.util.*;

public class driver_class1 {
	
    static boolean ChkBalanceExp(String stringExp)
    {
        
    	Stack<Character> st =new Stack<Character>();

    	for(int i=0 ; i< stringExp.length(); i++)
    	{
    		
    		char c =  stringExp.charAt(i);
    		
    		if( c == '(' ||  c=='[' || c=='{')
    		{
    			st.push(c);
    		 	continue;
    		}
    	  	
    	// return false in case string has no Brackets 
    	if ( st.isEmpty())
    	{
    		return false;
    	}
    	
		char x ;

    	switch(c)
    	{
    	
    	case '}':
    		x=st.pop();
    		if (x !='{') return false;
    		 break;
    	case ']':
    		x=st.pop();
    		if (x !='[') return false;
    		 break;

    	case ')':
    		x=st.pop();
    		if (x !='(') return false;
    		 break;
    	}
    	    
    	   
    	}
    	                
        return (st.isEmpty());
    }
 
    // Driver code
    public static void main(String[] args)
    {
        String bracketExpression = "([[{}]])";
         
        Boolean result;
        
        result = ChkBalanceExp(bracketExpression);
        
        if (result)
            System.out.println("The entered String has Balanced Brackets");
        else
            System.out.println("The entered Strings do not contain Balanced Brackets ");
    }


}
