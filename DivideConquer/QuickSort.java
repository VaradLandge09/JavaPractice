package DivideConquer;
// TC(worst case) -> O(n^2)
// SC -> O(1)
public class QuickSort {

    public static int partation(int[] arr, int l, int h) {
        int i = l;
        int pivot = arr[l]; 
        for(int j=l+1; j<=h; j++) {
            if(arr[j]<=pivot) {
                i++;
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        int t = arr[i];
        arr[i] = arr[l];
        arr[l] = t;
        return i;
    }

    public static void sort(int[] arr, int l, int h)
    {
        if(l<h)
        {
            // divide 
            int m = partation(arr, l, h);

            // Conquer
            sort(arr, l, m-1);
            sort(arr, m+1, h);
        }
    }

    public static void printArr(int[] arr, int n)
    {
        for(int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {50, 10, 40, 80, 70, 90, 30, 60};
        int n = arr.length;
        printArr(arr, n);
        sort(arr, 0, n-1);
        printArr(arr, n);
    }
}
