/******************************************************************************
	 * Purpose: Program to simulate tic tac toe game between two player.
     *
	 * @author Rahul Chaudhary
	 * @version 1.2 
	 * @since 04-05-2019
	 *
	 ******************************************************************************/
package com.bridgelabz.functionalPrograms;
import java.util.Scanner;
public class TicTacToe
{
	public static int row, col;
	public static Scanner sc=new Scanner(System.in);
	public static char[][] board=new char[3][3];
	public static char turn='X';
	public static void main(String args[])
	{
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				board[i][j]='_';
			}
		}
		PrintBoard();
		play();
	}
	public static void play()
	{
		boolean playing=true;
		while(playing)
		{
			System.out.println("Pease enter row and col :");
			row=sc.nextInt()-1;
			col=sc.nextInt()-1;
			if(board[row][col]=='_')
			{
				board[row][col]=turn;
			}
			else
			{
			   System.out.println("invalid argument");
			   continue ;
			}
			
			if(GameOver(row, col))
			{
				playing=false;
				System.out.println("Game Over Player "+turn+" wins");
			}
			PrintBoard();
			if(turn=='X')
				turn='0';
			else
				turn='X';
		}
	}
	public static void PrintBoard()
	{
		for(int i=0; i<3; i++)
		{
			System.out.println();
			for(int j=0; j<3; j++)
			{
				if(j==0)
					System.out.print("| ");
				System.out.print(board[i][j]+" | ");
			}
		}
		System.out.println();
	}
	public static boolean GameOver(int rMove, int cMove)
	{
		if(board[0][cMove]==board[1][cMove] && board[0][cMove]==board[2][cMove])// perpendicular
			return true;
		if(board[rMove][0]==board[rMove][1] && board[rMove][0]==board[rMove][2])// diagonal..
			return true;
		if(board[0][0]==board[1][1] && board[0][0]==board[2][2] && board[1][1]!='_')
			return true;
		if(board[0][2]==board[1][1] && board[0][2]==board[2][0] && board[1][1]!='_')
			return true;
		
		return false;
	} 
}