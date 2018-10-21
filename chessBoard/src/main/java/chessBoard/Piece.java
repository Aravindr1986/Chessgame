package chessBoard;

public abstract class Piece {
	abstract boolean checkMove(int strow,int stcol,int enrow,int encol,char [][]board);
}
