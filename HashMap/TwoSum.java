package HashMap;

import java.util.*;

public class TwoSum {
    
    public static int[] twoSum(int[] nums, int target)
    {
        int[] ans = new int[2];
        int flag = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            map.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == target && map.containsKey(0))
            {
                ans[0] = i;
                ans[1] = map.get(0);
                flag = 1;
                break;
            }

            if(map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i)
            {
                ans[0] = map.get(target - nums[i]);
                ans[1] = i;
                flag = 1;
                break;
            }
        }

        if(flag == 0)
        {
            ans[0] = -1;
            ans[1] = -1;
        }

        return ans;
    }

    public static void main(String[] args) {
        
        int arr[] = {2, 7, 11, 15};
        int ans[] = twoSum(arr, 3);
        for(int i: ans)
        {
            System.out.print(i + " ");
        }
    }
}
