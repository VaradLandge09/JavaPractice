package Heap;


// Leftchild = 2*i +1
// Rightchild = 2*i +2

// parent Node using child node = ((i/2)+1) - 1
public class Insertion {

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int leftIdx = 2*i + 1;
        int rightIdx = 2*i + 2;

        if(leftIdx < n && arr[leftIdx] < arr[largest]) {
            largest = leftIdx;
        }

        if(rightIdx < n && arr[rightIdx] < arr[largest]) {
            largest = rightIdx;
        }

        if(largest != i) {
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;

            heapify(arr, n, largest);
        }
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
        
    }
}