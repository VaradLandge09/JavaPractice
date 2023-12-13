package Searching;

public class SQRoot {


    public static int squareRoot(int n)
    {
        int low = 0, high = n/2, ans = -1;

        while(low <= high)
        {
            int mid = low + (high - low)/2;
            long val = mid*mid;

            if(val == n)
            {
                ans = mid;
                break;
            }
            else if(val > n)
            {
                high = mid -1;
            }
            else
            {
                ans = mid;
                low = mid + 1;
            }
            System.out.println("mid - " + mid);
        }

        return ans;
    }

    public static void main(String[] args) {
        int a = squareRoot(99);
        System.out.println("The Square Root is : " + a);
    }
    
}
