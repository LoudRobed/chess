package pieces;

public class Queen extends Piece {

	public Queen(boolean color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.white ? "q" : "Q";
	}
	

}
