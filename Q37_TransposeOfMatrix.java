import java.util.*;
public class Q37_TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Rows and Columns of Matrix :");
        int row =sc.nextInt();
        int col = sc.nextInt();
        int [][]arr =new int[row][col];
        int [][]res=new int[col][row];
        if(!(row==0 || col==0 )) {
            System.out.println("Enter elements of matrix : ");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    res[j][i] = arr[i][j];
                }
            }
            System.out.println("Original Matrix is : ");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(arr[i][j] + "  ");
                }
                System.out.println();
            }
            System.out.println("Transpose of Matrix is : ");
            for (int i = 0; i < col; i++) {
                for (int j = 0; j < row; j++) {
                    System.out.print(res[i][j] + "  ");
                }
                System.out.println();
            }
        }else {
            System.out.println("Array size should be more than 0...!!!");
        }

    }
}
