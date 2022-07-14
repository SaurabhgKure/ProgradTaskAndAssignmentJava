import java.util.*;
public class Q29_PrintAlphabates {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of rows : ");
        int n=sc.nextInt();
        int letters=n+64;
        if(n>=1 && n<27) {
            for (int i = 0; i < n; i++) {
                for (int j = 65 + i; j <= letters; j++) {
                    char c = (char) j;
                    System.out.print(c + " ");
                }

                System.out.println();
            }
        }else {
            System.out.println("Enter rows from 1 to 27...!!!");
        }
    }
}
