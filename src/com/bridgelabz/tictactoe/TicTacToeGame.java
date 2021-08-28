package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
	Scanner sc = new Scanner(System.in);
	public char player, comp;
	
	public void ticTacToeBoard() {
		char [] board = new char[10];
		for(int i = 1; i<board.length ; i++) {
			board[i] = ' ';
		}
	}
	
	public void selectXorO() {
		System.out.println("Select X or O");
		char xoro = sc.next().charAt(0);
		
		if(xoro == 'X') {
			System.out.println("Player selected X");
			System.out.println("Computer Letter O");
			player = 'X';
			comp ='O';
		}else {
			System.out.println("Player selected O");
			System.out.println("Computer Letter X");
			player = 'O';
			comp ='X';
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome To TicTacToe ");
		TicTacToeGame t1 = new TicTacToeGame();
		t1.selectXorO();
		t1.ticTacToeBoard();
	}
}
