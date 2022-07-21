import java.util.*;
public class Q33_SecondLargestEleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();
        int []arr=new int [size];

        if(size<=0){
            System.out.println("Oops...you entered invalid range of array");
        }
        else if(size<2){
            System.out.println("Enter elements of array : ");
            for(int i=0;i<size;i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.println("There is only one element in array is : "+arr[0]);
        }else {
            System.out.println("Enter elements of array : ");
            for(int i=0;i<size;i++)
            {
                arr[i]=sc.nextInt();
            }
            for (int i = 0; i < size - 1; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            int temp=0;
            int big=arr[size-1];
            for(int i=size-2;i>=0;i--)
            {
             if(arr[i]<big)
             {
                 temp=arr[i];
                 break;
             }else{
                 temp=big;
             }
            }
            if(temp==big){
                System.out.println("Array is : ");

                for (int j : arr) {
                    System.out.print(j + " ");
                }
                System.out.println();
                System.out.println("All elements are similar which is : "+temp);
            }else {
                System.out.println("Array is : ");

                for (int j : arr) {
                    System.out.print(j + " ");
                }
                System.out.println();
                System.out.println("Second largest element in this array is : " + temp);
            }
        }
    }
}
