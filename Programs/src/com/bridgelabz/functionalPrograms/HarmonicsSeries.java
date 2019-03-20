/******************************************************************************
	 * Purpose:  Program to Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N .
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since  04-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.functionalPrograms;
import java.util.Scanner;
import com.bridgelabz.utility.Utility;
class HarmonicsSeries  
{ 
    public static void main (String[] args)
    { 
    	Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number : ");
		int n=sc.nextInt();
		Utility.nthHarmonic(n);
		sc.close();
    } 
} 
