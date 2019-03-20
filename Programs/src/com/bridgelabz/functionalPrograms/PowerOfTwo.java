/******************************************************************************
	 * Purpose: Takes a command-line argument N and prints a table of 
     *          the powers of 2 that are less than or equal to 2^N.
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since 05-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.functionalPrograms;
import java.util.Scanner;
import com.bridgelabz.utility.Utility;
public class PowerOfTwo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number for you want to the Table");
		int n=Integer.parseInt(args[0]); 
		Utility.Power(n);
		sc.close();
	}

}
