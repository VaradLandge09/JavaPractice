package Recursion;
// Time Comoplexity = O(log(10)n)
// Space Complexity = O(n)
public class SumOfDigits {
    
    public static int sum(int n)
    {
        if(n < 10)
        {
            return n;
        }

        else{

            int x = n% 10;
            return x + sum(n/10);

        }
    }


    public static void main(String[] args) {
        
        int a = sum(12345);
        System.out.println("Sum : " + a);
    }
}
