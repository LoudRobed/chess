package src;

public class Rulebook {

	/**
	 * Checks if a given move is a valid chess move.
	 * @param move
	 * @return
	 */
	public boolean isValid(int[] move){
		boolean valid = true;
		for (int i = 0; i < move.length; i++) {
			valid = move[i] > 8 ? false :true;
		}
		
		
		return valid;
		
	}
}
