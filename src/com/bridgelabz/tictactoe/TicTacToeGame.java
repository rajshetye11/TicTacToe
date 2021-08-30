package com.bridgelabz.tictactoe;

import java.util.Random;
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
	
	
	public String toss() {
		Random random = new Random();
		int option = random.nextInt(3);
		System.out.println("Choose 1.Heads or 2.Tails");
		int chooseToss = sc.nextInt();
		int heads = 0 ,tails = 1;
		
		if(option == 0 && chooseToss == 1) {
			System.out.println("You won the toss Heads !");
			return "player";
		}else if(option == 1 && chooseToss == 2) {
			System.out.println("You won the toss Tails !");
			return "player";
		}else {
			System.out.println("You lost the toss");
			return "comp";
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Welcome To TicTacToe ");
		TicTacToeGame t1 = new TicTacToeGame();
		t1.selectXorO();
		t1.ticTacToeBoard();
		t1.showBoard(board);
		if(t1.toss() == "player") {
			t1.move(board,player);
		}else {
			t1.move(board,comp);
		}
		t1.showBoard(board);
		
		
	
		
	}
}
