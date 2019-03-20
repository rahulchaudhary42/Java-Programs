/******************************************************************************
	 * Purpose: To find the roots of the equation a*x*x + b*x + c. 
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since 05-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.functionalPrograms;
import java.util.Scanner;
public class Quadratic 
{
	public static void main(String[] args) 
    {
      int a, b, c;
      double rt1, rt2, d;
      Scanner s = new Scanner(System.in);
      System.out.println("Given quadratic equation:ax^2 + bx + c");
      System.out.print("Enter a:");
      a = s.nextInt();
      System.out.print("Enter b:");
      b = s.nextInt();
      System.out.print("Enter c:");
      c = s.nextInt();
      System.out.println("Given quadratic equation:"+a+"x^2 + "+b+"x + "+c);
      d = b * b - 4 * a * c;
      if(d > 0)
      {
          System.out.println("Roots are real and unequal");  // There are two real roots.
          rt1 = (- b + Math.sqrt(d))/(2*a);
          rt2 = (-b - Math.sqrt(d))/(2*a);
          System.out.println("First root is:"+rt1);
          System.out.println("Second root is:"+rt2);
      }
      else if(d == 0)
      {
          System.out.println("Roots are real and equal"); // There is one real root.
          rt1 = (-b+Math.sqrt(d))/(2*a);
          System.out.println("Root:"+rt1);
      }
      else
      {
          System.out.println("Roots are imaginary");// Complex roots.
      }
      s.close();
  }

}
