package Stack;

import java.util.Arrays;

// import java.util.*;

public class LargestRectangle {
    
    public static int[] prevSmaller(int[] arr)
    {
        int[] prevSm = new int[arr.length];

        for(int i=0; i<arr.length; i++)
        {
            if(i==0) prevSm[i]= -1;

            int j = i-1;

            for(j=i-1; j >= 0; j--)
            {
                if(arr[j] < arr[i])
                {
                    prevSm[i] = j;
                    break;
                } 
            }

            if(j==-1){
                prevSm[i] = -1;
            }

        }

        return prevSm;
    }

    public static int[] nextSmaller(int[] arr)
    {
        int[] nextSm = new int[arr.length];

        for(int i = 0; i < arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[j]<arr[i])
                {
                    nextSm[i] = j;
                    break;
                }
            }

            if(nextSm[i]==0) nextSm[i]=arr.length;

        }

        return nextSm;
    }

    public static int width(int[] arr, int[] nextSm, int[] prevSm)
    {
        int[] width= new int[arr.length];
        int maxArea = 0;

        for(int i = 0; i < arr.length; i++)
        {
            width[i] = nextSm[i] - prevSm[i] -1;
            if(width[i] * arr[i] > maxArea)
            {
                maxArea = width[i] * arr[i];
            }
        }

        return maxArea;
    }

    public static int area(int[] width, int[] arr)
    {
        
        int[] a = new int[arr.length];
        for(int i=0; i < arr.length; i++)
        {
            a[i] = width[i] * arr[i];
        }
        
        int ans = Arrays.stream(a).max().getAsInt();
        

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 2, 3};
        int[] nextSm = nextSmaller(arr);
        int[] prevSm = prevSmaller(arr);
        int ans = width(arr, nextSm, prevSm);

        for(int i: nextSm){
            System.out.print(i + " ");
        }
        System.out.println();
        
        for(int i: prevSm){
            System.out.print(i + " ");
        }
        
        System.out.println();

        System.out.println("The answer is : " + ans);
        

        
    }

}
