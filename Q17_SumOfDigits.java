import java.util.Scanner;
public class Q17_SumOfDigits {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        int res=0;
        while(n>0)
        {
            res=res + n%10;
           n= n/10;
        }
        System.out.println("Sum of digits is : " + res);
    }
}
