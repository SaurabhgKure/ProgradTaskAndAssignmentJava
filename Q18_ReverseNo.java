import java.util.Scanner;

public class Q18_ReverseNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int res=0;
        while(n>0)
        {

            res=10*res + n%10;
            n= n/10;
        }
        System.out.println("Reverse Number is : " + res);
    }
}
