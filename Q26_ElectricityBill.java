import java.util.*;
public class Q26_ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter electricity Units : ");
        int unit = sc.nextInt();
        double bill=0;
        if(unit <=50)
        {
            bill=0.50*unit;
        }else if(unit <=150)
        {
            bill = 25 + (unit-50)*0.75;
        } else if (unit<=250)
        {
            bill= 100 + (unit-150)*1.20;
        }else
        {
            bill =220+(unit-250)*1.50;
        }
        double surcharge = 0.2*bill;
        double amount =bill + surcharge;
        System.out.println("Total Electricity Bill is Rs. "+ amount);
    }
}
