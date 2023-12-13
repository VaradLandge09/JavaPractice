package Searching;

import java.util.Scanner;

public class BinarySearch {
    
    public static int binarySearch(int[] arr, int target)
    {
        int low = 0, high = arr.length - 1, idx = -1;

        while(low <= high)
        {
            int mid = low + (high - low)/2;

            if(arr[mid] == target)
            {
                idx =  mid;
            }
            else if(arr[mid] < target)
            {
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return idx;
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Taking inputs in array
        System.out.println("Enter the elements of array");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Entre the element you want to search : ");
        int target = sc.nextInt();

        int ans = binarySearch(arr, target);

        if(ans == -1)
        {
            System.out.println("Element not present !");
        }
        else{
            System.out.println("The element in present at index : " + ans);
        }

        sc.close();
    }
}
