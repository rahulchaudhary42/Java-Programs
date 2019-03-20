/******************************************************************************
	 * Purpose: Given N distinct Coupon Numbers, how many random numbers do you need to generate 
	 *           distinct coupon number? This program simulates this random process.
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since  04-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.functionalPrograms;
public class CouponCollector 
{
    public static void main(String[] args) 
    {
        int n = Integer.parseInt(args[0]);        
        boolean[] isCollected = new boolean[n];  // isCollected[i] = true if card i has been collected
        int count = 0;                          // total number of cards collected
        int distinct = 0;                        // number of distinct cards
        // repeatedly choose a random card and check whether it's a new one
        while (distinct < n)
        {
            int value = (int) (Math.random() * n);   // random card between 0 and n-1
            count++;                                 // we collected one more card
            if (!isCollected[value]) 
            {
                distinct++;
                isCollected[value] = true;
            }
            System.out.print(distinct+" ");
        }
        System.out.println();
        System.out.println("Distinct coupon Code : "+count);
    }
}
  