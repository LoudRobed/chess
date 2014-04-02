package pieces;

public class Pawn extends Piece{

	public Pawn(boolean color) {
		super(color);
		// TODO Auto-generated constructor stub
	}
	
	public String toString(){
		return this.white ? "o" : "*";
	}
}
