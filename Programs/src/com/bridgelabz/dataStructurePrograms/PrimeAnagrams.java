/**********************************************************************************
	 * Purpose:   Prime Number Program and store only the numbers in that range that are Anagrams. 
	 *            For e.g. 17 and 71 are both Prime and Anagrams in the 0 to 1000 range.
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since  11-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.dataStructurePrograms;
import com.bridgelabz.customDataStructure.Utility;
import java.util.Scanner;
public class PrimeAnagrams 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter range : ");
		int range = sc.nextInt();
		int[] primeno = new int[range];
		primeno=Utility.PrimeNumber(range);
		int[] anagram = Utility.checkAnagram(primeno);		
		Utility.twoDPrimeAnagram(anagram);
		sc.close();	
    }
}

