package Recursion;

public class CalPower {
    
    public static double myPow(double x, int n)
    {
        // Approach 1
            // Time Complexity = O(k)
            // Space Complexity = O(k)
        // if(k == 0)
        // {
        //     return 1;
        // }
        // else if(k == 1)
        // {
        //     return n;
        // }
        // else
        // {
        //     return n * power(n, k-1);
        // }


        // Apporach 2
            // Time Complexity = O(log(2)k)
            // Space Complexity = O(k)
            if(n == 0) return 1;

            double ans = 1 / myPow(x, n/2);
            if(n%2 == 0 && n > 0) return ans * ans;
    
            else if(n%2 == 0) return ((ans * ans));
    
            else if(n > 0) return ans * ans * x;
    
            else return ((ans * ans) * (1 / x));
       
    }

    public static void main(String[] args) {
        double a = myPow(2.0, -3);
        System.out.println("Power : " + a);
    }
}
