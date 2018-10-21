package chessBoard;
public class Test {
    
    public static void main(String[] args) {
    
    
      Chessboard ch=new Chessboard();
      boolean res;
      System.out.println("Fresh Board \n ___________");
      ch.DisplayChessBoard();
       System.out.println(" ");
     System.out.println("Test 1\n-----");
      char [][]boardgames = new char[][]{
{'R', 'H', 'B', 'Q', 'K', 'B', 'H', 'R'},
{'\0', '\0','P', 'P', 'P', 'P', 'P','P'},
{'\0','P','\0','\0','\0','\0','\0','\0'},
{'\0','\0','\0','\0','\0','\0','\0','\0'},
{'\0','\0','\0','\0','\0','\0','\0','\0'},
{'\0','\0','\0','\0','\0','\0','\0','\0'},
{'p','p','p','p','p','p','p','p'},
{'r','h','b','q','k','b','h','r'}
};    ch=new Chessboard(boardgames);
    ch.DisplayChessBoard();
     res =ch.submitBoardMove('W', 0, 0,2,0);
          System.out.println("Expected Result : True ,  The result of Move:"+ res);
    res = ch.submitBoardMove('W', 2, 0,2,1);
     System.out.println("Expected Result : False , The result of Move:"+res);
     ch.DisplayChessBoard();
     System.out.println("Test 2\n-----");
      boardgames = new char[][]{
{'R', 'H', 'B', 'Q', 'K', 'B', 'H', 'R'},
{'\0', '\0','\0', '\0', '\0', '\0', '\0','\0'},
{'\0','\0','\0','\0','\0','\0','\0','\0'},
{'\0','\0','\0','\0','\0','\0','\0','\0'},
{'\0','\0','\0','\0','\0','\0','\0','\0'},
{'\0','\0','\0','\0','\0','\0','\0','\0'},
{'\0','\0','\0','\0','\0','\0','\0','\0'},
{'r','h','b','q','k','b','h','r'}
};
ch=new Chessboard(boardgames);
ch.DisplayChessBoard();     
res =ch.submitBoardMove('W', 0, 0,2,0);
System.out.println("Expected Result : True , Result :"+res);
 ch.DisplayChessBoard();     
 
res =ch.submitBoardMove('W', 2, 0,2,7);
System.out.println("Expected Result : False , Result :"+res);
res = ch.submitBoardMove('B', 7, 7,2,7);     
 System.out.println("Expected Result : True , Result :"+res);   
    ch.DisplayChessBoard();
    res =ch.submitBoardMove('W', 2, 0,2,7);
      System.out.println("Expected Result : True , Result :"+res); 
    ch.DisplayChessBoard();
    res =ch.submitBoardMove('B', 7, 0,1,0);
      System.out.println("Expected Result : True , Result :"+res); 
    ch.DisplayChessBoard();
    
     System.out.println("Test 3\n-----");
     boardgames =new char[][] {
{'\0', 'H', 'B', '\0', 'K', 'B', 'H', 'R'},
{'\0', 'P','P', 'P', 'P', 'P', 'P','P'},
{'R','\0','\0','Q','\0','\0','\0','\0'},
{'P','\0','\0','\0','\0','\0','\0','\0'},
{'\0','\0','\0','\0','\0','\0','\0','\0'},
{'\0','\0','\0','\0','\0','\0','\0','\0'},
{'p','p','p','p','p','p','p','p'},
{'r','h','b','q','k','b','h','r'}
};
      ch=new Chessboard(boardgames);
      ch.DisplayChessBoard();
       res =ch.submitBoardMove('W', 2, 0,2,2);
      System.out.println("Expected Result : True , Result :"+res); 
    ch.DisplayChessBoard();
    
    System.out.println("Test 4\n-----");
          boardgames =new char[][] {
{'\0', 'H', 'B', 'Q', 'K', 'B', 'H', 'R'},
{'\0', 'P','P', 'P', 'P', 'P', 'P','\0'},
{'R','\0','p','\0','\0','\0','P','p'},
{'P','\0','\0','\0','\0','\0','\0','\0'},
{'\0','\0','\0','\0','\0','\0','\0','\0'},
{'\0','\0','\0','\0','\0','\0','\0','\0'},
{'p','p','p','\0','p','p','p','\0'},
{'r','h','b','q','k','b','h','r'}
};
    ch=new Chessboard(boardgames);
   ch.DisplayChessBoard();
    System.out.println("Expected Result : False , Result:"+ch.submitBoardMove('W', 7, 0,6,0));
    ch.DisplayChessBoard();
    
    System.out.println("Adding a new Piecehandler");
    Piece p=new Pawns();
    boolean b = ch.addPieceHandler(p, 'p');
    System.out.println("Result : "+b);
    //handling newly added pawn handler
    System.out.println("Expected Result : True , Result:"+ch.submitBoardMove('W', 1, 1,3,1));
    ch.DisplayChessBoard();
    }
  
}