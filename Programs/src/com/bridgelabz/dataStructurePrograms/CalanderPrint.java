/**********************************************************************************
	 * Purpose: Program that takes the month and year as command-line arguments and prints the Calendar
	 *          of the month.
	 *            
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since  12-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.dataStructurePrograms;
import java.util.Scanner;
import com.bridgelabz.customDataStructure.Utility;
public class CalanderPrint 
{
	public static void main(String[] args) 
	{
    Utility util = new Utility();
    Scanner sc =new Scanner(System.in);
	System.out.println("Enter month : ");
	int month = sc.nextInt();
	System.out.println("Enter year : ");
	int year = sc.nextInt();
	util.printCalender(month, year);
	sc.close();
    }
}