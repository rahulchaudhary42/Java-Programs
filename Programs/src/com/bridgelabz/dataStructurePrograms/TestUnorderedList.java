/******************************************************************************
	 * Purpose:  Read the Text from a file, split it into words and arrange it as Linked List. 
	 *           Take a user input to search a Word in the List. If the Word is not found then 
	 *           add it to the list, and if it found then remove the word from the List. 
	 *           In the end save the list into a file
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since  14-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.dataStructurePrograms;
import com.bridgelabz.customDataStructure.Utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
 

import com.bridgelabz.customDataStructure.UnorderedListImpl;
public class TestUnorderedList
{
	public static void main(String[] args) 
	{
		String[] words;
		String key;
		String line= "";
		String path ="/home/admin1/bridgelabz/unorderedlist.txt";

		Scanner sc = new Scanner(System.in);
		//System.out.println("enter the path");
		//String path =sc.next();
		try 
		{
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader( new FileReader(path));
			String temp = null;
			while((temp = br.readLine())!= null)
			{
				line=line+temp;
			}
			words = line.split(",");
			//create a linked list for the words
			UnorderedListImpl<String> list = new UnorderedListImpl<String>();
			for(int i = 0; i < words.length ; i++)
			{
				list.add(words[i]);
			}
			list.print();
			//read the key to be searched
			do
			{
				System.out.println("Enter the key...!");
				key = Utility.getString();
			}
			while(key.trim().equals("") || key == null);

			boolean isKeyPresent = list.contains(key);
			if(isKeyPresent)
			{
				System.out.printf("\nkey '%s' is present in the list\n",key);
				list.remove(key);
			}	
			else
			{
				System.out.printf("\nkey '%s' is not present in the list\n",key);
				list.add(key);
			}
			//display data of each node in the list
			list.print();
			list.writeToFile(list, path);
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		sc.close();
	}
}

