package com.bridgelabz.algorithmPrograms;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class BinarySearchWord 
{
 static Scanner sc=new Scanner(System.in);
 public static void main(String[] args)
 {
		// TODO Auto-generated method stub
	
				int res;
				res=binarySearchWord();
				if(res==0)
					System.out.println("your word not found");
				  else
				    System.out.println("your word found at index:"+res);
	}
	public static int binarySearchWord() 
	{
		String a, temp = null;
 
		try {
			BufferedReader br = new BufferedReader(new FileReader("/home/admin1/bridgelabz/bin.txt"));

			try {
				// read line from file
				a = br.readLine();
				// split line into words when you get comma and store words in array
				String arr[] = a.split(",");
				br.close();
				// sort names
				for (int i = 0; i < arr.length; i++) 
				{
					for (int j = i + 1; j < arr.length; j++) 
					{
						if (arr[i].compareTo(arr[j]) > 0) // check if arr[j] is greater than arr[i]

						{
							// if yes then swap positions
							temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp;
						}

					}

				}

				// display names
				System.out.println("\nyour file contents are:");
				for (int i = 0; i < arr.length; i++) 
				{
					System.out.print(arr[i]);
					if (i == arr.length - 1)
						break;
					System.out.print(",");
				}

				System.out.println();
				// ask user for word to be search
				String input;
				System.out.println("which word you want to search????");

				input = sc.next();
				// sc.close();
				 

				int first = 0, last = arr.length - 1;

				while (first <= last) {
					int mid = (first + last) / 2; // get mid
					if (input.compareTo(arr[mid]) == 0) // compare mid with user entered word
					{
						return mid;
					} else if (input.compareTo(arr[mid]) > 0) // check whether word is greater than mid
					{
						first = mid + 1; // change first to mid+1
					} else {
						last = mid - 1; // change last to mid-1
					}
				}

			} 
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return -1;
	}

}

