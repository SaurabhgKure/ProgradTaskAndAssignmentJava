import java.util.*;
public class Q34_EvenOddEleOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter size of an array : ");
        int size=sc.nextInt();
        int []arr=new int[size];
        int []even=new int[size];
        int n=0;
        int []odd=new int[size];
        int m=0;
        if(size>0) {

            System.out.println("Enter elements of array : ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < size; i++) {
                if (arr[i] % 2 == 0) {
                    even[n] = arr[i];
                    n++;
                } else {
                    odd[m] = arr[i];
                    m++;
                }
            }
            System.out.print("Even Numbers in this array are : ");
            for (int j : even) {
                if (j == 0) {
                    continue;
                }
                System.out.print(j + " ");
            }
            System.out.println();
            System.out.print("Odd Numbers in this array are : ");
            for (int j : odd) {
                if (j == 0) {
                    continue;
                }
                System.out.print(j + " ");
            }
        }else {
            System.out.println("Size of array should be minimum 1...");
        }
    }
}
