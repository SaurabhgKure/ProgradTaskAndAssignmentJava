import java.util.Scanner;
public class Q20_AllArmstrongNoRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Lower Limit : ");
        int fn= sc.nextInt();
        System.out.println("Enter Upper Limit : ");
        int ln= sc.nextInt();
        System.out.println("Below are armstrong Numbers : ");
        for(int i=fn;i<=ln;i++)
        {
            int a=i;
            int b=0;
            int power=0;
            int res =0;

            while(a>0)
            {
                power++;
                a=a/10;
            }
            int temp=i;
            while(temp>0)
            {
                b = temp % 10;
                res +=  (Math.pow(b, power));
                temp = temp/10;

            }

            if(i==res)
            {
                System.out.print(res + " ");
            }
        }
    }
}
