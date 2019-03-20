/******************************************************************************
	 * Purpose: To check the monthly payments for given amount ,duration and rate.
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since 07-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.algorithmPrograms;
import java.util.Scanner;
import com.bridgelabz.utility.Utility;
public class MonthlyPayments 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter principal ,year and rate");
		double p = Integer.parseInt(args[0]); 
		double y = Integer.parseInt(args[1]); 
		double r = Integer.parseInt(args[2]); 
		s.close();
		System.out.println("mothly payment is " + Utility.monthlyPayment(p, y, r));
	}
}
 