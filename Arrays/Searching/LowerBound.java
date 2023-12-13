package Searching;

public class LowerBound {
    
    //To find -> Lower bound/ First occurence of the element

    public static int lowerBound(int[] arr, int k)
    {
        int high = arr.length-1, low = 0, ans = -1; 

        while(low <= high)
        {
            int mid = low + (high - low)/2;

            if(arr[mid] == k)
            {
                ans = mid;
                high = mid - 1;
            }
            else if(arr[mid] < k)
            {
                low = mid + 1;
            }
            else
            {
                high = mid -1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        
        int[] arr = {1, 7, 7, 7, 9, 9, 9};
        int k = 7;
        int ans = lowerBound(arr, k);
        System.out.println("The answer is :" + ans);
    }
}
