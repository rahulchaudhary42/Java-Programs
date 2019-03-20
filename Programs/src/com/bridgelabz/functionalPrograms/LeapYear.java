/******************************************************************************
	 * Purpose:  Find the year is a leap year or not.
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since  04-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.functionalPrograms;
import java.util.Scanner;
public class LeapYear 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Year to Check Leap or Not");
		int year=sc.nextInt();
//		boolean leap=Utility.checkYear(year);
//		if(leap)
//			System.out.println(year+" is a Leap Year");
//		else
//			System.out.println(year+" is not a Leap Year");
//		sc.close();
		if(year > 999 && year < 10000)
		{
			if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			{ 
				System.out.println(year+" is a Leap Year");
			}
			else
			{
				System.out.println(year+" is not a Leap Year");
				 
			}
		}
		else
		{
			System.out.println(year+" is not a Leap Year");
			System.out.println("Enter 4 digit number : ");
		}
		sc.close();
	}
}