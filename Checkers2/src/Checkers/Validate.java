package Checkers;

public class Validate extends Player {
	boolean valid(int oldx, int oldy, int newx, int newy, char[][] board)
	{
		if(number=='1')
		{
			if(board[oldy][oldx]=='1' && board[oldy][oldx]!=' ')
			{
				if(((newx==oldx-2 || newx==oldx+2) && newy==oldy+1) && board[newy][newx]!='1' && newy<board.length && newx<board.length)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		else if(number=='2')
		{
			if(board[oldy][oldx]=='2' && board[oldy][oldx]!=' ')
			{
				if(((newx==oldx-1 || newx==oldx+1) && newy==oldy-2) || board[newy][newx]!='2' && newy<board.length && newx<board.length)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			return false;
		}
		return true;
	}
}
