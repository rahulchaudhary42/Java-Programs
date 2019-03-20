/******************************************************************************
	 * Purpose:  Here all the method were present .
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since 02-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.customDataStructure;
import java.util.Arrays;
import java.util.Scanner;
public class Utility
{
       	//****************************************************************************
	static Scanner sc=new Scanner(System.in);
	public static int[][] firstNPrimes()
	{	
	int prime[][]=new int[10][25];
	int f1=0, f2=0, f3=0, f4=0, f5=0, f6=0, f7=0, f8=0, f9=0, f10=0;
	for(int i=2; i<=1000; i++)
	{
		boolean pm=isPrime(i);	
		if(pm)
		{
			if(i<100)
			{
				
				prime[0][f1]=i;
				f1++;
			}
			else if(i<200)
			{
				prime[1][f2]=i;
				f2++;
			}
			else if(i<300)
			{
				prime[2][f3]=i;
				f3++;
			}
			else if(i<400)
			{
				prime[3][f4]=i;
				f4++;
			}
			else if(i<500)
			{
				prime[4][f5]=i;
				f5++;
			}
			else if(i<600)
			{
				prime[5][f6]=i;
				f6++;
			}
			else if(i<700)
			{
				prime[6][f7]=i;
				f7++;
			}
			else if(i<800)
			{
				prime[7][f8]=i;
				f8++;
			}
			else if(i<900)
			{
				prime[8][f9]=i;
				f9++;
			}
			else
			{
				prime[9][f10]=i;
				f10++;
			}
		}
	
	}
	return prime;
	}
	//****************************************************************************
	public static boolean isPrime(int n)
	{
		if (n <= 1)  //e.g n=15
		{  
			return false;  
		} 
		for(int i=2; i<=n/2; i++)
	     {
 
			int rem=n%i;
			if(rem==0)
			{
				return false;
			}
			
	}
		return true;
	}
	//****************************************************************************
	public static int[] PrimeNumber(int range) 
	{
		boolean isPrime = true;
		int count = 0;
		int primeno[]=new int[range];		   
		for (int i = 0; i <= range; i++)         
		{ 		  
			for(int j=2; j<i ;j++)
			{
				if(i%j==0)
				{
					isPrime=false;
					break;
				}
				else 	
					isPrime=true;
			}
			if(isPrime==true)
				primeno[count++]=i;
		}
		return primeno ;		     
	}
	//****************************************************************************

	public static int[] checkAnagram(int[] primenumber)
	{
		System.out.println("\nThe prime number which are Anagram:");
		int anagram = 0;
		int[] anagramArray = new int[primenumber.length]; 
		for (int  i = 0; i < primenumber.length; i++)
		{
			for (int j = 0; j < primenumber.length; j++)
			{
				if(primenumber[i]>0 && primenumber[j]>0 && primenumber[i]!=primenumber[j])
				{     
					String string1 = Integer.toString(primenumber[i]);
					String string2 = Integer.toString(primenumber[j]);
					anagram=checkPrimeAnagram(string1, string2);
					if(anagram>0)
					{
						anagramArray[i] = anagram;
						
					}
				}
			}
		}
		return anagramArray;				        
	}
	//****************************************************************************
	public static void twoDPrimeAnagram(int[] anagram)
	{
		int row = 20 ,column = 26;
		int[][] anagramArray = new int[row][column];
		int temp = 100 , k=0;
		for(int i = 0 ;i<row; i++)
		{
			for(int j= 0 ; j<column ; j++)
			{
				if(k<anagram.length )
				{
					if(anagram[k] <= temp )
					{
						anagramArray[i][j] = anagram[k];
						k = k+1;
					}
				} 
			} 	
			temp = temp + 100;
		}

		System.out.println("");
		for(int i = 0 ;i<row ; i++)
		{
			for(int j= 0 ; j<column ; j++)
			{
				if(anagram[j]>0)
				{
					//printing prime anagram numbers in 2D array
					if(anagramArray[i][j] != 0)
					{
						System.out.print(anagramArray[i][j]+"\t");
					}
				}
			}
			System.out.println();
		}
	}
	//****************************************************************************
	private static int checkPrimeAnagram(String string1, String string2)
	{
		int anagram =0 ;
		char[] ch1 = string1.toCharArray();
		char[] ch2 = string2.toCharArray();
		boolean result=false;
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		result = Arrays.equals(ch1,ch2);
		if(result==true)
		{
			anagram = Integer.parseInt(string1);
			 
			return anagram;
		}
		return anagram;		
	}
 
	//****************************************************************************
		/**
		 * to get palindrome of a no
		 * @param m: no to take palindrome/reverse
		 * @return : Integer
		 */
		public static int anagram(int m) //reverse
		{
			@SuppressWarnings("unused")
			int r,sum=0,temp; 

			//It is the number variable to be checked for palindrome    

			while(m>0)
			{    
				r =   m % 10;  //getting remainder  
				sum= ( sum * 10 ) + r;    
				m = m / 10;    
			}    

			return sum; 
		}
	 //****************************************************************************
		
		public static int hashFunction(int num)
		{
			int reminder=num%11;
			return reminder;
		}

		
		 //****************************************************************************
		/**
		 * @param m to find month
		 * @param d to find day
		 * @param y to find year
		 * @return gives you the day of the week .
		 */
		public static int dayOfWeek(int m, int d ,int y)
		{
			int y0 = y - (14 - m) / 12;
			int	x = y0 + y0/4 - y0/100 + y0/400;
			int	m0 = m + 12 * ((14 - m) / 12) - 2;
			int	d0 = (d+x+31*m0/12)%7;
			return d0;
		}
		
		//****************************************************************************
		/** This method print calendar of any month and year 
		 * @param month is user input that which month calender you want to print
		 * @param year is user input whose calendar you want to print 
		 */
		public void printCalender(int month , int year)
		{
			String[] Month = {"January","February", "March","April", "May", "June","July", "August", "September",
					"October", "November", "December"};
			int[] noOfDays  = {0,31,28,31,30,31,30,31,31,30,31,30,31};
			int result = Utility.dayOfWeek(month, 1, year);
			System.out.println("   "+Month[month-1]+" "+year);
			if( month == 2 && isLeapYearForCalander(year) )
			{
				noOfDays[2] = 29;  //For leap year days will be 29
			}									
			System.out.println("S  M  Tu W  Th F  Sa  ");
			for(int i = 0 ;i<result ; i++)
			{
				System.out.print("   ");
			}
			for(int i=1;i<=noOfDays[month];i++)
			{
				if(i<=9)
				{
					System.out.print(i+"  ");
				}
				else if(i>9)
				{
					System.out.print(i+" ");
				}
				if((result+i)%7==0)
					System.out.println();
			}
		}
	
	
		
		//****************************************************************************
		/**
		 * reads a string input from input device
		 * @return a string
		 */
		public static String getString() 
		{
			String str = sc.next();
			while(str.trim().equals("") || str == null) 
			{
				System.out.println("Enter a valid string...!");
				str = sc.next();
			}
			return str;

		}
		//****************************************************************************

		//program to print calendar using stack	
			public static void calenderStack(int month, int year) 
			{
				String s[] = { "January", "Februry", "March", "April", "May", "June", "July", "August", "September", "October",
						"November", "December" };
				StackForCalander<String> stack = new StackForCalander<>();
				// get d0 value hence upto d0 we will add null values
				int d = 1, y = year, m = month;
				int y0 = y - (14 - m) / 12;
				int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
				int m0 = m + 12 * ((14 - m) / 12) - 2;
				int d0 = (d + x + 31 * m0 / 12) % 7;

				int start = d0;
				int totalDaysOfMonth = 0, count = 1;
				if (month == 2) {
					if (Utility.isLeapYearForCalander(year)) // if leap year days = 29
						totalDaysOfMonth = 29;
					else
						totalDaysOfMonth = 28; // if not leap year days= 28
				} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
					totalDaysOfMonth = 31;
				else
					totalDaysOfMonth = 30;

				while (start != 0) 
				{
					stack.push("   ");
					start--;
				}

				while (count <= totalDaysOfMonth)
				{
					if (count <= 9)
						stack.push(String.valueOf(count) + "  "); // add data to the stack
					else
						stack.push(String.valueOf(count) + " "); // add data to the stack
					count++;
				}

				System.out.println(s[month - 1] + " " + year);
				System.out.println("S  M  T  W  T  F  S");
				count = 1;
				while (!stack.isEmpty()) // traverse till stack is not empty
				{
					String result = stack.pop();
					System.out.print(result);
					if (count % 7 == 0) {
						System.out.println();
					}
					count++;
				}
		}
			//****************************************************************************
			public static boolean isLeapYearForCalander(int year) 
			{
				 
				if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0)
					return true;
				else
					return false;
			}
			//****************************************************************************
			 
}
