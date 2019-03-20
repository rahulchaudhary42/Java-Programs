/**********************************************************************************
	 * Purpose:   Create the Week Object having a list of WeekDay objects each storing the day 
	 *            using Stack implemented using Linked List .
	 *            
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since  12-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.dataStructurePrograms;
import java.util.Scanner;
import com.bridgelabz.customDataStructure.Utility;
public class CalendarUsingStack 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter month");
		int month=sc.nextInt();
		System.out.println("enter year");
		int year=sc.nextInt();
		sc.close();
		Utility.calenderStack(month,year);
	}

}