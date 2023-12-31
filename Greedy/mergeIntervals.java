package Greedy;
import java.util.*;

public class mergeIntervals {
    
    public static int[][] mergeInterval(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        LinkedList<int[]> merged = new LinkedList<>();

        for(int[] i: arr) {
            if(merged.isEmpty() || merged.getLast()[1] < i[0]) {
                merged.add(i);
            }
            else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], i[1]);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 6},
            {2, 5},
            {10, 15},
            {15, 18}
        };

        int[][] arrNew = mergeInterval(arr);

        for(int[] i: arrNew) {
            for(int j: i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
