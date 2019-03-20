/******************************************************************************
	 * Purpose:  Reads in strings from standard input and prints them in sorted order.
     *           Uses insertion sort.
     *
	 * @author Rahul Chadudhary
	 * @version 1.2 
	 * @since 07-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.algorithmPrograms;
import java.util.Scanner;
import com.bridgelabz.utility.Utility;
public class InsertionSort
{
	public static void main(String[] args) 
	   {
		   Scanner sc = new Scanner(System.in);		//create the Scanner Object to take The User Inputs
		   System.out.println("Enter the String");
		   String st= sc.nextLine();//Read the User inputs..
		   char ch[]=st.toCharArray();//Convert the String Into Char type Array..
		   System.out.println("Enter the String Character by Character...");
		   for(int i=0;i<ch.length;i++)
		   {
			   System.out.print(ch[i]+" ");
		   }
		   Utility u = new Utility();
		   u.insertionSort(ch);
		   sc.close();
	   }
}