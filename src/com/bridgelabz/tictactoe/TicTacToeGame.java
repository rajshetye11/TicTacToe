package com.bridgelabz.tictactoe;

public class TicTacToeGame {
	char [] board = new char[10];
	
	public void ticTacToeBoard() {
		for(int i = 1; i<board.length ; i++) {
			board[i] = 0;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome To TicTacToe ");
		TicTacToeGame t1 = new TicTacToeGame();
		t1.ticTacToeBoard();
	}
}
