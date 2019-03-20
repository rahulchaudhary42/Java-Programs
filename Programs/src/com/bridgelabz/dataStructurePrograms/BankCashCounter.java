/******************************************************************************
	 * Purpose: Create a Program which creates Banking Cash Counter where people come in to deposit Cash
	 *          and withdraw Cash.
	 *          
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since  15-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.dataStructurePrograms;
import java.util.Scanner;
import com.bridgelabz.customDataStructure.MyQueue;
public class BankCashCounter
{
	private static Scanner sc;

	public static void main(String[] args)
	{
		sc = new Scanner(System.in);
		int amount =0;
		int balance=10000;
		System.out.println("Enter the nos of people in a queue" );	
		int n= sc.nextInt();
		MyQueue<Object> m=new MyQueue<Object>(n);	
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the name of "+i +" person");
			String name= sc.next();
			boolean t =m.enqueue(name); 	
			if(t==false) //to check name inserted or not
			{
				System.out.println("person not added");
			}
		}
		System.out.println("====================================================");

		System.out.println("\n"+"the people in Queue r as follow:" );
		System.out.println( m.toString() );
		for(int i=0;i<n;i++)
		{
			System.out.println("Welcome: person no: "+ i);

			System.out.println("\n"+"the Current QUEUE is: "+ m.toString());

			System.out.println("please choose the option: \n1)Deposit \n2)Withdraw");
			int ch =sc.nextInt();
			
			switch(ch)
			{
				case 1: System.out.println("Deposit Money in account---plz eneter amount"); 
				amount=sc.nextInt();

				balance= balance + amount; 

				System.out.println("New balance is: "+balance);
				break;

				case 2: System.out.println("Withdraw Money in account---plz eneter amount"); 
				amount=sc.nextInt();

				balance= balance - amount; 

				System.out.println("New balance is: "+balance);
				break;
			
				default :
					System.out.println("enter valid input");
			 
			}
			 
			 
			m.dequeue();  

			System.out.println("           Thankyou      ");
			System.out.println("---------Next person----------");
			 
		}
	}
}



