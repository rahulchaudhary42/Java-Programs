/******************************************************************************
	 * Purpose:  Flip Coin and print percentage of Heads and Tails.
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since  04-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.functionalPrograms;
import java.util.Scanner;
public class FlipCoin 
{
	public static void main(String[] args) 
	 {
		 int headCnt=0,tailCnt=0;
		 double heads ,tails;
		// Take data from user
		 System.out.println("Enter the no of times You Want to Flip the Coin:");
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 sc.close();
		// Computation
		 for(int i=0;i<n;i++) 
		 {
		   double random=Math.random();
		   if(random<0.5)
			    tailCnt++;
		   else
			    headCnt++;
		 }
		 heads = headCnt/(double)n*100;
		 tails = tailCnt/(double)n*100;
		 System.out.println("Percentage of Heads: "+ heads );
		 System.out.println("Percentage of Tails:"+  tails );
	 }
}
