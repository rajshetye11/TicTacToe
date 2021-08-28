package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
	char [] board = new char[10];
	Scanner sc = new Scanner(System.in);
	public char player, comp;
	
	public void ticTacToeBoard() {
		
		for(int i = 1; i<board.length ; i++) {
			board[i] = ' ';
		}
		
	}
	
	public void selectXorO() {
		System.out.println("Select X or O");
		player = sc.next().charAt(0);
		
		if(player == 'X') {
			comp ='O';
		}else {
			comp ='X';
		}
		System.out.println("Player selected "+player);
		System.out.println("Computer Letter "+comp);
	}
	
	public void showBoard()
    {
        System.out.println(" " + board[1] + " | "
                           + board[2] + " | " + board[3]
                           + " ");
        System.out.println("------------");
        System.out.println(" " + board[4] + " | "
                           + board[5] + " | " + board[6]
                           + " ");
        System.out.println("------------");
        System.out.println(" " + board[7] + " | "
                           + board[8] + " | " + board[9]
                           + " ");
    }
	public static void main(String[] args) {
		System.out.println("Welcome To TicTacToe ");
		TicTacToeGame t1 = new TicTacToeGame();
		t1.selectXorO();
		t1.ticTacToeBoard();
		t1.showBoard();
	}
}
