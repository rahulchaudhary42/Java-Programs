/**********************************************************************************
	 * Purpose:  Prime Numbers that are Anagram in the Range of 0 - 1000 in a Stack using the Linked
	 *           List and Print the Anagrams in the Reverse Order. 
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since  11-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.dataStructurePrograms;
import java.util.Scanner;

import com.bridgelabz.customDataStructure.MyStack;
import com.bridgelabz.customDataStructure.Utility;
public class PrimeAnagramUsingStack
{   
static int counter=0;
	
	//StackUsingLinkedList object is created
	@SuppressWarnings("rawtypes")
	static MyStack slt=new MyStack ();
	
 	 /**
 	  * to find Prime and Anagram----of given range numbers 
 	  * @param start :range start of number to check prime and anagram
 	  * @param end   :end range
 	  * @return		:void
 	  */
	  @SuppressWarnings("unchecked")
	public static void  primeAndAngaram(int start,int end)
	  {	 
	  
		    //make any size array---to store prime number.
		  	int[] primearr=new int[end]; 
		  	
		  	//to find prime 
		  	for (int i = start; i <= end; i++)
		  	{  
		  		  //call goes to isPrime method--to check prime or not
		  			if (Utility.isPrime(i)) 
		  			{  
		  				primearr[counter]=i; //insert no--->if it is prime
		  				
		  				counter++;
		  			}  
		  	}  
		  	
			//to print normal array---of prime nos
		  	for (int k=0; k<counter; k++)
			  	{  
			  			System.out.print(primearr[k]+" ");
			  	}
		  	
		  	System.out.println(" ");
		  	System.out.println("Now prime and anagram nos r as follows:");
		  	System.out.println(" ");
		  	
		  	//getting the prime nos store in----primearr[]
		  	for (int j=0; j<counter; j++)
		  	{  		 
		  		int reverse= Utility.anagram(primearr[j]);  //palindrome of each primeno---of primearr[]
		  		 
		  		 //matching the palindrome of every no---with the Array(of prime no)
		  	     for(int k=0; k<counter; k++)
		  	     {
		  	    	 if(primearr[k]==reverse)  //if matched then add prime no and anagram to Linked List
		  	    	 {
		  	    		 		slt.push(primearr[j]);
		  	    		
		  	    		 	slt.push(reverse);
		  	    	 }
		  	     }
		  	}
		  	
	  }
	
	 public static void main(String[] args) 
	   {   
		 Scanner sc =new Scanner(System.in);
	       System.out.print("Enter the first number : ");  
	       int start =sc.nextInt() ;   
	       System.out.print("Enter the second number : ");  
	       int end = sc.nextInt();
	       System.out.println("List of prime numbers between " + start + " and " + end);  
	       //calling method to get the nos prime and anagram
		   primeAndAngaram(start, end);
		   //display the linked list
		   slt.print();
		   sc.close();
		   
	   }
}
		

