/******************************************************************************
	 * Purpose:  Take 2 Strings as Input such abcd and dcba and Check for Anagrams.
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since 06-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.algorithmPrograms;
import com.bridgelabz.utility.Utility;
import java.util.Scanner;
public class Anagram 
{
public static void main(String[] args) 
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the First String inputs...");
	String st1=sc.next();
	System.out.println("Enter the Second String Inputs..");
	String st2=sc.next();
	boolean rs=Utility.Anagram(st1,st2);
	if(rs)
		System.out.println("String are Anagram");
	else
		System.out.println("String are not Anagram");
	sc.close();
  }
} 