package chessBoard;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aravind.Ramachandran
 */
public class Moves 
{
    List<String> Wmoves ;
    List<String> Bmoves ;
    public Moves()
    {
        Wmoves= new ArrayList<String>();
        Bmoves= new ArrayList<String>();
    }
    public int addMove(char Player,String lastMove)
    {
        if(Player=='W')
            Wmoves.add(lastMove);
        else
        {
            if(Player=='B')
                Bmoves.add(lastMove);
            else
                return 0;
        }
        return 1;
    }
    public String getLastMove(char Player)
    {
        if(Player=='W')
            return Wmoves.get(Wmoves.size()-1);
        else
            return Bmoves.get(Bmoves.size()-1);
      
    }
    public List<String> getAllMoves(char Player)
    {
        if(Player=='W')
            return Wmoves;
        else
            return Bmoves;
      
    }
}
