package pieces;

public class Rook extends Piece{

	public Rook(boolean color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.white ? "r":"R";
	}

}
