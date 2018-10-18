package chessBoard;

import java.util.List;

/**
 *
 * @author Aravind.Ramachandran
 */
public class Chessboard {

    char chessboard[][];     
    Moves m;
    char nextPlayer='W';
    Rook rok ;    //generating a new Rook object
    public  Chessboard()
    {
        chessboard = new char [8][8];
        initalizeBoard();
        m = new Moves();
        rok = new Rook();
    }
    public Chessboard(char board[][])   //consructor to set predefined board
    {
        chessboard=board;
         m = new Moves();
         rok = new Rook();
    }
   private void initalizeBoard()
    {
        int i=0;

            for(int j=0;j<8;j++)
            {

                switch(j)
                {
                    case 0: chessboard[i][j]='R';
                            chessboard[i][7]='R';
                            chessboard[i+7][j]='r';
                            chessboard[i+7][7]='r';
                            break;
                    case 1: chessboard[i][j]='H';
                            chessboard[i][6]='H';
                            chessboard[i+7][j]='h';
                            chessboard[i+7][6]='h';
                            break;
                    case 2: chessboard[i][j]='B';
                            chessboard[i][5]='B';
                            chessboard[i+7][j]='b';
                        chessboard[i+7][5]='b';
                        break;
                    case 3: chessboard[i][j]='Q';
                            chessboard[i+7][j]='q';
                            break;
                    case 4: chessboard[i][j]='K';
                        chessboard[i+7][j]='k';
                        break;

                }
                //handling the pawns
                chessboard[i+1][j]='P';
                chessboard[i+6][j]='p';
            }
          }
          public boolean submitBoardMove(char player,int strow,int stcol,int enrow,int encol)    
          {
              if(player==nextPlayer)//handling player turns
              {
                if((player =='W' && Character.isLowerCase(chessboard[strow][stcol]))||(player == 'B' && Character.isUpperCase(chessboard[strow][stcol])))//check if move turn is correct and user trying to move opponents peice
                {
                   return false;
                }
                switch(Character.toLowerCase(chessboard[strow][stcol]))  
                {
                    case 'r':   if(rok.checkMove(strow, stcol, enrow, encol, chessboard))    //move is valid then
                                  {
                                      if(nextPlayer=='W')   //fliping player after valid move
                                      {
                                          nextPlayer='B';
                                      }
                                      else
                                      {
                                          nextPlayer='W';
                                      }
                                      String mv="("+strow+","+stcol+") -> ("+enrow+","+encol+") peice:"+chessboard[strow][stcol];
                                      chessboard[enrow][encol]=chessboard[strow][stcol];  //enact the move in board
                                      chessboard[strow][stcol]='\0'; 
                                      m.addMove( player,mv);    //add the move to players move list          
                                      return true;
                                  };

                                  break;
                }
              }
              return false;
          }
          /*Move retrival functions*/
          public List<String> getMoves(char player)
          {
              return m.getAllMoves(player);
          }
          public String getLastMove(char player)
          {
              return m.getLastMove(player);
          }
          
          
          public char [][] GetBoard()//retrive the current board represented in a matric board status
          {
              return chessboard;
          }
          
          public void DisplayChessBoard()   //displays the matrix represnetation of the move
          {
              for(int i=0;i<8;i++)
              {
                 System.out.print(i);
                  for(int j=0;j<8;j++)
                  {
                      if(chessboard[i][j]=='\0')
                          System.out.print(" "+"_");
                      else
                      System.out.print(" "+chessboard[i][j]);
                  }
                  System.out.println();
              }
          }
  
}