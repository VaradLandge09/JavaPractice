package Searching;
import java.util.*;

public class LinearSearch {
    
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

        // Implementation of Linear Search
        int idx = -1;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] == target)
            {
                idx = i;
            }
        }

        if(idx == -1)
        {
            System.out.println("The given element is not present in array !");
        }
        else{
            System.out.println("The given element is present in array at index : " + idx);            
        }

        sc.close();

    }
}
