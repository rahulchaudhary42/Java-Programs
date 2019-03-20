package com.bridgelabz.oopsprograms.addressbook;
import java.util.Scanner;
public class AddressBook 
{
	public static void main(String[] args) throws Exception 
	{
		AddressBookMethods book = new AddressBookMethods();
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		char ch;
		do
		{
			System.out.println("What you wants to do : ");
			System.out.println("1.Add Address\n2.Edit Information\n3.Sort Information"
					+ "\n4.Remove Person");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1 :
				book.addAddress();
				break;
			case 2 :
				book.editInfo();
				break;
			case 3 :
				book.sortData();
				break;
			case 4 :
				book.removeData();
				break;
			default :
				break;				
			}
			System.out.println("Do u want to continue Y/N : ");
			ch =sc.next().charAt(0);
		}while(ch=='Y'||ch=='y');
		}
}