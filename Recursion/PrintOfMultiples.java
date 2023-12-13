package Recursion;
// Time Comoplexity = O(k^2)
// Space Complexity = O(k)
public class PrintOfMultiples {
    
    public static void multiples(int n, int k)
    {
        if(k == 1)
        {
            System.out.println(n);
            return;
        }

        multiples(n, k-1);
        System.out.println(n*k);
        
    }

    public static void main(String[] args) {
        multiples(16, 10);
    }
}
