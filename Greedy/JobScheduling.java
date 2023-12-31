package Greedy;

import java.util.*;

class Jobs {
    int id;
    int deadline;
    int profit;

    Jobs() {}
    
    public Jobs(int id, int ddl, int pt) {
        this.id = id;
        this.deadline = ddl;
        this.profit = pt;
    }

    public static void printSeq(Jobs[] arr, int deadline) {

        Arrays.sort(arr, new Comparator<Jobs>() {
            @Override
            public int compare(Jobs j1, Jobs j2) {
                if(j1.profit<j2.profit) 
                    return 1;
                else 
                    return -1;
            }
        });

        int n = arr.length;
        boolean[] res = new boolean[deadline];
        int[] jobId = new int[deadline];

        for(int i=0; i<n; i++) {
            for(int j = Math.min(deadline-1, arr[i].deadline-1); j>=0; j--) {
                if(res[j] == false) {
                    res[j] = true;
                    jobId[j] = arr[i].id;
                    break;
                }
            }
        }

        for(int i: jobId) {
            System.out.println(i + " ");
        }
        // for(Jobs i: arr) {
        //     System.out.println(i.id + " | " + i.profit);
        // }
    }
}

public class JobScheduling {

    public static void main(String[] args) {
        Jobs[] arr = {
            new Jobs(1, 5, 55),
            new Jobs(2, 2, 65),
            new Jobs(3, 7, 75),
            new Jobs(4, 3, 60),
            new Jobs(5, 2, 70),
            new Jobs(6, 1, 50),
            new Jobs(7, 4, 85),
            new Jobs(8, 5, 68),
            new Jobs(9, 3, 45)
        };

        Jobs.printSeq(arr, 7);        
    }
}
