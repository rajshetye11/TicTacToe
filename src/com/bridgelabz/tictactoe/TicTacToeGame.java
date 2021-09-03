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
	
	public char[] move(char[] board,char playerOrComp) {
		pos = 0;
		while(true) {
			System.out.println("Enter location (1-9)");
			pos = sc.nextInt();
			if(pos <= 9 || pos > 0) {
				if (isEmpty(board, pos)) {
					board[pos] = playerOrComp;
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
	
	public boolean gameResult(char[] board, char playerOrComp) {
		boolean won = false;
		if(board[1] == playerOrComp && board[2] == playerOrComp && board[3] == playerOrComp) {
			won = true;
		}else if(board[4] == playerOrComp && board[5] == playerOrComp && board[6] == playerOrComp) {
			won = true;
		}else if(board[7] == playerOrComp && board[8] == playerOrComp && board[9] == playerOrComp) {
			won = true;
		}else if(board[1] == playerOrComp && board[5] == playerOrComp && board[9] == playerOrComp) {
			won = true;
		}else if(board[3] == playerOrComp && board[5] == playerOrComp && board[7] == playerOrComp) {
			won = true;
		}else if(board[1] == playerOrComp && board[4] == playerOrComp && board[7] == playerOrComp) {
			won = true;
		}else if(board[2] == playerOrComp && board[5] == playerOrComp && board[8] == playerOrComp) {
			won = true;
		}else if(board[3] == playerOrComp && board[6] == playerOrComp && board[9] == playerOrComp) {
			won = true;
		}
		return won;
	}
	
	public static boolean checkSpace(char[] board) {
		for(int i=1;i<10;i++) {
			if (board[i] == (' ')) return true;
		}
		return false;
	}
	
	
	public char[] compMove(char[] board,char playerOrComp) {
		if (checkComputerWin(board, playerOrComp)!=0) {
		board[checkComputerWin(board, playerOrComp)]=playerOrComp;
		return board;
	}
		while(true) {
			System.out.println("Enter location (1-9)");
			pos = sc.nextInt();
			if(pos <= 9 || pos > 0) {
				if (isEmpty(board, pos)) {
					board[pos] = playerOrComp;
					break;
				}
			}
		}
		return board;
		
	}
	
	private int checkComputerWin(char[] board, char comp) {
		for(int i=1;i<board.length;i++) {
			if(board[i] == '_') {
				board[i] = comp;
				if(gameResult(board, comp)) return i;
				else board[i] = ' ';
			}
		}		
		return 0;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Welcome To TicTacToe ");
		TicTacToeGame t1 = new TicTacToeGame();
		t1.selectXorO();
		t1.ticTacToeBoard();
		t1.showBoard(board);
		int choose = (t1.toss() == "player") ? 1 : 0;
		while(true) {
			if (t1.checkSpace(board)) {
				if (choose == 1) {
					System.out.print("Player ");
					board = t1.move(board, player);
					if (t1.gameResult(board,player)) {
						System.out.println("Player won.");
						break;
					}
					else {
						choose = 0;
					}
				}
				else {
					System.out.print("Computer ");
					board = t1.compMove(board, comp);
					if (t1.gameResult(board,comp)) {
						System.out.println("Computer won.");
						break;
					}
					else {
						choose = 1;
					}	
				}
				t1.showBoard(board);
			}
			else {
				System.out.println("Game Tie.");
				break;
			}
			
		}
	
	}
}