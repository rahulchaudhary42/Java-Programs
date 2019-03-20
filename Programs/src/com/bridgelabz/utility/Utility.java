/******************************************************************************
	 * Purpose:  Here all the method were present .
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since 02-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.utility;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Utility 
{
	 
	InputStreamReader r = new InputStreamReader(System.in);
	static BufferedReader br ;
	public Utility()
	{
		  br = new BufferedReader(r);
	}
	//**************************************************************************************
	public static  String inputString() 
	{
		try 
		{
			return br.readLine();
			
		} catch (Exception e) 
		{
			System.out.println(e);
		}
       return "";
	}
	//**************************************************************************************
	public int inputInteger() 
	{
		 try 
		 {
			return Integer.parseInt(br.readLine()); 
		 }catch(Exception e)
		 {
			 System.out.println(e);
		 }
		return 0; 
	}
	//**************************************************************************************
	public double inputDouble()
	{
		try 
		{ 
		  return Double.parseDouble(br.readLine());	
		}catch(Exception e)
		{	
			System.out.println(e);
		}
		return 0.0;
	}
	//**************************************************************************************
			/*
		       * create the method name Anagram.
			   * @param st1 String taken from user
			   * @param st2 String taken from user
			   * @return boolean value.
			 */
			public static boolean Anagram(String st1, String st2) 
			{
				char ch1[] = st1.toLowerCase().toCharArray();
				char ch2[]= st2.toLowerCase().toCharArray();
				Arrays.sort(ch1);
				Arrays.sort(ch2);
				String st11 =new String(ch1);
				String st22= new  String(ch2);
				return st11.equals(st22);
			}
   //****************************************************************************************
			/*
			   * create the method name checkYear.
			   * If a year is multiple of 400,hence it is a leap year 
			   * Else If a year is muliplt of 100, then it is not a leap year 
			   * Else If a year is muliplt of 4,then it is a leap year 
			 */
			public static boolean checkYear(int year) 
		    {    
				 	if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
						return true;
					else
			            return false; 
		        	  
				
		    } 
   //****************************************************************************************
			/*
			   * create the method name Power.
			   * count from 0 to N
			   * the ith power of two 
			   * repeat until i equals n
			   * print out the power of two
			 */
			 public static void Power(int n)
			 {
				 int i = 0;                 
			        int power = 1;       

			         
			        while (i <= n) {
			            System.out.println("2^"+i+" = " + power);   
			            power = power * 2;
		                i++;
			        }
			 }

   //****************************************************************************************
			/*
			   * create the method name nthHarmonic.
			   * find N-th Harmonic Number
			   * In loop to apply the forumula
			   * Print the sum of series
			*/
			 public static void nthHarmonic(int n) 
			 { 
			      
			 	if(n==0)
			 	{
			 		System.out.println("Enter Valid Number");
			 	}
			 	else
			 	{
			 		 float harmonic = 1; 
			 		    for (int i = 2; i <= n; i++) { 
			 		        harmonic = harmonic+(float)1 / i; 
			 		    } 
			 	      
			 		  System.out.println("Output of Harmonic Series is "+harmonic); 
			 	}
			 } 
   //****************************************************************************************
			 /*
			   * create the method name triplets.
			   * @param ar shows the user given array
			*/
			 public static void triplets(int[] arr, int n) 
			 { 
			     boolean found = true; 
			     for (int i=0; i<n-2; i++) 
			     { 
			         for (int j=i+1; j<n-1; j++) 
			         { 
			             for (int k=j+1; k<n; k++) 
			             { 
			                 if (arr[i]+arr[j]+arr[k] == 0) 
			                 { 
			                     System.out.print(arr[i]); 
			                     System.out.print(" "); 
			                     System.out.print(arr[j]); 
			                     System.out.print(" "); 
			                     System.out.print(arr[k]); 
			                     System.out.print("\n"); 
			                     found = true; 
			                 } 
			             } 
			         } 
			     } 
			   
			     // If no triplet with 0 sum found in array 
			     if (found == false) 
			         System.out.println(" not exist "); 
			   
			 } 
  //****************************************************************************************
				/**
				 * For Algorithm Program.
				 * create the method name bubbleSorting.
				 * @param ar shows the array of Integer type 
				 * @return 
				 */
				public static int[] bubbleSorting(int[] a) 
				{
					int temp = 0;
					for(int i=0; i<a.length; i++)
					{
						for(int j=0; j<a.length-1; j++)
						{
							if(a[j]>a[j+1])
							{
								temp=a[j];
							     a[j]=a[j+1];
							     a[j+1]=temp;
							}
						}
					}
					System.out.println();
					System.out.println("After Sorting Bubble Sort :");
					for(int i=0; i<a.length; i++)
					{
						System.out.print(a[i]+" ");
					}
					System.out.println();
					return a;
				}
   //****************************************************************************************
				/**
				 * For Algorithm Program.
				 * create the method for bubble sorting Algorithm
				 * @param ch shows the array of char type 
				 */
				public static void bubbleSorting(String a[]) 
				{
					String temp="";
				    for(int i=0; i<a.length; i++)
				    { 
					   for(int j=0; j<a.length-1-i; j++)
					    {
						   if(a[j].compareTo(a[j+1])>0)
						      {
							     temp=a[j];
							     a[j]=a[j+1];
							     a[j+1]=temp;
						      }
					    }
					 
				     }
				    System.out.println();
				    System.out.println("After Sorting Bubble Sort :");
				    for(int i=0; i<a.length; i++)
				    {
					    System.out.print(a[i]+" ");
				    }
				    System.out.println();
				}
   //****************************************************************************************
				/**
				 * Function to convert fahrenheit to celcius and vice-versa
				 *
				 * @param tem the value of temperature
				 * @param t   the character ie c or f for given temp to convert
				 * @return converted temperature
				 */
				public static int temperaturConversion(int tem, char t) 
			    {
					int conver;
					if (t == 'c' || t == 'C') 
					{
						conver = (tem * 9 / 5) + 32;
					} 
					else if (t == 'f' || t == 'F') 
					{
						conver = (tem - 32) * 5 / 9;
					} 
					else 
					{
						System.out.println("Enter correct input");
						return 0;
					}
					return conver;
				}
   //****************************************************************************************
				/**
				 * to calculate monthly payment for r interest and p principal for y years
				 *
				 * @param p the principal amount given
				 * @param y the year for which p is given
				 * @param r the rate at which p is given
				 * @return monthly payment
				 */
				public static double monthlyPayment(double p, double y, double r) 
				{
					double n = 12 * y;
					double r0 = r / (12 * 100);
					double payment = p * r0 / (1 - Math.pow((1 + r0), -n));
					return payment;
				}
   //****************************************************************************************

				/**
				 * Function to find the square root of given no
				 *
				 * @param c the value to find square root of
				 * @return return the square root
				 */
				public static double sqrt(double c) 
				{
					double t = c;
					double epsilon = 1e-15;
					while (Math.abs(t - c / t) > epsilon * t) 
					{
						t = (c / t + t) / 2;
					}

					return t;
				}
  //****************************************************************************************
				/**
				 * Function to convert decimal to binary
				 *
				 * @param d integer value to convert
				 * @return return integer array with binary digits
				 */
				public static int[] toBinary(int d)
                 {
					String bin = "";
					while (d != 0) 
					  {
						bin = (d % 2) + bin;
						d /= 2;
					  }
					while (bin.length() % 4 != 0)
					  {  
						bin = 0 + bin;
					  }
					return stringToIntArray(bin);
				  }
				/**
				 * Function to convert string to int array helper function for swapnibble in
				 * Binary.java class
				 *
				 * @param bin String of binary no
				 * @return return integer array
				 */
				static int[] stringToIntArray(String bin) 
				  {
					int[] binary = new int[bin.length()];
					for (int i = 0; i < binary.length; i++) 
					{
						binary[i] = bin.charAt(i) - 48;
					}
					return binary;
				  }
				/**
				 * Function to convert binary to decimal
				 *
				 * @param binary the binary array to cenvert
				 * @return return converted decimal no
				 */
				public static int toDecimal(int[] binary) 
				 {
					int dec = 0, j = 0;
					for (int i = binary.length - 1; i >= 0; i--) 
					 {
						if (binary[i] == 1)
						{
							dec = dec + (int) Math.pow(2, j);
						}
						j++;
					  }
					return dec;
				 }
    //****************************************************************************************
				/**
				 * Function to find the is pallindrome or not
				 * 
				 * @param n the integer which to check for pallindrome
				 * @return true if its pallindrome or false if its not
				 */
				public static boolean isPallindrome(int n) {
					int temp = n;
					int sum = 0;
					while (temp != 0) {
						int r = temp % 10;
						sum = sum * 10 + r;
						temp = temp / 10;
					}
					if (sum == n) {
						return true;
					}
					return false;
				}
   //****************************************************************************************
				/**
				 * Function to print the prime no between to 1 to 1000
				 */
				public static void prime() 
				{
					System.out.println();
					boolean b;
					for (int j = 2; j <= 1000; j++) 
					{
						b = true;
						for (int i = 2; i < j / 2; i++)
						{
							if (j % i == 0) 
							{
								b = false;
								break;
							}
						}
						if (b)
							System.out.print(j + " ");
					}
				}
  //****************************************************************************************
				/**
				 * Function to count the characters in a string alphabaticlally and return array
				 * of the count of each alphabet
				 * 
				 * @param s the string given to count
				 * @return the array for counted characters
				 */
				public static int[] count(String s) {
					s = s.toLowerCase();
					int[] c = new int[25];
					for (int i = 0; i < s.length(); i++) {
						c[s.charAt(i) - 97]++;
					}
					return c;
				}

				/**
				 * Function to count the value in given integer be place
				 * 
				 * @param n the integer value to count
				 * @return the integer array for the count value
				 */
				public static int[] count(int n) {
					int[] count = new int[10];
					int temp = n;
					while (temp != 0) {
						int r = temp % 10;
						count[r]++;
						temp = temp / 10;
					}
					return count;
				}

				/**
				 * to check the values are anagrams or not
				 * 
				 * @param n1
				 * @param n2
				 * @return
				 */
				public static boolean anagram(int n1, int n2) 
				{
					int[] n1count = count(n1);
					int[] n2count = count(n2);
					for (int i = 0; i < n2count.length; i++) 
					{
						if (n1count[i] != n2count[i]) 
						{
							return false;
						}
					}
					return true;
				}
				/**
				 * Function to check the two strings are anagrams or not
				 * 
				 * @param s1 the first string to check
				 * @param s2 the second string to check
				 * @return true if its string and vice-versa
				 */
				public static boolean anagram(String s1, String s2) {
					if (s1.length() != s2.length()) {
						return false;
					}
					int[] s1count = count(s1);
					int[] s2count = count(s2);
					for (int i = 0; i < s2count.length; i++) {
						if (s2count[i] != s1count[i]) {
							return false;
						}
					}
					return true;
				}
  //****************************************************************************************
				/**
				 * Function helping prime() to check if prime is pallindrome and print it
				 */
				public static void primePallindrome()
				{
					System.out.println();
					boolean b;
					for (int j = 2; j <= 1000; j++) 
					{
						b = true;
						for (int i = 2; i < j / 2; i++) 
						{
							if (j % i == 0) 
							{
								b = false;
								break;
							}
						}
						if (b && isPallindrome(j))
				         	System.out.print(j + " ");
					}
				}
  //****************************************************************************************
				/**
				 * Function to check if no is prime anagram or not
				 */
				public static void primeAnagrams() 
				{
					ArrayList<Integer> ar = new ArrayList<Integer>();
					System.out.println();
					boolean b;
					for (int j = 2; j <= 1000; j++) 
					{
						b = true;
						for (int i = 2; i < j / 2; i++) 
						{
							if (j % i == 0) 
							{
								b = false;
								break;
							}
						}
						if (b)
							ar.add(j);
					}
					for (int i = 0; i < ar.size(); i++) 
					{
						for (int j = i + 1; j < ar.size(); j++)
						{
							if (anagram(ar.get(i), ar.get(j))) 
							{
								System.out.println(ar.get(i) + "  " + ar.get(j));
							}
						}
					}
				}
	//****************************************************************************************
				/**
				 * Function to check the day of the week of given date
				 *
				 * @param d int value for day of date
				 * @param m int value for month of year
				 * @param y int value for year
				 * @return day of week from 1 to 7
				 */
				public static int dayOfWeek(int d, int m, int y) 
				{
					int y0 = y - (14 - m) / 12;
					int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
					int m0 = m + 12 * ((14 - m) / 12) - 2;
					int d0 = (d + x + (31 * m0) / 12) % 7;
					return d0;
				}
   //****************************************************************************************
				/**
				 * create the method for Insertion sorting Algorithm
				 * @param ar shows the array of String type 
				 */
				public void insertionSort(char[] ch) 
				{
					for(int i=1;i<ch.length-1;i++)
					{		
						char ch1=ch[i];
						int j=i-1;
						while(j>=0 && ch1<ch[j])
						{
							ch[j+1]=ch[j];
							j--;
						}
						ch[j+1]=ch1;
				   	}
					System.out.println();
					System.out.println("String After the Insertion sort : ");
					for(int i=0;i<ch.length;i++)
					{
						System.out.print(ch[i]+" ");
					}
				}
   //****************************************************************************************
				/**
				 * create the method for Insertion sorting Algorithm
				 * @param ar shows the array of Integer type 
				 */
				public static void insertionSort(int[] ar) 
				{
					for(int i=1;i<ar.length-1;i++)
					{
						int ele=ar[i];
						int j=i-1;
						while( j>=0 && ele<ar[j])	
						{
							ar[j+1]=ar[j];
							j--;		
						}
						ar[j+1]=ele;
					}
					System.out.println();
					System.out.println("Array After the Insertion Sort:");
					for(int i=0;i<ar.length;i++)
					{
						System.out.print(ar[i]+" ");
					}
					
				    }
                

   //****************************************************************************************
				/**
				 * Function to search a number in a array using binary search algorithm
				 * 
				 * @param arr the array in which the no to be searched
				 * @param n   the integer which needs to be searched
				 * @return the index of the number if found or -1 if not found
				 */	
				public static int binarySearch(int[] arr, int n) 
					{
					int high = arr.length - 1, low = 0, mid;
					//arr = bubbleSorting(arr);

					while (low <= high) 
					{
						mid = (low + high) / 2;
						if (n == arr[mid]) 
						{
							return mid;
						}
						else if (arr[mid] < n)
						{
							low = mid + 1;
						} 
						else 
						{
							high = mid - 1;
						}
					}
					return -1;
					}
	//****************************************************************************************
				/**
				 * Function to search a string in string array using binary search
				 * 
				 * @param arr the array in which element to be searched
				 * @param s   the string element which needs to be searched
				 * @return -1 if not found or the index of element if found
				 */
				public static int binary(String[] arr, String s) 
				{
					
					int high = arr.length - 1, low = 0, mid;
					 
					while (low <= high) 
					{
						mid = (low + high) / 2;
						if (s.equalsIgnoreCase(arr[mid])) 
						{
							return mid;
						}
						else if (arr[mid].compareToIgnoreCase(s) < 0) 
						{
							low = mid + 1;
						} else {
							high = mid - 1;
						}
					}
					return -1;
			    }
	//****************************************************************************************
				/**
				 * function to print string elements of a string array
				 * @param A array of strings
				 */
				public static void printStringArray(String[] A) 
				{
					for (String i : A) 
					{
						System.out.print("\t"+i);
					}
					System.out.println();

				}
				/**
				 * @param num to store the string 
				 * @param key to search the given string in the stored array
				 * @return if the key is found else return -1
				 */
				public static int binarySearh(String[] arr, String key) 
				{ 
					int l = 0, r = arr.length - 1; 
					while (l <= r) 
					{ 
						int pos = l + (r - l) / 2; 
						int res = key.compareTo(arr[pos]); 
						if (res == 0) 
							return pos; 
						if (res > 0) 
							l = pos + 1;
						else
							r = pos - 1; 
					} 
					return -1; 
				}
				//****************************************************************************************

				public static String getBinary() {
                   Scanner sc=new Scanner(System.in);
					System.out.println("enter decimal number:");
					int d = sc.nextInt();
					int n = d;
					String binary = "";
					String reverse = "";

					// getting remainder

					while (n >= 1) {
						binary = binary + (n % 2);
						n = n / 2;
					}

					// padding to complete 1 byte
					int z = binary.length();
					String padding = "";
					for (int i = z; i < 8; i++) {
						padding = padding + 0;
					}
					// display
					System.out.print("binary of " + d + ":");
					for (int i = binary.length() - 1; i >= 0; i--) {
						reverse = reverse + binary.charAt(i);
					}
					System.out.println(padding + reverse);
					return padding + reverse;

				}
  }
				


