package Recursion;

public class BinarySearch {
    
    public static int binarySearch(int[] arr, int key, int low, int high)
    {
        int mid = low + (high - low)/2;
        if(low > high)
        {
            return -1;
        }
        if(arr[mid] == key)
        {
            return mid;
        }
        else if(arr[mid] < key)
        {
            return binarySearch(arr, key, mid + 1, high);
        }
        else
        {
            return binarySearch(arr, key, low, mid-1);
        }

    }

    public static void main(String[] args) {
        
        int[] arr = {2, 4, 6, 10, 15, 27, 34, 39, 45, 56};
        int ans = binarySearch(arr, 39, 0, 9);
        System.out.println("The Element is present at : " + ans);
    }
}
