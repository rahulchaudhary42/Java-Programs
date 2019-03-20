/******************************************************************************
	 * Purpose:  Reads in integers prints them in sorted order using Bubble Sort
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since 06-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.algorithmPrograms;
import com.bridgelabz.utility.Utility;
import java.util.Scanner;
public class BubbleSort
{
  public static void main(String[] args) 
  {
	Scanner sc = new Scanner(System.in);//create the scanner class object to take user inputs
	System.out.println("Enter the size of Array");
	int n = sc.nextInt();
	int ar[]=new int[n];
	
	System.out.println("Read the Elements of Array..!");
	for(int i=0;i<ar.length;i++)
	{
		ar[i]=sc.nextInt();
	}
	
	System.out.println("Before Sorting Bubble Sort :  ");
	for(int i=0;i<ar.length;i++)
	{
		System.out.print(ar[i]+" ");
	}
	
	Utility.bubbleSorting(ar);
	sc.close();
  }
}