package DivideConquer;
// TC -> Nlog2N
// SC -> N

public class MergeSort {

    public static  void merge(int[] arr, int l, int mid, int r)
    {
        int i, j ,k;

        int n1 = mid -l +1;
        int n2 = r - mid;

        int[] lsubarr = new int[n1];
        int[] rsubarr = new int[n2];

        for(i=0; i<n1; i++)
        {
            lsubarr[i] = arr[l+i];
        }

        for(j=0; j<n2; j++)
        {
            rsubarr[j] = arr[mid+1+j];
        }

        i = 0;
        j = 0; 
        k = l;

        while(i<n1 && j<n2)
        {
            if(lsubarr[i]<rsubarr[j])
            {
                arr[k] = lsubarr[i];
                i++;
            }
            else{
                arr[k] = rsubarr[j];
                j++;
            }
            k++;
        }

        while(i<n1)
        {
            arr[k] = lsubarr[i];
            i++; k++;
        }

        while(j<n2)
        {
            arr[k] = rsubarr[j];
            j++; k++;
        }

    }

    public static void mergeSort(int[] arr, int i, int j)
    {
        if(i<j)
        {
            int mid = i + (j-i)/2;

            mergeSort(arr, i, mid);
            mergeSort(arr, mid+1, j);

            merge(arr, i, mid, j);
        }    
    }

    private static void printArr(int[] arr, int n) {
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){
        int[] arr = {78, 23, 56, 34, 9, 12, 89, 45};
        int n = arr.length;
        printArr(arr, n);
        System.out.println();
        mergeSort(arr, 0, (n-1));

        printArr(arr, n);
    }

    
}
