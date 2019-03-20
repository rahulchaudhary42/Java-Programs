/**********************************************************************************
	 * Purpose:   Create the Week Object having a list of WeekDay objects each storing the day
	 *            (i.e S,M,T,W,Th,..) and the Date (1,2,3..) . The WeekDay objects are stored in a
	 *             Queue implemented using Linked List. 
	 *            
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since  12-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.dataStructurePrograms;
import java.util.Scanner;
import com.bridgelabz.customDataStructure.QueueForCalander ;
public class CalendarUsingQueue 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter month");
		int month=sc.nextInt();
		System.out.println("enter year");
		int year=sc.nextInt();
		sc.close();
		QueueForCalander.calenderQueue(month,year);
	}
}
