package pieces;

public class Knight extends Piece {

	public Knight(boolean color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.white ? "n" : "N";
	}

}
