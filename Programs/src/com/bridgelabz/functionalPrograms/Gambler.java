/********************************************************************************
	 * Purpose: Simulates a gambler who start with $stake and place fair $1 bets 
     *         until he/she goes broke (i.e. has no money) or reach $goal.
     *         Keeps track of the number of times he/she wins and the number of bets he/she makes.
     *         Run the experiment N times, averages the results, and prints them out.
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since  04-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.functionalPrograms;
import java.util.Scanner;
public class Gambler 
{ 
    public static void main(String[] args) 
    {
    	// Take number from the user
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter a Number :");
    	int stake  = sc.nextInt();   // gambler's stating bankroll
    	int goal   = sc.nextInt();  // gambler's desired bankroll
        int trials =sc.nextInt();   // number of trials to perform
        int bets = 0;        
        int wins = 0;         
        // repeat trials times
        for (int i = 0; i < trials; i++) 
        {
            // do one gambler's ruin simulation
            int cash = stake;
            while (cash > 0 && cash < goal) 
            {
                bets++;
                if (Math.random() < 0.5) 
                	cash++;     // win $1
                else                     
                	cash--;     // lose $1
            }
            if (cash == goal)
            	wins++;                
        }
        sc.close();

       
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
    }
}