/******************************************************************************
	 * Purpose:   To find the prime no between 0 to 1000 an if they are pallindrome or anagram or not.
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since 07-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.algorithmPrograms;
import com.bridgelabz.utility.Utility;
public class Prime2 
{
	public static void main(String[] args) 
	{
		System.out.println("prime between 0 to 1000");
		Utility.prime();
		System.out.println("prime no between 0 to 1000 also pallindrome");
		Utility.primePallindrome();
		System.out.println("prime and anagrams");
		Utility.primeAnagrams();
	}
}
