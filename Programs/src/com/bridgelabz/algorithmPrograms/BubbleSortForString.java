/******************************************************************************
	 * Purpose:  Program to find the binart mo given no
     *
	 * @author Rahul Chadudhary
	 * @version 1.2 
	 * @since 06-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.algorithmPrograms;
import com.bridgelabz.utility.Utility;
public class BubbleSortForString 
{
	public static void main(String[] args) 
	{
		String a[]={"rahul", "ravi", "mohit", "ajay", "ramesh"};
		System.out.println("Before Sorting Insertion Sort :");
		 for(int i=0; i<a.length; i++)
		    {
			    System.out.print(a[i]+" ");
		    }
		 System.out.println();
		Utility.bubbleSorting(a);
	}
}