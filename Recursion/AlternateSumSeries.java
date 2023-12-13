package Recursion;
// Time Comoplexity = O(n)
// Space Complexity = O(n)

public class AlternateSumSeries {
    
    public static int alternateSum(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        else if(n %2 == 0)
        {
            return (-n) + alternateSum(n-1);
        }
        else
        {
            return n + alternateSum(n-1);
        }
    }

    public static void main(String[] args) {

        int a = alternateSum(9);
        System.out.println("Sum of the series : " + a);
    }
}
