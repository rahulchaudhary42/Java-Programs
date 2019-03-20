/**********************************************************************************
	 * Purpose:  Take an Arithmetic Expression such as (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3) 
	 *           where parentheses are used to order the performance of operations.
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since  11-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.dataStructurePrograms;
import java.util.Scanner;
 // (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)
public class Balanced_Parenthesis 
{
	public static void checkForBalancedParenthesis()
	{
		Scanner sc = new Scanner(System.in);
		int top = -1, result = 0;
		char stack[] = new char[20];  
		char a = 0, b = 0;
		String expression;
		System.out.println("enter your expression:");
		expression = sc.next();  
		sc.close();
		int strLength = expression.length();  

		for (int i = 0; i < strLength; i++) {

			if (expression.charAt(i) == '{' || expression.charAt(i) == '[' || expression.charAt(i) == '(')
			{
				top++; // increment top
				stack[top] = expression.charAt(i);// if true then push it into stack

			}

			else if (expression.charAt(i) == '}' || expression.charAt(i) == ']' || expression.charAt(i) == ')') 
			{
				b = expression.charAt(i);
				a = stack[top]; // pop element from stack
				top--; // decrement top
			}

			result = 0;
			if ((a == '{' && b == '}') || (a == '[' && b == ']') || (a == '(' && b == ')')) // if condition is true set
																							// result to 1
				result = 1;
		}

		if (result == 1 && top == -1) // if result is 1 and stack is empty then true else false
			System.out.println("expression is balanced..");

		else
			System.out.println("unbalanced");
	}

	public static void main(String[] args) 
	{
 
		checkForBalancedParenthesis();
	}

}