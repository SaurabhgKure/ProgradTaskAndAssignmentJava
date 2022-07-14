import java.util.*;
public class Q25_GrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary of Employee");
        double salary = sc.nextInt();
        double ta = 0.10*salary;
        double da = 0.15*salary;
        double hra = 0.20*salary;
        double pf =0.12*salary;
        double bonus=0;
        double grossSalary=0;
        if (salary>=20000)
        {
            bonus = 0.1*salary;
        }else {
            bonus =0.2*salary;
        }
        grossSalary=salary+ta+da+hra+bonus-pf;
        System.out.println("Gross salary of employee is : " + grossSalary);
    }
}
