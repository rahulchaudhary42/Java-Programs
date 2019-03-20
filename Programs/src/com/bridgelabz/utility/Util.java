/******************************************************************************
	 * Purpose:  Here all the method were present .
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since 18-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.utility;
import java.util.Random;
import java.util.Scanner;

import com.bridgelabz.oopsprograms.Queue;
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
	public static String[][] cardDistribute()
	{
		String arr[][]=new String[4][13];
		cardInsert(arr);
		cardShuffle(arr);
		String playercard[][]=new String[4][9];
		for(int i=0;i<playercard.length;i++)
		{
			for(int j=0;j<playercard[i].length;j++)
			{
				playercard[i][j]=arr[i][j];
			}
		}
		return playercard;
	}
	/**
	 * Take two string arrays that is suit and clubs 
	 * sort them by their length
	 * and return your array.
	 * @param arr
	 */
	public static void cardInsert(String arr[][])
	{
		String Suits[]= {"Clubs","Diamonds","Hearts","Spades"};
		String Rank[]= {"2","3","4","5","6","7","8","9","10","Jack","King","Queen","Ace"};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=Suits[i]+" "+Rank[j];
			}
		}
	}
	
	/**
	 * This function is used to shuffle the cards 
	 * by creating the Random object 
	 * and by giving the condition to    
	 * @param arr
	 */
	public static void cardShuffle(String arr[][])
	{
		Random r1=new Random();
		for(int i=0;i<153;i++)
		{
			int x1=r1.nextInt(4);
			int x2=r1.nextInt(13);
			int x3=r1.nextInt(4);
			int x4=r1.nextInt(13);
			swap(arr,x1,x2,x3,x4);
			
		}
	}
	
	public static void swap(String arr[][],int x1,int x2,int x3,int x4)
	{
		String temp=arr[x1][x2];
		arr[x1][x2]=arr[x3][x4];
		arr[x3][x4]=temp;
	}
	
	public static Queue<Queue<String>> cardSort(String playercard[][])
	{
		Queue<Queue<String>> sortedcard=new Queue<>();
		
		String rank[]= {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		int arr[]=new int[9];
		int index=0;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<9;j++)
			{
				
				String temp[]=(playercard[i][j]+" ").split(" ");
				for(int k=0;k<13;k++)
				{
					if(temp[1].equals(rank[k]))
					{
						
						arr[index]=k;
						index++;
					}
				}
			}
			System.out.println();
			index=0;
			for(int k1=0;k1<arr.length-1;k1++)
			{
				for(int k2=k1+1;k2<arr.length;k2++)
				{
					if(arr[k1]>arr[k2])
					{
						int temp=arr[k1];
						arr[k1]=arr[k2];
						arr[k2]=temp;
						
						String temp1=playercard[i][k1];
						playercard[i][k1]=playercard[i][k2];
						playercard[i][k2]=temp1;
						
					}
				}
			}
		
		}
		
		for(int i=0;i<playercard.length;i++)
		{
			Queue<String> temp=new Queue<>();
			for(int j=0;j<playercard[i].length;j++)
			{
				temp.enqueue(playercard[i][j]);
			}
			sortedcard.enqueue(temp);
		}
		
		return sortedcard;
	}
	
	

}
 