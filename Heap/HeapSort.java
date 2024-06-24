package Heap;

public class HeapSort {
    
    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int rightIdx = 2*i + 2;
        int leftIdx = 2*i + 1;

        if(n > rightIdx && arr[largest] < arr[rightIdx]) {
            largest = rightIdx;
        }

        if(n > leftIdx && arr[largest] < arr[leftIdx]) {
            largest = leftIdx;
        }

        if(largest != i) {
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;

            heapify(arr, n, largest);
        }
    } 

    public static int[] heapSort(int arr[], int n) {
        // int ans[] = new int[n];
        for(int i=n-1; i>=0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapify(arr, i, 0);
        }

        return arr;
    }

    public static void buildHeap(int[] arr, int n) {
        int start = n/2 -1;

        for(int i=start; i>=0; i--) {
            heapify(arr, n, i);
        }
    }

    public static void display(int[] arr) {
        for(int i: arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};
        int n=arr.length;
        buildHeap(arr, n);
        display(arr); 
        System.out.println();
        int[] a = heapSort(arr, n);
        display(a);
    }
}
