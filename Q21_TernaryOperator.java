import java.util.Scanner;
public class Q21_TernaryOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter First Number");
        int fn=sc.nextInt();
        System.out.println("Enter Second Number");
        int sn=sc.nextInt();
        System.out.println("Enter Third Number");
        int tn=sc.nextInt();
        System.out.println("Enter Fourth Number");
        int fon=sc.nextInt();
        int result=(fn>sn)?(fn>tn)?(fn>fon)?fn:fon:(tn>fon)?tn:fon:(sn>tn)?sn:(tn>fon)?tn:fon;
        System.out.println("Greatest number among four is : " + result);
    }
}
