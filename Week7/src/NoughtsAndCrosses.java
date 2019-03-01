public class NoughtsAndCrosses {
	private int[][] board;
	public NoughtsAndCrosses(int[][] board) {
		/* Class constructor. The board will be passed as a 3×3 two-dimensional array of ints.
		 * Each element of the array contains a number representing what is in that cell:
		 * 0 : nothing
		 * 1 : a nought
		 * 2 : a cross */
		this.board = board;
	}
	
	public boolean isDraw() {
		//Returns true if neither player won, even if the game is not complete. 
		//Otherwise, if a player has three noughts or crosses in a line, returns false.
		return this.whoWon() == 0;
	}
	
	public int whoWon() {
		//Returns a 1 if there are three noughts in a line, and a 2 if there are three crosses in a line. Otherwise returns 0.
		for(int p = 1; p <= 2; p++) {
			for(int i = 0; i < board.length; i++) {
				if(board[i][0] == p && board[i][1] == p && board[i][2] == p)
					return p;
				if(board[0][i] == p && board[1][i] == p && board[2][i] == p)
					return p;
			}
			
			if(board[0][0] == p && board[1][1] == p && board[2][2] == p)
				return p;
			if(board[0][2] == p && board[1][1] == p && board[2][0] == p)
				return p;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		int NONE = 0;
		int NOUGHTS = 1;
		int CROSSES = 2;
		
		int[][] board = { { NONE, NONE, NOUGHTS },
			              { NONE, NONE, NOUGHTS },
			              { NONE, NONE, NOUGHTS }, };

		NoughtsAndCrosses nc = new NoughtsAndCrosses(board);
		
		System.out.println(nc.isDraw()); // false
		System.out.println(nc.whoWon()); // NOUGHTS
	}
}
