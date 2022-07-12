import java.util.Scanner;
public class Q19_ArmstrongOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int a=n;
        int b=0;
        int power=0;
        int res =0;

        while(a>0)
        {
         power++;
         a=a/10;
        }
        int temp=n;
        while(temp>0)
        {
            b = temp % 10;
            res +=  (Math.pow(b, power));
            temp = temp/10;

        }
        if(n==res) {
            System.out.println("This is a Armstrong number");
        }
        else {

            System.out.println("This is not a Armstrong  number");
        }
    }
}
