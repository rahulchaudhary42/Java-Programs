/******************************************************************************
	 * Purpose:  To Convert the temperature from celcius to fahreinheit and vice-versa
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since 07-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.algorithmPrograms;
import java.util.Scanner;
import com.bridgelabz.utility.Utility;
public class TemperatureConversion 
{
	public static void main(String[] args) 
	{
		try 
		{
			Scanner s = new Scanner(System.in);
			System.out.println("enter temp in c or f");
			int tem = s.nextInt();
			char t = s.next().charAt(0);
			s.close();
			if (t != 'f' && t != 'F' && t != 'c' && t != 'C') 
			{
				System.out.println("enter correct input");
				return;
			}
			tem = Utility.temperaturConversion(tem, t);
			System.out.println("coverted temp is " + tem);
		} 
		catch (Exception e) 
		{
			System.out.println("temperature in format (45 c) or (32 f) :");
		}
	}
}
