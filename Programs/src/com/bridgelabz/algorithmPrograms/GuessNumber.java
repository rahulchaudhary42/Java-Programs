/******************************************************************************
	 * Purpose:  Takes a command-line argument N, asks you to think of a number between 0 and N-1, 
	 *           where N = 2^n, and always guesses the answer with n questions.
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since 06-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.algorithmPrograms;
import java.util.Scanner;
public class GuessNumber 
{
	static Scanner S = new Scanner(System.in);
	static int find() 
	{
		int low = 0, high = 127, mid;
		while (low != high)
		{
			mid = (low + high) / 2;
			System.out.println("enter 1 if no is between " + low + " - " + mid + "\nEnter 2 if no is between "
					+ (mid + 1) + " - " + high);
			int c = S.nextInt();
			mid = (low + high) / 2;
			if (c == 1)
				high = mid;
			else
				low = mid + 1;
		}
		return low;
	}

	public static void main(String[] args)
	{
		System.out.println("guess a no between 0 to 127 ");
		S.next();
		try
		{
			System.out.println("guessed no is " + find());
		} catch (Exception e)
		{
			System.out.println("enter correct input");
		}
	}
}
