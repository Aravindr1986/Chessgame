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
public class Rook extends Piece {
    public boolean checkVlaidityOfMove(int strow,int stcol,int enrow,int encol)
    {
        if(strow==enrow||stcol==encol)
                return true;
        return false;
    }
    public boolean checkOtherPeices(int strow,int stcol,int enrow,int encol,char [][]board)   //check if there are any peices between the start and end position.
    {
        int i;
        if(Character.isUpperCase(board[strow][stcol])&& Character.isUpperCase(board[enrow][encol])||Character.isLowerCase(board[strow][stcol]) && Character.isLowerCase(board[enrow][encol]))  //if both the src and destination contains the peices of the same color
        {
        //    System.out.println("Here1"+" Start:"+board[strow][stcol]+" End:"+board[enrow][encol]+ " "+Character.isLowerCase(board[strow][stcol])+" "+Character.isLowerCase(board[enrow][encol]));
            return false;
        }
        else
        {   
            int adder =0;
            if(strow<enrow||stcol <encol)   //check of increment or decrement
            {
                adder=1;
            }else {
                if(strow>enrow||stcol >encol)
                {
                   
                    adder=-1;
                }
            }
            if(strow!=enrow)    //check for any peice in between the src position and the destination position
            {
                for(i=strow+adder;i!=enrow;i+=adder)
                {
                    if(board[i][stcol]!='\0')
                    {
                       return false;
                    }
                }
            }
            else
            {
                for(i=stcol+adder;i!=encol;i+=adder) 
                {
                    
                    if(board[strow][i]!='\0')
                    {
                        System.out.println("Here44");
                        return false;
                    }
                        
                }
            }
        }    
       return true;
        
    }
    public boolean checkMove(int strow,int stcol,int enrow,int encol,char [][]board)
    {
        if(checkVlaidityOfMove(strow,stcol,enrow,encol)&& checkOtherPeices(strow,stcol,enrow,encol,board))
            return true;
        return false;
    }
    
}
