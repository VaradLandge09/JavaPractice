
import java.util.Scanner;

class AssingmentProb2D
{

    public static void que1()
    {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Entre the number for rows :" );
        n = sc.nextInt();    

        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.println("Entre the Element: ");
                arr[i][j] = sc.nextInt();

            }
        }

        System.out.println("Elements are : ");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i == n/2 || j == n/2)
                {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }

        sc.close();
    }

    public static void main(String[] args) {

        que1();
        
    }
}