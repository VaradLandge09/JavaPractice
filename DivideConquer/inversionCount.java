package DivideConquer;

import java.util.Arrays;

public class inversionCount {

    public static int mergeProc(int[] arr, int l, int m, int h) {
        int cnt = 0;
        int[] lsubarr = Arrays.copyOfRange(arr, l, m+1);
        int[] rsubarr = Arrays.copyOfRange(arr, m+1, h+1);

        int i=0;
        int j=0;
        int k=l;

        while(i<lsubarr.length && j<rsubarr.length) {
            if(lsubarr[i] <= rsubarr[j]) {
                arr[k++] = lsubarr[i++];
            }
            else {
                arr[k++] = rsubarr[j++];
                cnt += (m+1) - (l+i);
            }
        }

        while(i<lsubarr.length) {
            arr[k++] = lsubarr[i++];
        }

        while(j<rsubarr.length) {
            arr[k++] = rsubarr[j++];
        }

        return cnt; 
    }

    public static int invCount(int[] arr, int l, int h) {
        int count = 0;
        if(l<h) {
            int mid = l + (h-l)/2;

            count += invCount(arr, l, mid);
            count += invCount(arr, mid+1, h);

            count += mergeProc(arr, l, mid, h);
        }
        return count;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 3, 8, 4};
        int n = arr.length;
        int count = invCount(arr, 0, n-1);
        System.out.println(count);
    }
}
