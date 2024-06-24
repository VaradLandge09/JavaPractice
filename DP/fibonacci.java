package DP;

import java.util.HashMap;
// import java.util.Map;

public class fibonacci {

    // Normal Recursion
    // TC => O(2^n)
    // SC => O(n)
    public static int fibo(int n) { 
        if(n<2) return n;

        else return fibo(n-1) + fibo(n-2);
    }

    // Using Memoization 
    // TC => O(n)
    // SC => O(n)
    public static int fibMemo(int n, HashMap<Integer, Integer> memo) {
        if(n<2) return n;

        if(memo.containsKey(n)) {
            return memo.get(n);
        }

        int val = fibMemo(n-1, memo) + fibMemo(n-2, memo);
        memo.put(n, val);
        return val;
    }

    // Using tabulation (NO Recuesion)
    // TC => O(n)
    // SC=> O(n)
    public static int fibTab(int n, int[] fib) {
        fib[0] = 0;
        fib[1] = 1;
        for(int i=2; i<=n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n];
    }
    
    // Using Variables (NO Recuesion)
    // TC => O(n)
    // SC=> O(1)
    public static int fibVar(int n) {
        int f=0;
        int s=1;
        for(int i=2; i<=n; i++) {
            int t = s+f;
            f=s;
            s=t;
        }
        return s;
    }

    public static void main(String[] args) {

        System.out.println(fibVar(10));
        
    }
    
}
