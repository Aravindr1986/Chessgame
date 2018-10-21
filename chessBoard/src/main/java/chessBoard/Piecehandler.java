package chessBoard;

import java.util.HashMap;
import java.util.Map;

public class Piecehandler {
	
	Map<Character ,Piece> pieces ;
	public Piecehandler()
	{
		pieces =  new HashMap< Character ,Piece>(); 
		Piece p = new Rook();
		pieces.put('r', p);
	}
	public boolean addPiece(Piece obj,char c)
	{
		Piece p = obj;
		pieces.put(c, p);
		return true;
	}
	public boolean  checkMove(char currPiece,int strow,int stcol,int enrow,int encol,char [][]board)
	{
		return pieces.get(currPiece).checkMove(strow, stcol, enrow, encol, board);
	}
	

}
