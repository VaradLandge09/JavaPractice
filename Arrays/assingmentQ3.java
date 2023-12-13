
public class assingmentQ3 {
    
    // To find the sum of all the elements in array
     
    public static void main(String[] args) {
        
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for(int i = 0; i < 10; i++){
            sum = sum + a[i];
        }

        System.out.println("Sum of elements in array is : " + sum);
    }
}
