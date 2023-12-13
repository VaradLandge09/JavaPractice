
public class assingmentQ4 {
    
    // To find the index of a specific element

    public static void main(String[] args) {
        
        int[] a = {2, 7, 1, 5, 9};

        int num = 1;
        int index = -1;

        for(int i = 0; i < 5; i++){

            if(a[i] == num){
                index = i;
                break;
            }
            
        }
        if(index == -1){
            System.out.println("The number is not present in array!");
        }
        else{
            System.out.println("The index of desired number is : " + index);
        }
        
    }
}
