package Checkers;

public class Move extends Validate{
	void move(int oldx, int oldy, int newx, int newy, char[][] board)
	{
		  oldx=oldx+oldx+2;
		  oldy=oldy+2;
		  newx=newx+newx+2;
		  newy=newy+2;
		  if(valid(oldx,oldy,newx,newy,board))
		  {
			  board[oldx][oldy]=' ';
			  board[newx][newy]=number;
		  }
	}
}
