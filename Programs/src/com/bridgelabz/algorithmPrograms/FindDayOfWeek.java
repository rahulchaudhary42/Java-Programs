/******************************************************************************
	 * Purpose:  To read a date from user and give the on that day as output.
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since 06-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.algorithmPrograms;
import com.bridgelabz.utility.Utility;
import java.util.Scanner;
public class FindDayOfWeek
{
	public static void main(String[] args) 
	{
		int d, m, y, day;
		Scanner s = new Scanner(System.in);
		System.out.println("enter date in day month year");
		d = s.nextInt();
		m = s.nextInt();
		y = s.nextInt();
		day=Utility.dayOfWeek(d, m, y);
		String days[]=  {"Sunday", "Monday", "Tuesday", "Wednessday", "Thusday", "Friday", "Satuday"};
		System.out.println(days[day]);
		s.close();
	}
}

