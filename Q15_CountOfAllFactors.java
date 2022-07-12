import java.util.Scanner;
public class Q15_CountOfAllFactors {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int count=0;
        System.out.println("Enter the Number");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            if(n%i==0){
                count++;
            }
        }
        System.out.println("Total number of Factors are : "+count);
    }
}
