import java.util.Scanner;
public class Q11_PrimeOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n=sc.nextInt();
        if(n==1){
            System.out.println("It is not a prime number");

        }else {
            int a=0;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.println("It is Not a prime number");
                    a++;
                    break;
                }
            }if(a==0) {
                System.out.println("It is a prime number");
            }
        }
    }

}
