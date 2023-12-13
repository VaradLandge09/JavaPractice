
// check if the array is palindrom or not !
public class Palindrome
{

    static boolean isPalindrome(int[] arr)
    {
        int n = arr.length;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] != arr[n-i-1])
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) 
    {
        int[] a = {1, 2, 3, 2};

        if(isPalindrome(a))
        {
            System.out.println("Array is Palindrome !");
        }
        else{
            System.out.println("Array is not a Palindrome !");
        }

    }
}