import java.util.Scanner;
public class Q7_Currency {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Currency : ");
        int currency = sc.nextInt();
        System.out.println("Enter Currency Number");
        int currencyn=sc.nextInt();
        int r,sum=0,temp;


        temp=currencyn;
        while(currencyn>0){
            r=currencyn%10;  //getting remainder
            sum=(sum*10)+r;
            currencyn=currencyn/10;
        }
        if(temp==sum)
        {
            currency=currency*3;
            System.out.println("Your Currency number is Palindrome You get 3 times more the currency " );
            System.out.println(currency);
        }



        else
            System.out.println("your Currency number is not palindrome you get only : " + currency);
    }
}
