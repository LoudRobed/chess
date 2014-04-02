package pieces;

public abstract class Piece {

boolean white;
	
	public Piece(boolean color){
		
		this.white = color;
		
	}
	
	public abstract String toString();
}
