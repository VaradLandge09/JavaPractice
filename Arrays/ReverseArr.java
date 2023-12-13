// This program will reverse the given array

public class ReverseArr {
    
    static void reverseArray(int[] arr)
    {
        int n = arr.length;
        for(int i = 0; i < n/2; i++)
        {
            int temp = arr[n-1-i];
            arr[n-1-i] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        
        int[] a = {1, 2, 3, 4, 5};
        reverseArray(a);
        for(int i : a)
        {
            System.out.print(i + " ");
        }
    }
}
