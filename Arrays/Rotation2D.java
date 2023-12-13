// In this program, the matrix will be rotated by 90 degree

public class Rotation2D {
    
    static void rotate(int[][] arr)
    {
        int m = arr.length;
        // transpose of matrix
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < i; j++)
            {
                
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
                
            }
        }

        // Rotation of matrix
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < m/2; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[i][m-1-j];
                arr[i][m-1-j] = temp;
            }
        }
        
    }

    public static void main(String[] args) {
        
        int[][] a = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        
        for(int[] i: a)
        {
            for(int j: i)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        rotate(a);

        System.out.println("============== Rotated Matrix ==============");

        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[0].length; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
