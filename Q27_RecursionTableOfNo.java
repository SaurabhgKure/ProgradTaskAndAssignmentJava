
import java.util.*;
public class Q27_RecursionTableOfNo {

    public void table(int n,int i)
    {
        if(i>10)
        {
            return;
        }

        System.out.println(n*i);
        table(n,i+1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the No.");
        int num = sc.nextInt();
        int i=1;
        Q27_RecursionTableOfNo obj = new Q27_RecursionTableOfNo();
        System.out.println("Table of "+num+" is : ");
        obj.table(num,i);

    }
}

