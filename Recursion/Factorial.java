package Recursion;

public class Factorial {
    
    public static int fact(int n)
    {
        if(n == 1 || n == 0)
        {
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }

    public static void main(String[] args) {
     
        int a = fact(8);
        System.out.println("Factorial 5 : " + a);
        
    }
}
