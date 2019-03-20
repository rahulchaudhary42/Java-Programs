/******************************************************************************
	 * Purpose:  Program to find the square root of a given nos.
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since 07-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.algorithmPrograms;
import java.util.Scanner;
import com.bridgelabz.utility.Utility;
public class SquareRoot 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no to find Square root");
		double c = s.nextDouble();
		System.out.println("square root is " + Utility.sqrt(c));
		s.close();
	}
}
