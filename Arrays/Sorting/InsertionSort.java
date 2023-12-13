package Sorting;

public class InsertionSort {
    
    public static void insertionSort(int[] arr)
    {
        for(int i = 1; i < arr.length; i++)
        {
            int j = i;
            while(j>0 && arr[j] < arr[j-1])
            {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }
        }
    }

    public static void main(String[] args) {
        
        int[] arr = {2, 5, 12, 3, 15, 1};
        insertionSort(arr);
        for(int i: arr)
        {
            System.out.print(i + " ");
        }
    }
}
