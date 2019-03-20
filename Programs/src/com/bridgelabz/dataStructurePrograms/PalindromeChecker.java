/**********************************************************************************
	 * Purpose: A palindrome is a string that reads the same forward and backward, for example, 
	 *          radar, toot, and madam. We would like to construct an algorithm to input a string 
	 *          of characters and check whether it is a palindrome.
	 *            
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since  13-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.dataStructurePrograms;
import java.util.Scanner;
import com.bridgelabz.customDataStructure.MyDqueueImpl;
public class PalindromeChecker 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s;	 
		System.out.println("Enter the string for palindrome " );
		 s=sc.next();
		 char[] c= s.toCharArray();
		MyDqueueImpl<Object> m=new MyDqueueImpl<Object>(c.length);	 
		for(int i=c.length-1 ; i>=0 ;i--)
		{
			m.rearenqueue(c[i]);	
		}
		 
		System.out.println("\n"+"The New MyDeque array is: "+"\n"+ m);
		System.out.println("\n"+"Matching both the queue:----input String and MyDeque");	
	    	boolean status=true; //to store condition-->matched or not
	    	 
	    	  //to traverse each element of the Deque and match with Char Array{i/p string} 
	    	  
			for(int i=0 ; i<c.length ;i++)
			{
				if(c[i]!=(char) m.frontdequeue())
				{
					status=false;	
					break;
				}
				status=true;
			}
			if(status)
			{
				System.out.println("it is palindrome");
			}
			else
				System.out.println("not a palindrome");
			sc.close();
			
	}		
			
}
