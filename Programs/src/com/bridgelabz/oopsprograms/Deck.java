package com.bridgelabz.oopsprograms;
public class Deck 
{
	  public static void main(String[] args)
	  {
		
	    int[] deck = new int[52];
	    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
	    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	    for (int i = 0; i < deck.length; i++)
	    {
	      deck[i] = i;
	    }
	    for (int i = 0; i < deck.length; i++)
	    {
	    	
	      int index = (int)(Math.random() * deck.length);
	      int temp1= deck[i];
	      
	      
	      
	      
	      deck[i] = deck[index];
	      deck[index] = temp1;
	    }
	    for (int i = 0; i <52; i++) 
	    {
	      String suit = suits[deck[i] / 13];
	      String rank = ranks[deck[i] % 13];
	      System.out.println( rank + " of " + suit);
	    }
	  }
	}

