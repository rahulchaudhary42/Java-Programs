/**********************************************************************************
	 * Purpose: Number of Binary Search Tree
	 *            
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since  13-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.dataStructurePrograms;
import java.util.Scanner;
public class BinarySearchTree 
{
	  //We can also use the below formula to find nth catalan number  *Cn=(1/n+1) {2n to n}
	static int binomialCoeffi(int n, int k) 
	{ 
		int res = 1; 
		//  C(n, k) = C(n, n-k) 
		if (k > n - k) 
		{	
			k = n - k; 
		}
       // Calculate value of  [n*(n-1)*---*(n-k+1)] /  [k*(k-1)*---*1]
		for (int i = 0; i < k; ++i) 
		{ 
			res =res* (n - i);  
			res =res/ (i + 1); 
		}	 
		return res; 
	}	 
	static int Catalan( int n) 
	{ 

		// Calculate value of 2nCn 
		int c = binomialCoeffi(2 * n, n); 

		// return 2nCn/(n+1) 
		return c / (n + 1); 
	} 
	static int factorial(int n)
	{
		int res = 1; 

		for(int i=1;i<=n;i++)
		{
			res=res*n;
		}

		return res;	
	}
	static int binomialCoeffi(int n) 
	{ 
		int b,d;

		d=(factorial(n+1) * factorial(n));

		b=(factorial(2*n))/d;

		return b;
	}
	static int countBST(int n)
	{
		int count=Catalan(n);

		return count;
	} 
	public static void main(String[] args) 
	{  
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no for  which Number of Binary Search Tree\n" );
		n=sc.nextInt(); 
		// find count of BST and  binary trees with n nodes 
		int count1 = countBST(n); 
		// print count of BST and  binary trees with n nodes 
		System.out.println("Count of BST with "+  n +" nodes is "+  count1); 
		sc.close();
	} 
}


