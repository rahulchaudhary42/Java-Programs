/******************************************************************************
	 * Purpose:  Take User Input and Replace String Template “Hello <<UserName>>, How are you?”.
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since 04-05-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.functionalPrograms;
import com.bridgelabz.utility.Utility;
public class ReplaceName 
{
	public static void main(String[] args) 
	{
		        // Initialization of String
				String str1, str2, str3, str4;
				// Take data from user
				System.out.print("Enter String: ");
				str1 = Utility.inputString();
				System.out.print("Enter name you want to replace: ");
				str2 = Utility.inputString();
				System.out.print("Enter name you want to replace with: ");
				str3 = Utility.inputString();
				// Computation
				str4 = str1.replace(str2, str3);
				System.out.println("New String: " + str4);
	}
}
