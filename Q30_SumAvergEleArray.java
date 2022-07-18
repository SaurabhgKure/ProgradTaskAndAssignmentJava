import java.util.*;
public class Q30_SumAvergEleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array : ");
        int n = sc.nextInt();
        double sum = 0.0;
        double average;
        int[] arr = new int[n];
        if (n > 0) {
            System.out.println("Enter Elements of array : ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                sum = sum + arr[i];
            }
            average = sum / n;
            System.out.println("Sum of all elements is : " + sum);
            System.out.println("Average of all elements is : " + average);
        }else{
            System.out.println("Size of array should be minimum 1...!!");
        }
    }
}
