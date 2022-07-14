import java.util.*;
public class Q24_CompanyInsuranceClm {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Driver's marital status Married or Unmarried ");
        String status =sc.nextLine();
        String s =status.toLowerCase();
        if(s.equals("married"))
        {
            System.out.println("Congrats...Driver is able to get company insurance policy");
        }
        else if(s.equals("unmarried")) {
            System.out.println("Enter driver's Gender Male of Female ");
            String gender = sc.next();
            String g=gender.toLowerCase();
            System.out.println("Enter driver's Age : ");
            int age = sc.nextInt();
            if ((g.equals("male") && age > 30)) {
                System.out.println("Congrats....Driver is able to get company insurance policy");
            }
            else if ((g.equals("female") && age > 25)) {
                System.out.println("congrats...Driver is  able to get company insurance policy");
            }
            else {
                System.out.println("Sorry....Driver is Not eligible !!");
            }
        }
        else{
            System.out.println("Enter proper words... !!");
        }
    }
}
