package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() { //esse tabuleiro é de uso interno da camada de tabuleiro
		return board;
	}
}
