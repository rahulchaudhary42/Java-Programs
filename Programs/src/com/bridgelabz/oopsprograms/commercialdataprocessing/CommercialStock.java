/******************************************************************************
 * Purpose: Implements a data type that might be used by a financial institution to keep track of customer information.
 *
 * @author Rahul Chaudhary
 * @version 1.2 
 * @since 06-03-2019
 *
 ******************************************************************************/
package com.bridgelabz.oopsprograms.commercialdataprocessing;
import java.util.Scanner;
public class CommercialStock 
{
	public static void main(String[] args) throws Exception 
	{		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		CommercialStockMethods stock = new CommercialStockMethods();
		char ch;
		System.out.println("****Welcome to Stock Market****");
		do
		{
			System.out.println("Enter What you wants to do\n1. Add Details\n2. Buy\n3. Sell\n4. Print Report ");
			int choice = sc.nextInt();			
			switch(choice)
			{
				case 1 : 
					stock.addDetails();
					break;
				case 2 : 
					stock.buyStock();
					break;
				case 3 :
					stock.sellStock();
					break;
				case 4 : 
					stock.printReport();	
				 			
			}
			System.out.println("Do you wants to continue...(Y/N)");
			ch = sc.next().charAt(0);
		}
		while(ch=='Y' || ch == 'y');
	}
}