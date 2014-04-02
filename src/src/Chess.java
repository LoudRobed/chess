package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chess {

	Player white;
	Player black;
	Board b;
	String moves;
	
	public Chess(){
		white = new Player();
		black = new Player();
		b = new Board();
		
	}
	public static void main(String[] args) {
		Chess c = new Chess();
		c.gameLoop();
		System.exit(0);
	}
	private void gameLoop() {
		System.out.println("Hello");
		
	
		do {
			
			System.out.println(	b.toString());
	      //  System.out.print("Enter String");
	        try {
	        	System.out.println("Enter move: \n");
	        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String s = br.readLine();
				handleMove(s);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (true);
		
	}
	private void handleMove(String s) {
		
		int[] m = new int[4];
		m[0] = (int)s.charAt(0)-97;
		m[1] = (int)s.charAt(1)-49;
		m[2] = (int)s.charAt(3)-97;
		m[3] = (int)s.charAt(4)-49;
		
		b.movePiece(m);
	}
}
