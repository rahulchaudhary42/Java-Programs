/**********************************************************************************
	 * Purpose:  Write a Program to initialize deck of cards having suit 
	 *           ("Clubs", "Diamonds", "Hearts", "Spades") & Rank ("2", "3", "4", "5", "6", "7", "8",
	 *            "9", "10", "Jack", "Queen", "King", "Ace"). Shuffle the cards using Random method and
	 *            then distribute 9 Cards to 4 Players and Print the Cards the received by the 4 Players using 2D Array…
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since  19-03-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.oopsprograms;
import com.bridgelabz.utility.Util;
public class DeckOfCard 
{ 
	public static void main(String[] args)
	{
		String playercard[][]=Util.cardDistribute();
		int x=0;
		int y=0;
		for(int i=0;i<4;i++)
		{
			System.out.print("player "+(i+1)+":\t");
			
			for(int j=0;j<9;j++)
			{
				System.out.print(playercard[x][y]+"\t");
				y++;
				if(y==9)
				{
					y=0;
					x++;
				}
			}
			System.out.println();
		}

	}
}