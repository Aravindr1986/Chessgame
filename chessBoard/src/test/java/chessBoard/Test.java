package chessBoard;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aravind.Ramachandran
 */
public class Test {
    
      public static void main(String[] args) {
        Chessboard ch=new Chessboard();
        boolean res;
       /* ch.DisplayChessBoard();
         System.out.println(" ");*/
        char [][]boardgames = new char[][]{
{'R', 'H', 'B', 'Q', 'K', 'B', 'H', 'R'},
{'\0', 'P','P', 'P', 'P', 'P', 'P','P'},
{'\0','\0','\0','\0','\0','\0','\0','\0'},
{'\0','\0','\0','\0','\0','\0','\0','\0'},
{'\0','\0','\0','\0','\0','\0','\0','\0'},
{'\0','\0','\0','\0','\0','\0','\0','\0'},
{'p','p','p','p','p','p','p','p'},
{'r','h','b','q','k','b','h','r'}
};/*
      ch=new Chessboard(boardgames);
      ch.DisplayChessBoard();
       res =ch.submitBoardMove('W', 0, 0,2,0, boardgames);
      res = ch.submitBoardMove('W', 2, 0,2,1, boardgames);
       System.out.println(" \nThe result of Move:");
       ch.DisplayChessBoard();
       System.out.println("Move Details : "+ch.getMoves('W'));
       
       System.out.println(" ");
  */   
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
  System.out.println("Result :"+res);
   ch.DisplayChessBoard();     
   
  res =ch.submitBoardMove('W', 2, 0,2,7);
  System.out.println("Result :"+res);
  res = ch.submitBoardMove('B', 7, 7,2,7);     
      
      ch.DisplayChessBoard();
      res =ch.submitBoardMove('W', 2, 0,2,7);
      ch.DisplayChessBoard();
      res =ch.submitBoardMove('B', 7, 0,1,0);
      ch.DisplayChessBoard();
    /*  boardgames =new char[][] {
{'R', 'H', 'B', 'Q', 'K', 'B', 'H', 'R'},
{'\0', 'P','P', 'P', 'P', 'P', 'P','P'},
{'\0','\0','\0','\0','\0','\0','\0','\0'},
{'\0','\0','\0','\0','\0','\0','\0','\0'},
{'\0','\0','\0','\0','\0','\0','\0','\0'},
{'\0','\0','\0','\0','\0','\0','\0','\0'},
{'p','p','p','p','p','p','p','p'},
{'r','h','b','q','k','b','h','r'}
};
      ch=new Chessboard(boardgames);
      ch.DisplayChessBoard();
      System.out.println(" ");
      boardgames =new char[][] {
{'R', 'H', 'B', 'Q', 'K', 'B', 'H', 'R'},
{'\0', 'P','P', 'P', 'P', 'P', 'P','P'},
{'\0','\0','\0','\0','\0','\0','\0','\0'},
{'P','\0','\0','\0','\0','\0','\0','\0'},
{'\0','\0','\0','\0','\0','\0','\0','\0'},
{'\0','\0','\0','\0','\0','\0','\0','\0'},
{'p','p','p','p','p','p','p','p'},
{'r','h','b','q','k','b','h','r'}
};
      ch=new Chessboard(boardgames);
      ch.DisplayChessBoard();
      System.out.println(" ");
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
         System.out.println(" ");
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
      System.out.println("Result:"+ch.submitBoardMove('W', 7, 0,6,0, boardgames));
      ch.DisplayChessBoard();
       System.out.println(Character.isUpperCase('\0'));*/
    }
    
}
