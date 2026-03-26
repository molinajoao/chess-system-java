package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
 
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();	//quando inicia a partida, cria o tabuleiro 8x8 e o initialSetup
	}
	
	public  ChessPiece[][] getPieces(){ //isso é para o programa reconhecer a camada de xadrez e não a de tabuleiro
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i=0; i< board.getRows(); i++) {
			for(int j=0; j< board.getColumns(); j++){
			mat[i][j] = (ChessPiece) board.piece(i, j);
		}
	}
	return mat;
}
	
	private void initialSetup() { //método responsável por iniciar a partida de xadrez colocando as peças no tabuleiro
		board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
		board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
		board.placePiece(new King(board, Color.WHITE), new Position(7, 4));
	}
}
