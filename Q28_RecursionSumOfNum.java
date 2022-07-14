import java.util.*;
public class Q28_RecursionSumOfNum {

    public int sumOfNum(int n)
    {

        if(n<0){
            if(n==0)
            {
                return 0;
            }

            return n+sumOfNum(n+1);
        }else {
            if (n == 0) {
                return 0;
            }

            return n + sumOfNum(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        Q28_RecursionSumOfNum obj = new Q28_RecursionSumOfNum();
        int result = obj.sumOfNum(num);
        System.out.println("Sum of Number is : "+result);
    }
}
