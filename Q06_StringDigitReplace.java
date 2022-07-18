import java.util.Scanner;

public class Q06_StringDigitReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String : ");
        String s = sc.nextLine();
        String result ="";
        for(int i=0;i<s.length();i++)
        {
            int a = s.charAt(i);
            if(a<53)
            {
                result=result+"0";
            }
            if(a>=53)
            {
                result=result+"1";
            }
        }
        System.out.println("New String is : " + result);

    }
}
