package Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.lang.String;
public class NQueens {

    public static boolean isSafe(char[][] board, int row, int col)
    {
        // checking vertically
        for(int i =0; i < row; i++)
        {
            if(board[i][col] == 'Q')
            {
                return false;
            }
        }

        // checking left diaognal
        int maxL = Math.min(row, col);
        for(int i = 1; i <= maxL; i++)
        {
            if(board[row-i][col-i] == 'Q')
            {
                return false;
            }
        }

        // checking right diagonal
        int maxR = Math.min(row, board.length - 1 - col);
        for(int i = 1; i <= maxR; i++)
        {
            if(board[row-i][col+i] == 'Q')
            {
                return false;
            }
        }
        return true;
    }

    public static void queen(List<List<String>> ans, char[][] board, int row)
    {
        if(row == board.length)
        {
            ans.add(makeString(board));
            return;
        }
        for(int col = 0; col<board.length; col++)
        {
            if(isSafe(board, row, col))
            {
                board[row][col] = 'Q';
                queen(ans, board, row+1);
                board[row][col] = '.';
            }
        }
    }

    public static List<String> makeString(char[][] board) 
    {
        List<String> L = new ArrayList<>();
        for(int i = 0; i < board.length; i++)
        {
            L.add(new String(board[i]));
        }
        return L;
    }

    public static void main(String[] args) {
        List<List<String>> ans = new ArrayList<>();
        int n = 4;
        char[][] board = new char[n][n];
        for(int i = 0; i <n; i++)
        {
            for(int j=0; j< n; j++)
            {
                board[i][j] = '.';
            }
        }

        queen(ans, board, n);        
    }   
}
