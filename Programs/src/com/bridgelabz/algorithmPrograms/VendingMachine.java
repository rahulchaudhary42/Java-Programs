/******************************************************************************
	 * Purpose:  There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can be returned by 
	 *         Vending Machine. Write a Program to calculate the minimum number of Notes as well as the 
	 *         Notes to be returned by the Vending Machine as a Change.
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since 07-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.algorithmPrograms;
import java.util.Scanner;
public class VendingMachine 
{ 
	public static void main(String[] args)
	{
		try 
		{
			Scanner s = new Scanner(System.in);
			System.out.println("enter amoumt");
			int value = s.nextInt();
			noteprint(value);
			s.close();
		}
		catch (Exception e) 
		{
			System.out.println("enter value in integer");
		}
	 }
	/**
	 * static variable I is declared to change notes and Static variable TOTAL is
	 * declared to count total notes
	 */
	static int i, total;
	static int[] notes = { 1000, 500,200, 100, 50, 10, 5, 2, 1 };// Static array to store values of notes

	/**
	 * create the method for noteprint.
	 * Function to find the notes and print the output.
	 * @param value the amount to which the note to despenced.
	 */
	static void noteprint(int value) 
	{
		if (value / notes[i] != 0) 
		{
			total=total+ (value / notes[i]);
			System.out.println(notes[i] + "rs notes :" + value / notes[i]);
			value = value % notes[i];
		}
		i++;
		if (value == 0) 
		{
			System.out.println("Total notes : " + total);
			return;
		}

		noteprint(value);

	}


}
