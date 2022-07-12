import java.util.Scanner;
public class Q13_CountOfAllPrimeNO {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Lower Limit");
        int a =sc.nextInt();
        System.out.println("Enter Upper Limit");
        int b=sc.nextInt();
        int count=0;
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
                    count++;
                }
            }
        }
        System.out.println("Total Prime Numbers are : " + count);
    }
}
