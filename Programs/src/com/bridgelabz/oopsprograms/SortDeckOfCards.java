/**********************************************************************************
	 * Purpose:   The above program to create a Player Object having Deck of Cards, and having ability 
	 *            to Sort by Rank and maintain the cards in a Queue implemented using Linked List. 
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since  19-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.oopsprograms;
import com.bridgelabz.utility.Util;
public class SortDeckOfCards 
{
	public static void main(String[] args)
	{
		String playercard[][]=Util.cardDistribute();
		Queue<Queue<String>> sortedcard=Util.cardSort(playercard);
		String playername[]= {"Player 1","Player 2","Player 3","Player 4"};
		int index=0;
		while(!sortedcard.isEmpty())
		{
			Queue<String> temp=sortedcard.dequeue();
			System.out.print(playername[index]+"--> ");
			while(!temp.isEmpty())
			{
				System.out.print(temp.dequeue()+"  ");
			}
			System.out.println();
			index++;
		}	

     }
}