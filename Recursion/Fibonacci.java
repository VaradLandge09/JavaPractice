package Recursion;

public class Fibonacci {
    
    public static int fibo(int n)
    {
        if(n < 2)
        {
            return n;
        }
        else{
            return fibo(n-1) + fibo(n-2);
        }
    }


    public static void main(String[] args) {
        
        int a = fibo(2);
        System.out.println("Fibonaccci series : " + a);
    }
}
