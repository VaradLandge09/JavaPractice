package Greedy;

import java.util.Arrays;
import java.util.Comparator;

class Item {
    int weight;
    int profit;
    public Item (int profit, int weight) {
        this.weight = weight;
        this.profit = profit;
    }
}

public class fractionalKnapsack {

    public static double getMaxProfit(Item[] arr, int capacity) {

        // Sorting the array
        Arrays.sort(arr, new Comparator<Item>() {
            @Override
            public int compare(Item i1, Item i2) {

                double c1 = Double.valueOf(i1.profit/i1.weight);
                double c2 = Double.valueOf(i2.profit/i2.weight);

                if(c2 > c1)
                    return 1;
                else
                    return -1;
            }
        });

        double totalVal = 0;

        for(Item i: arr) {
            int wt = i.weight;
            int pt = i.profit;
            if(capacity - wt >= 0) {
                totalVal += pt;
                capacity -= wt;
            }
            else {
                double fraction = (double)capacity/(double)wt;
                totalVal += (double)pt * fraction;
                capacity = (int)(capacity - (wt * fraction));
                break;
            }
        }

        return totalVal;
    }

    public static void main(String[] args) {
        Item[] arr = {
            new Item(30, 7),
            new Item(79, 10),//
            new Item(34, 4),//
            new Item(12, 8),
            new Item(45, 7),//
            new Item(19, 4),
            new Item(70, 10)//
        };

        // 34 + 79 + 70 + 38.57
        // 30 - 4 - 10 - 10

        int capacity = 30;
        double val = getMaxProfit(arr, capacity);
        System.out.println(val);
    }

}