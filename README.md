# Chess game
The following is an abstract implementation of a chess engine. 
The jar file contains the class Chessboard which is the basic interface class that implements all the chess board functionalities. 
In the current implementation, only the Rook movements have been enforced.
The jar file is **chessBoard-0.0.1-SNAPSHOT.jar**.

## Classes
1) Chessboard: It implements all the functionalities of the chessboard and the player turn. The chessboard is represented as a 2D 8X8 array.
   The chessboard class implements the following functions i) intializeBoard : which initializes the pieces of a new board.
   ii) submitBoardMove(char player,int strow,int stcol,int enrow,int encol) : Takes the current player as B for black and W for white and        source and destination column indices and returns whether the move is valid or not. 
   iii) getMoves(char player) : Returns the string of all the moves the particular player has made.
   iv) GetBoard() :Retrieves the 2D array of the current board conditions.
   v) DisplayChessBoard() :Displays the entire chess board.
   
 2) Moves : Keeps Track of all the moves so far of the two players.
 
 3) Rook : Handles and verifies whether the current rook move is valid or not. 
 
 ### Test case 
 The second project contains an implementation of the API which illustrates how to use the various functions. 
