/******************************************************************************
 * Purpose: Maintain the List of CompanyShares in a Linked List So new CompanyShares can
 *          be added or removed easily using custom Linked List.
 *
 * @author Rahul Chaudhary
 * @param args
 * @throws Exception
 * @version 1.2 
 * @since 06-03-2019
 *
 ******************************************************************************/
package com.bridgelabz.oopsprograms.commercialdataprocessing;
import java.util.Scanner;
public class CommercialLL 
{
	public static void main(String[] args) throws Exception 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		CommercialLLMethods stock = new CommercialLLMethods();
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
					stock.linkedlist();
					break;
				case 3:
					stock.sellStock();
					stock.linkedlist();
					break;
				case 4 : 
					stock.printReport();
					break;							
				default :
					System.out.println("Invalid Choice..!!!");
					break;			
			}
			System.out.println("Do you wants to continue...(Y/N)");
			ch = sc.next().charAt(0);
		}
		while(ch=='Y' || ch == 'y');
	}
}