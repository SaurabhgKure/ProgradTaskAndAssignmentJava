import java.util.*;
public class Q35_MaxAndMinEleArray {


    public void max(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        if(arr.length==1){
            System.out.println("Maximum and Minimum number in this array is : "+arr[0]);
        }else {
            System.out.println("Maximum number in this array is : " + arr[arr.length - 1]);
            System.out.println("Minimum number in this array is : " + arr[0]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        if (size > 0) {
            System.out.println("Enter Elements of array : ");
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            Q35_MaxAndMinEleArray obj = new Q35_MaxAndMinEleArray();
            obj.max(arr);
        }
        else {
            System.out.println("Size of array should be minimum 1...");
        }
    }
}
