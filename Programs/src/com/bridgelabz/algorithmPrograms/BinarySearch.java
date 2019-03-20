/******************************************************************************
	 * Purpose:  Read in a list of words from File. Then prompt the user to enter a word to search the 
	 *           list. The program reports if the search word is found in the list.
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since 06-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.algorithmPrograms;
import java.util.Scanner;
import com.bridgelabz.utility.Utility;
public class BinarySearch
{
	public static void main(String[] args) 
    {
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of array");
		int[] arr = new int[s.nextInt()];
		System.out.println("enter elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println("enter element to search ");
		int n = s.nextInt();
		// int[] arr = { 1, 2, 3, 4, 5 };
		 System.out.println("element present at "+Utility.binarySearch(arr, n)+" position");
		  s.close();
	 }
}
