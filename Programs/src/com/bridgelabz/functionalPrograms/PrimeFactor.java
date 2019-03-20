/******************************************************************************* 
	 * Purpose:  Program to find the prime factors of given no.
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since 05-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.functionalPrograms;
import java.util.Scanner;
public class PrimeFactor 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		 for(int i = 2; i< num; i++) 
		 {
	         while(num%i == 0) 
	         {
	            System.out.println(i+" ");
	            num = num/i;
	         }
	      }
	      if(num >2) 
	      {
	         System.out.println(num);
	      }
	      sc.close();
	}
}