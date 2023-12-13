// This Program will give the array list of duplicate elements

import java.util.*;
public class DuplicateEle {
    
    public static ArrayList<Integer> duplicateElements(int[] arr)
    {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                if(arr[j] == arr[i])
                {
                    ans.add(arr[i]);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        
        int[] array = {1, 2, 5, 3, 2, 4, 3};
        ArrayList<Integer> arr = duplicateElements(array);
        System.out.println("The duplicate elements are : ");
        for(int i = 0; i < arr.size(); i++ )
        {
            System.out.print(arr.get(i) + " ");
        }

    }
}
