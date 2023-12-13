package Sorting;

public class BubbleSort {
    
    public static int[] bubbleSort(int[] arr)
    {
        for(int i = 1; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length -i; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {2, 5, 12, 3, 15, 1};
        arr = bubbleSort(arr);
        for(int i: arr)
        {
            System.out.print(i + " ");
        }
        
    }
}
