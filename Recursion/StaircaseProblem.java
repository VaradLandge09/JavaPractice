package Recursion;

// For staicase problem, you have to find the number of ways the given number of 
// stairs will require, we can only take 1 or 2 steps at a time. 
// The solution contains fibonacci series.
// The number of ways == (n+1)th element from fibonacci series 

public class StaircaseProblem {

    public static int solution(int n)
    {
        if(n < 2)
        {
            return n;
        }
        else
        {
            return solution(n-1) + solution(n-2);
        }
    }
    
    public static void main(String[] args) {
        int n = 7;
        int a = solution(n + 1);
        System.out.println("Number of ways : " + a);
    }
}
