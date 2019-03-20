/******************************************************************************
	 * Purpose:  Takes two double command-line arguments t and v and prints the wind chill. 
	 *           Use Math.pow(a, b) to compute ab. 
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since 05-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.functionalPrograms;
import java.util.Scanner;
public class WindChill 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the temperature : ");
		double temp= Integer.parseInt(args[0]);  
		System.out.print("Enter the wind speed in miles per hour: ");
		double speed = Integer.parseInt(args[0]);  
		// Check the condition 
		if(temp<=50 && speed<=120)
		{
			// Compute the wind chill index
			double windChill = 35.74 + 0.6215 * temp-35.75 * Math.pow(speed, 0.16)+0.4275 * temp* Math.pow(speed, 0.16);
			// Display result
			System.out.println("The wind chill index is " + windChill);
		}
		else
		{
			System.out.println("Please enter Temperature less than 50 and Speed less than 120");	
		}
		sc.close();	 
	}

}
