package Backtracking;

public class SukudoSolver {
    
    public boolean isValid(char[][] board, int row, int col, char c)
    {
        for(int a = 1; a <= 9; a++)
        {
            // Checking Vertically
            if(board[a][col] == c)
            {
                return false;
            }

            // Checking Horizontally
            if(board[row][a] == c)
            {
                return false;
            }
        }

        
        // Checking the Grid
        int sr = (row/3) +3;
        int sc = (col/3) +3;
        
        for(int i=sr; i<sr+3; i++)
        {
            for(int j=sc; j<sc+3; j++)
            {
                if(board[i][j] == c){
                    return false;
                }
            }
        }

        return true;
    }

    public boolean solve(char[][] board)
    {
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board.length; j++)
            {
                if(board[i][j] == '.')
                {
                    for(char c = '1'; c <= '9'; c++)
                    {
                        if(isValid(board, i, j, c))
                        {
                            board[i][j] = c;
                            if(solve(board))
                            {
                                return true;
                            }
                            else{
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

}
