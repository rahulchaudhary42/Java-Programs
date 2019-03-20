/******************************************************************************
	 * Purpose:  Here all the method were present .
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since 18-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.utility;
import java.util.Scanner;
public class Util 
{
	public static Scanner sc=new Scanner(System.in);
	public static String getString() 
	{
		String string = sc.next();
		return string;
	}
	public static int getInt() 
	{
		int integer = sc.nextInt();
		return integer;
	}
	public static double getDouble()
	{
		double doubleValue = sc.nextDouble();
		return doubleValue;
	}

}
 