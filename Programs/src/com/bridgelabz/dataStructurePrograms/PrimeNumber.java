/**********************************************************************************
	 * Purpose:  Take a range of 0 - 1000 Numbers and find the Prime numbers in that range. 
	 *           Store the prime numbers in a 2D Array, the first dimension represents the 
	 *           range 0-100, 100-200, and so on.
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since  11-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.dataStructurePrograms;
import com.bridgelabz.customDataStructure.Utility;
public class PrimeNumber 
{
	public static void main(String[] args)
	{
		 
		int[][]result=Utility.firstNPrimes();
		System.out.println("Prime Number Stored in 2D array :");
		System.out.println();
		for(int i = 0; i<10; i++)
		{
		    for(int j = 0; j<25; j++)
		    {
		        System.out.print(result[i][j]+"\t");
		    }
		    System.out.println();
		}
		
	}
}