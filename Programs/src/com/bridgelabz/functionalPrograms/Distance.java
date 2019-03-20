/******************************************************************************
	 * Purpose:  Takes two integer command-line arguments x and y and prints the result.
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since  04-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.functionalPrograms;
public class Distance 
{
	public static void main(String[] args) 
	  {
		//Take input From Command Line arguments
	    int x  = Integer.parseInt(args[0]);    
	    int y  = Integer.parseInt(args[1]); 
	    //math class inbiuld method calling
	    double dist = Math.sqrt(x*x + y*y);
	    System.out.println("Distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
	  }

}
