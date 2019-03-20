/******************************************************************************
	 * Purpose:  Program to find the binart mo given no
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since  04-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.functionalPrograms;
import com.bridgelabz.utility.Utility;
public class NoOfTriplet 
{
	public static void main(String[] args) 
	{ 
	    int arr[] = {0, -1, 2, -2, 1}; 
	    int n =arr.length; 
	    Utility.triplets(arr, n); 
	}
}