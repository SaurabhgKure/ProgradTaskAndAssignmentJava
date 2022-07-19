import java.util.*;
public class Q32_UniqueElementsOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elements you want in array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int count = 0;
        if (size > 0) {
            System.out.println("Enter elements of array ; ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < size; i++) {
                int j;
                for (j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        break;
                    }

                }
                if (i == j) {
                    count++;
                }

            }
            System.out.println("Count of unique elements in array are : " + count);
        }else {
            System.out.println("Size of array should be minimum 1....!!!");
        }
    }
}
