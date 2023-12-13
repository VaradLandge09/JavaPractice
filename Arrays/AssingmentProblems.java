
public class AssingmentProblems {

    public static int sumOfEvenIndicies(int[] arr){
		int s = 0;
	    for(int i = 0; i < arr.length; i++){
	        if(i%2 == 0){
	            s += arr[i];
            }
        }
        return s;
    } 

    public static void evenElements(int[] arr)
    {
        for(int i: arr)
        {
            if(i%2 == 0)
            {
                System.out.print(i + " ");
            }
        }
    }

    public static int maxElement(int[] arr)
    {
        int max = arr[0];
        for(int i: arr)
        {
            if(max < i)
            {
                max = i;
            }
        }
        return max;
    }

    public static int secondLargestEle(int[] arr)
    {
        int max = maxElement(arr);
        int secMax = arr[0];
        for(int i: arr)
        {
            if(secMax < i && i != max)
            {
                secMax = i;
            }
        }
        return secMax;
    }

    public static int firstPeak(int[] arr)
    {
        int peak = -1;
        for(int i = 0; i < arr.length; i++)
        {
            if(i != 0 && arr[i-1] < arr[i] && arr[i+1] < arr[i])
            {
                peak = arr[i];
                return peak;
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        int[] arr = {34, 48, 50, 55, 21, 65, 54, 43, 60};
        // int a = sumOfEvenIndicies(arr);
        // System.out.println(a);

        // evenElements(arr);

        int a = firstPeak(arr);;
        System.out.println(a);
    }
}
