package DivideConquer;
// TC => O(n) -> best Case
// TC => O(n^2) -> Worst Case
// SC => O(1)
public class selectionProcedure {

    public static int partation(int[] arr, int l, int h) {
        int x = l;
        int i = l;

        for(int j=l+1; j<=h; j++) {
            if(arr[j] < arr[x]) {
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

    public static int selectProc(int[] arr, int l, int h, int k) {
        int m = partation(arr, l, h);
        if(m==k-1) {
            return arr[m];
        }
        else if(m > k-1) {
            return selectProc(arr, l, m-1, k);
        }
        else {
            return selectProc(arr, m+1, h, k);
        }
    }
    
    public static void main(String[] args) {
        
        int[] arr = {50, 20, 70, 90, 40, 60, 30, 80};
        int n = arr.length;
        int k = 3;

        int ans = selectProc(arr, 0, n-1, k);
        System.out.println(ans);
    }
}
