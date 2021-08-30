package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
	public static char [] board = new char[10];
	Scanner sc = new Scanner(System.in);
	public static char player, comp;
	public int pos;
	
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
	
	public void showBoard(char[] board)
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
	
	
	public boolean isEmpty(char[] board, int pos) {
		for (int i=1;i<board.length;i++) {
			if (i==pos && board[i]==' ') {
				return true;
			}
		}
		return false;
	}
	
	public char[] move(char[] board,char player) {
		pos = 0;
		while(true) {
			System.out.println("Enter location (1-9)");
			pos = sc.nextInt();
			if(pos <= 9 || pos > 0) {
				if (isEmpty(board, pos)) {
					board[pos] = player;
					break;
				}
			}
		}
		return board;
		
	}
	public static void main(String[] args) {
		System.out.println("Welcome To TicTacToe ");
		TicTacToeGame t1 = new TicTacToeGame();
		t1.selectXorO();
		t1.ticTacToeBoard();
		t1.showBoard(board);
		t1.move(board,player);
		t1.showBoard(board);
		
	}
}
