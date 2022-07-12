import java.util.Scanner;
public class Q12_PrimeNoToRange {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Lower Limit");
        int a =sc.nextInt();
        System.out.println("Enter Upper Limit");
        int b=sc.nextInt();
        System.out.println("Below are prime Numbers ");
        for(int i=a;i<=b;i++){
            int temp=0;
            if(i==1){
                temp++;

            }else {

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        temp++;
                    }
                }if(temp==0) {
                    System.out.println(i);
                }
            }
        }
    }
}
