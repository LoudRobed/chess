package src;

import java.util.ArrayList;

import pieces.Bishop;
import pieces.Empty;
import pieces.King;
import pieces.Knight;
import pieces.Pawn;
import pieces.Piece;
import pieces.Queen;
import pieces.Rook;

public class Board {

	Piece[][] board;
	ArrayList<Piece> captured;
	boolean white = true;
	boolean black = false;
	
	public Board(){
		populateBoard();
	}
	
	private void populateBoard(){
		board =  new Piece[8][8];
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				board[i][j] = new Empty(white);
			}
		}
		
		for (int i = 0; i < 8; i++) {
		
			board[1][i] = new Pawn(white);
			board[6][i] = new Pawn(black);
		}
		
		
			
			board[0][0] = new Rook(white);
			board[0][7] = new Rook(white);
			board[0][1] = new Knight(white);
			board[0][6] = new Knight(white);
			board[0][2] = new Bishop(white);
			board[0][5] = new Bishop(white);
			board[0][3] = new Queen(white);
			board[0][4] = new King(white);
			
			board[7][0] = new Rook(black);
			board[7][7] = new Rook(black);
			board[7][1] = new Knight(black);
			board[7][6] = new Knight(black);
			board[7][2] = new Bishop(black);
			board[7][5] = new Bishop(black);
			board[7][3] = new Queen(black);
			board[7][4] = new King(black);
		
		
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		String ascii = "|a|b|c|d|e|f|g|h|\n";
		ascii = "----------------\n"+ascii;
		for (int i = 0; i < 8; i++) {
			String line = "|";
			for (int j = 0; j < 8; j++) {
				
				line = line+board[i][j].toString()+"|";
				
			}
			line += "\n";
			ascii = line+ascii;
		}
		
		return ascii;
	}
	
	public boolean movePiece(int[] move){
		
		if(legalMove(move)){
		
		Piece temp = board[move[1]][move[0]];
		System.out.println("Piece moved is "+temp.toString()+"\n");
		board[move[1]][move[0]] = new Empty(white);
		board[move[3]][move[2]] = temp;
	}
		else{
			
		}
		
		return true;
	}
	
	/**
	 * Checks if a move is legal
	 * @param move
	 * @return
	 */
	private boolean legalMove(int[] move) {
		// TODO Auto-generated method stub
		boolean valid = true;
		for (int i = 0; i < move.length; i++) {
			valid = move[i] > 8 ? false :true;
		}
		
		
		return valid;
	}

	public static void main(String[] args) {
		Board b = new Board();
		System.out.println(b.toString());
	}
}
