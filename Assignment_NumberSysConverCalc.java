import java.util.*;

class BinaryTo{
    String binaryToOct(String binary)
   {

       int deciNum=Integer.parseInt(binary,2);
       return Integer.toOctalString(deciNum);

   }
     int binaryToDeci(String binary)
    {

        return Integer.parseInt(binary,2);
    }
    String binaryToHexaDeci(String binary)
    {
        int deciNum=Integer.parseInt(binary,2);
        return Integer.toHexString(deciNum).toUpperCase();
    }
}
class OcatalTo {
    String octToBinary(String oct){
        int binary = Integer.parseInt(oct,8);
        return Integer.toBinaryString(binary);
    }
    int octToDeci(String oct){
        return Integer.parseInt(oct, 8);

    }
    String octToHexa(String oct){
        int deciNum=Integer.parseInt(oct,8);
        return Integer.toHexString(deciNum).toUpperCase();

    }
}
class DecimalTo{
    String deciToBinary(String deci){
        int deciNum=Integer.parseInt(deci,10);
        return Integer.toBinaryString(deciNum);
    }
    String deciToOct(String deci){
        int deciNum=Integer.parseInt(deci,10);
        return Integer.toOctalString(deciNum);
    }
    String deciToHexa(String deci){
        int deciNum=Integer.parseInt(deci,10);
        return Integer.toHexString(deciNum).toUpperCase();
    }
}
class HexaTo{
    String hexaToBinary(String deci){
        int deciNum=Integer.parseInt(deci,16);
        return Integer.toBinaryString(deciNum);
    }
    String hexaToOct(String deci){
        int deciNum=Integer.parseInt(deci,16);
        return Integer.toOctalString(deciNum);
    }
    int hexaToDeci(String deci){
        return Integer.parseInt(deci,16);

    }
}
public class Assignment_NumberSysConverCalc {
    public static void main(String[] args) {
        String reset ="\u001B[0m";
        String red ="\u001B[31m";
        String green ="\u001B[32m";
        String yellow ="\u001B[33m";
        String cyan ="\u001B[36m";

        Scanner sc = new Scanner (System.in);
        String choice;
        int checkm;
       main : do {
           checkm=0;
            System.out.println(cyan +"x-------x-------x-------x-------x-------x-------x-------x"+reset);
           System.out.println(yellow+"|          NUMBER SYSTEM CONVERSION CALCULATOR          |"+reset);
           System.out.println(cyan+"x-------x-------x-------x-------x-------x-------x-------x\n" +
                   "|   SELECT YOUR CHOICE FROM WHICH YOU HAVE TO CONVERT   |\n" +
                   "|                                                       |\n" +
                   "|  1. Binary Number                                     |\n" +
                   "|  2. Octal Number                                      |\n" +
                   "|  3. Decimal Number                                    |\n" +
                   "|  4. Hexadecimal Number                                |\n" +
                   "|  5. Exit                                              |\n" +
                   "|                                                       |\n" +
                   "x-------x-------x-------x-------x-------x-------x-------x\n" +
                   "                    \"\"\""+reset);
           System.out.println(green+"<<<--Select Your Choice-->>>"+reset);
                choice=sc.next();
                if((choice.charAt(0)<'6' && choice.charAt(0)>'0') && choice.length()==1) {
                    switch (choice.charAt(0)) {
                        case '1' -> {
                            int check;
                            String select;
                            sub:
                            do {
                                check = 0;
                                System.out.println(cyan +"x-------x-------x-------x-------x-------x-------x-------x"+reset);
                                System.out.println(yellow+"|          NUMBER SYSTEM CONVERSION CALCULATOR          |"+reset);
                                System.out.println(cyan+"x-------x-------x-------x-------x-------x-------x-------x\n" +
                                        "|   SELECT YOUR CHOICE TO WHICH YOU HAVE TO CONVERT     |\n" +
                                        "|   Binary To :-                                        |\n" +
                                        "|                                                       |\n" +
                                        "|  1. Octal Number                                      |\n" +
                                        "|  2. Decimal Number                                    |\n" +
                                        "|  3. Hexadecimal Number                                |\n" +
                                        "|  4. Main Menu                                         |\n" +
                                        "|                                                       |\n" +
                                        "x-------x-------x-------x-------x-------x-------x-------x\n" +
                                        "                    \"\"\""+reset);
                                System.out.println(green+"<<<--Select Your Choice-->>>"+reset);

                                select = sc.next();
                                if ((select.charAt(0) < '5' && select.charAt(0) > '0') && select.length() == 1) {
                                    try {
                                        switch (select.charAt(0)) {
                                            case '1' -> {
                                                int check2 = 0;
                                               loop : do {
                                                    System.out.println(green+"<<<--Enter Binary Number-->>>"+reset);
                                                    String binary = sc.next();
                                                    if (binary.charAt(0) == '-') {
                                                        System.out.println(red+"Binary number should be either '0' Or '1'...!!!"+reset);
                                                        System.out.println();
                                                    } else {
                                                        BinaryTo obj = new BinaryTo();
                                                        String OctNum = obj.binaryToOct(binary);
                                                        System.out.println("Binary Number is :- ");
                                                        System.out.println(binary);
                                                        System.out.println("Octal Number of " + binary + " is : ");
                                                        System.out.println(OctNum);


                                                        System.out.println();
                                                        String conti;

                                                        do {
                                                            System.out.println(green+"<<<<<<< Do you want to continue >>>>>>>\n" +reset+
                                                                    "  1. Yes  2. No  3.Main Menu  0. Exit");
                                                            conti = sc.next();
                                                            if ((conti.charAt(0) >= '0' && conti.charAt(0) <= '3') && conti.length() == 1) {
                                                                check2 = 1;
                                                                if (conti.charAt(0) == '2') {

                                                                    break loop;
                                                                } else if (conti.charAt(0) == '3') {

                                                                    break sub;
                                                                }
                                                                else if (conti.charAt(0) == '0') {

                                                                    break main;
                                                                }
                                                            } else {
                                                                System.out.println(red+"Please select correct option...!!!"+reset);
                                                                System.out.println();

                                                            }
                                                        } while (check2 == 0);
                                                    }
                                                }while(check2==1);
                                            }
                                            case '2' -> {
                                                int check2 = 0;
                                                loop : do {
                                                System.out.println(green+"<<<--Enter Binary Number-->>>"+reset);
                                                String binary = sc.next();
                                                if (binary.charAt(0) == '-') {
                                                    System.out.println(red+"Binary number should be either '0' Or '1'...!!!"+reset);
                                                } else {
                                                    BinaryTo obj = new BinaryTo();
                                                    int DeciNum = obj.binaryToDeci(binary);
                                                    System.out.println("Binary Number is : ");
                                                    System.out.println(binary);
                                                    System.out.println("Decimal Number of " + binary + " is : ");
                                                    System.out.println(DeciNum);

                                                    System.out.println();
                                                    String conti;

                                                    do {
                                                        System.out.println(green+"<<<<<<< Do you want to continue >>>>>>>\n" +reset+
                                                                "  1. Yes  2. No  3.Main Menu  0. Exit");
                                                        conti = sc.next();
                                                        if ((conti.charAt(0) >= '0' && conti.charAt(0) <= '3') && conti.length() == 1) {
                                                            check2 = 1;
                                                            if (conti.charAt(0) == '2') {

                                                                break loop;
                                                            } else if (conti.charAt(0) == '3') {

                                                                break sub;
                                                            }
                                                            else if (conti.charAt(0) == '0') {

                                                                break main;
                                                            }
                                                        } else {
                                                            System.out.println(red+"Please select correct option...!!!"+reset);
                                                            System.out.println();
                                                        }
                                                    } while (check2 == 0);
                                                }
                                                }while(check2==1);
                                            }
                                            case '3' -> {
                                                int check2 = 0;
                                                loop : do {
                                                System.out.println(green+"<<<--Enter Binary Number-->>>"+reset);
                                                String binary = sc.next();
                                                if (binary.charAt(0) == '-') {
                                                    System.out.println(red+"Binary number should be either '0' Or '1'...!!!"+reset);
                                                } else {
                                                    BinaryTo obj = new BinaryTo();
                                                    String OctNum = obj.binaryToHexaDeci(binary);
                                                    System.out.println("Binary Number is : ");
                                                    System.out.println(binary);
                                                    System.out.println("Hexadecimal Number of " + binary + "  is : ");
                                                    System.out.println(OctNum);

                                                    System.out.println();
                                                    String conti;

                                                    do {
                                                        System.out.println(green +"<<<<<<< Do you want to continue >>>>>>>\n" +reset+
                                                                "  1. Yes  2. No  3.Main Menu  0. Exit");
                                                        conti = sc.next();
                                                        if ((conti.charAt(0) >= '0' && conti.charAt(0) <= '3') && conti.length() == 1) {
                                                            check2 = 1;
                                                            if (conti.charAt(0) == '2') {

                                                                break loop;
                                                            } else if (conti.charAt(0) == '3') {

                                                                break sub;
                                                            }
                                                            else if (conti.charAt(0) == '0') {

                                                                break main;
                                                            }
                                                        } else {
                                                            System.out.println(red+"Please select correct option...!!!"+reset);
                                                            System.out.println();
                                                        }
                                                    } while (check2 == 0);
                                                }
                                            }while(check2==1);
                                            }
                                            case 4 -> {
                                                System.out.println();
                                                break sub;
                                            }
                                        }


                                    } catch (Exception e) {
                                        System.out.println(red+"Binary number should be either '0' Or '1'...!!!"+reset);
                                        System.out.println();
                                    }

                                } else {
                                    System.out.println(red +"Please select correct option from above....!!!"+reset);
                                    check = 1;
                                    System.out.println();
                                }


                            } while ((select.charAt(0) < '4' && select.charAt(0) > '0') || check == 1);

                        }
                        case '2' -> {
                            int check;
                            String select;
                            sub:
                            do {
                                check = 0;
                                System.out.println(cyan +"x-------x-------x-------x-------x-------x-------x-------x"+reset);
                                System.out.println(yellow+"|          NUMBER SYSTEM CONVERSION CALCULATOR          |"+reset);
                                System.out.println(cyan+"x-------x-------x-------x-------x-------x-------x-------x\n" +
                                        "|   SELECT YOUR CHOICE TO WHICH YOU HAVE TO CONVERT     |\n" +
                                        "|   Octal To :-                                         |\n" +
                                        "|                                                       |\n" +
                                        "|  1. Binary Number                                     |\n" +
                                        "|  2. Decimal Number                                    |\n" +
                                        "|  3. Hexadecimal Number                                |\n" +
                                        "|  4. Main Menu                                         |\n" +
                                        "|                                                       |\n" +
                                        "x-------x-------x-------x-------x-------x-------x-------x\n" +
                                        "                    \"\"\""+reset);
                                System.out.println(green+"<<<--Select Your Choice-->>>"+reset);
                                select = sc.next();
                                if ((select.charAt(0) < '5' && select.charAt(0) > '0') && select.length() == 1) {
                                    try {
                                        switch (select.charAt(0)) {
                                            case '1' -> {
                                                int check2 = 0;
                                                loop : do {
                                                System.out.println(green+"<<<--Enter Octal Number-->>>"+reset);
                                                String octNum = sc.next();
                                                int check4 = 0;
                                                for (int i = 0; i < octNum.length(); i++) {
                                                    int check3 = octNum.charAt(i);
                                                    if (check3 < 48 || check3 > 55) {
                                                        check4 = 1;
                                                        break;
                                                    }
                                                }
                                                if (check4 == 1) {
                                                    System.out.println(red+"Octal number contains only 0 to 7 range digits...!!!"+reset);
                                                    System.out.println();
                                                } else {
                                                    OcatalTo obj = new OcatalTo();
                                                    String binaryNum = obj.octToBinary(octNum);
                                                    System.out.println("Octal Number is : ");
                                                    System.out.println(octNum);
                                                    System.out.println("Binary Number of " + octNum + " is : ");
                                                    System.out.println(binaryNum);


                                                    System.out.println();
                                                    String conti;

                                                    do {
                                                        System.out.println(green+"<<<<<<< Do you want to continue >>>>>>>\n" +reset+
                                                                "  1. Yes  2. No  3.Main Menu  0. Exit");
                                                        conti = sc.next();
                                                        if ((conti.charAt(0) >= '0' && conti.charAt(0) <= '3') && conti.length() == 1) {
                                                            check2 = 1;
                                                            if (conti.charAt(0) == '2') {

                                                                break loop;
                                                            } else if (conti.charAt(0) == '3') {

                                                                break sub;
                                                            }
                                                            else if (conti.charAt(0) == '0') {

                                                                break main;
                                                            }
                                                        } else {
                                                            System.out.println(red+"Please select correct option...!!!"+reset);
                                                            System.out.println();
                                                        }
                                                    } while (check2 == 0);
                                                }
                                                }while(check2==1);
                                            }
                                            case '2' -> {
                                                int check2 = 0;
                                                loop : do {
                                                System.out.println(green+"<<<--Enter Octal Number-->>>"+reset);
                                                String octNum = sc.next();
                                                int check4 = 0;
                                                for (int i = 0; i < octNum.length(); i++) {
                                                    int check3 = octNum.charAt(i);
                                                    if (check3 < 48 || check3 > 55) {
                                                        check4 = 1;
                                                        break;
                                                    }
                                                }
                                                if (check4 == 1) {
                                                    System.out.println(red+"Octal number contains only 0 to 7 range digits...!!!"+reset);
                                                    System.out.println();
                                                } else {
                                                    OcatalTo obj = new OcatalTo();
                                                    int DeciNum = obj.octToDeci(octNum);
                                                    System.out.println("Octal Number is : ");
                                                    System.out.println(octNum);
                                                    System.out.println("Decimal Number of " + octNum + " is : ");
                                                    System.out.println(DeciNum);

                                                    System.out.println();
                                                    String conti;

                                                    do {
                                                        System.out.println(green+"<<<<<<< Do you want to continue >>>>>>>\n" +reset+
                                                                "  1. Yes  2. No  3.Main Menu  0. Exit");
                                                        conti = sc.next();
                                                        if ((conti.charAt(0) >= '0' && conti.charAt(0) <= '3') && conti.length() == 1) {
                                                            check2 = 1;
                                                            if (conti.charAt(0) == '2') {

                                                                break loop;
                                                            } else if (conti.charAt(0) == '3') {

                                                                break sub;
                                                            }
                                                            else if (conti.charAt(0) == '0') {

                                                                break main;
                                                            }
                                                        } else {
                                                            System.out.println(red+"Please select correct option...!!!"+reset);
                                                            System.out.println();
                                                        }
                                                    } while (check2 == 0);
                                                }
                                                }while(check2==1);
                                            }
                                            case '3' -> {
                                                int check2 = 0;
                                                loop : do {
                                                System.out.println(green+"<<<--Enter Octal Number-->>>"+reset);
                                                String octNum = sc.next();
                                                int check4 = 0;
                                                for (int i = 0; i < octNum.length(); i++) {
                                                    int check3 = octNum.charAt(i);
                                                    if (check3 < 48 || check3 > 55) {
                                                        check4 = 1;
                                                        break;
                                                    }
                                                }
                                                if (check4 == 1) {
                                                    System.out.println(red+"Octal number contains only 0 to 7 range digits...!!!"+reset);
                                                    System.out.println();
                                                } else {
                                                    OcatalTo obj = new OcatalTo();
                                                    String hexaNum = obj.octToHexa(octNum);
                                                    System.out.println("Octal Number is : ");
                                                    System.out.println(octNum);
                                                    System.out.println("Hexadecimal Number of " + octNum + "  is : ");
                                                    System.out.println(hexaNum);

                                                    System.out.println();
                                                    String conti;

                                                    do {
                                                        System.out.println(green+"<<<<<<< Do you want to continue >>>>>>>\n"+reset +
                                                                "  1. Yes  2. No  3.Main Menu  0. Exit");
                                                        conti = sc.next();
                                                        if ((conti.charAt(0) >= '0' && conti.charAt(0) <= '3') && conti.length() == 1) {
                                                            check2 = 1;
                                                            if (conti.charAt(0) == '2') {

                                                                break loop;
                                                            } else if (conti.charAt(0) == '3') {

                                                                break sub;
                                                            }
                                                            else if (conti.charAt(0) == '0') {

                                                                break main;
                                                            }
                                                        } else {
                                                            System.out.println(red+"Please select correct option...!!!"+reset);
                                                            System.out.println();
                                                        }
                                                    } while (check2 == 0);
                                                }
                                            }while(check2==1);
                                            }
                                            case '4' -> {
                                                System.out.println();
                                                break sub;
                                            }
                                        }


                                    } catch (Exception e) {
                                        System.out.println(red+"Octal number contains only 0 to 7 range digits...!!!"+reset);
                                        System.out.println();
                                    }

                                } else {
                                    System.out.println(red+"Please select correct option from above....!!!"+reset);
                                    check = 1;
                                    System.out.println();
                                }


                            } while ((select.charAt(0) < '4' && select.charAt(0) > '0') || check == 1);

                        }
                        case '3' -> {
                            int check;
                            String select;
                            sub:
                            do {
                                check = 0;
                                System.out.println(cyan +"x-------x-------x-------x-------x-------x-------x-------x"+reset);
                                System.out.println(yellow+"|          NUMBER SYSTEM CONVERSION CALCULATOR          |"+reset);
                                System.out.println(cyan+"x-------x-------x-------x-------x-------x-------x-------x\n" +
                                        "|   SELECT YOUR CHOICE TO WHICH YOU HAVE TO CONVERT     |\n" +
                                        "|   Decimal To :-                                       |\n" +
                                        "|                                                       |\n" +
                                        "|  1. Binary Number                                     |\n" +
                                        "|  2. Octal Number                                      |\n" +
                                        "|  3. Hexadecimal Number                                |\n" +
                                        "|  4. Main Menu                                         |\n" +
                                        "|                                                       |\n" +
                                        "x-------x-------x-------x-------x-------x-------x-------x\n" +
                                        "                    \"\"\""+reset);
                                System.out.println(green+"<<<--Select Your Choice-->>>"+reset);

                                select = sc.next();
                                if ((select.charAt(0) < '5' && select.charAt(0) > '0') && select.length() == 1) {
                                    try {
                                        switch (select.charAt(0)) {
                                            case '1' -> {
                                                int check2 = 0;
                                                loop : do {
                                                System.out.println(green+"<<<--Enter Decimal Number-->>>"+reset);
                                                String deciNum = sc.next();
                                                int check4 = 0;
                                                for (int i = 0; i < deciNum.length(); i++) {
                                                    int check3 = deciNum.charAt(i);
                                                    if (check3 < 48 || check3 > 57) {
                                                        check4 = 1;
                                                        break;
                                                    }
                                                }
                                                if (check4 == 1) {
                                                    System.out.println(red+"Decimal number contains only 0 and more numbers...!!!"+reset);
                                                    System.out.println();
                                                } else {
                                                    DecimalTo obj = new DecimalTo();
                                                    String binaryNum = obj.deciToBinary(deciNum);
                                                    System.out.println("Decimal Number is : ");
                                                    System.out.println(deciNum);
                                                    System.out.println("Binary Number of " + deciNum + " is : ");
                                                    System.out.println(binaryNum);
                                                    System.out.println();
                                                    String conti;

                                                    do {
                                                        System.out.println(green+"<<<<<<< Do you want to continue >>>>>>>\n"+reset +
                                                                "  1. Yes  2. No  3.Main Menu  0. Exit");
                                                        conti = sc.next();
                                                        if ((conti.charAt(0) >= '0' && conti.charAt(0) <= '3') && conti.length() == 1) {
                                                            check2 = 1;
                                                            if (conti.charAt(0) == '2') {

                                                                break loop;
                                                            } else if (conti.charAt(0) == '3') {

                                                                break sub;
                                                            }
                                                            else if (conti.charAt(0) == '0') {

                                                                break main;
                                                            }
                                                        } else {
                                                            System.out.println(red+"Please select correct option...!!!"+reset);
                                                            System.out.println();
                                                        }
                                                    } while (check2 == 0);
                                                }
                                                }while(check2==1);
                                            }
                                            case '2' -> {
                                                int check2 = 0;
                                                loop : do {
                                                System.out.println(green+"<<<--Enter Decimal Number-->>>"+reset);
                                                String deciNum = sc.next();
                                                int check4 = 0;
                                                for (int i = 0; i < deciNum.length(); i++) {
                                                    int check3 = deciNum.charAt(i);
                                                    if (check3 < 48 || check3 > 57) {
                                                        check4 = 1;
                                                        break;
                                                    }
                                                }
                                                if (check4 == 1) {
                                                    System.out.println(red+"Decimal number contains 0 and more numbers...!!!"+reset);
                                                    System.out.println();
                                                } else {
                                                    DecimalTo obj = new DecimalTo();
                                                    String octNum = obj.deciToOct(deciNum);
                                                    System.out.println("Decimal Number is : ");
                                                    System.out.println(deciNum);
                                                    System.out.println("Octal Number of " + deciNum + " is : ");
                                                    System.out.println(octNum);

                                                    System.out.println();
                                                    String conti;

                                                    do {
                                                        System.out.println(green+"<<<<<<< Do you want to continue >>>>>>>\n" +reset+
                                                                "  1. Yes  2. No  3.Main Menu  0. Exit");
                                                        conti = sc.next();
                                                        if ((conti.charAt(0) >= '0' && conti.charAt(0) <= '3') && conti.length() == 1) {
                                                            check2 = 1;
                                                            if (conti.charAt(0) == '2') {

                                                                break loop;
                                                            } else if (conti.charAt(0) == '3') {

                                                                break sub;
                                                            }
                                                            else if (conti.charAt(0) == '0') {

                                                                break main;
                                                            }
                                                        } else {
                                                            System.out.println(red+"Please select correct option...!!!"+reset);
                                                            System.out.println();
                                                        }
                                                    } while (check2 == 0);
                                                }
                                            }while(check2==1);
                                            }
                                            case '3' -> {
                                                int check2 = 0;
                                                loop : do {
                                                System.out.println(green+"<<<--Enter Decimal Number-->>>"+reset);
                                                String deciNum = sc.next();
                                                int check4 = 0;
                                                for (int i = 0; i < deciNum.length(); i++) {
                                                    int check3 = deciNum.charAt(i);
                                                    if (check3 < 48 || check3 > 57) {
                                                        check4 = 1;
                                                        break;
                                                    }
                                                }
                                                if (check4 == 1) {
                                                    System.out.println(red+"Decimal number contains 0 and more numbers...!!!"+reset);
                                                    System.out.println();
                                                } else {
                                                    DecimalTo obj = new DecimalTo();
                                                    String hexaNum = obj.deciToHexa(deciNum);
                                                    System.out.println("Decimal Number is : ");
                                                    System.out.println(deciNum);
                                                    System.out.println("Hexadecimal Number of " + deciNum + "  is : ");
                                                    System.out.println(hexaNum);

                                                    System.out.println();
                                                    String conti;

                                                    do {
                                                        System.out.println(green+"<<<<<<< Do you want to continue >>>>>>>\n"+reset +
                                                                "  1. Yes  2. No  3.Main Menu  0. Exit");
                                                        conti = sc.next();
                                                        if ((conti.charAt(0) >= '0' && conti.charAt(0) <= '3') && conti.length() == 1) {
                                                            check2 = 1;
                                                            if (conti.charAt(0) == '2') {

                                                                break loop;
                                                            } else if (conti.charAt(0) == '3') {

                                                                break sub;
                                                            }
                                                            else if (conti.charAt(0) == '0') {

                                                                break main;
                                                            }
                                                        } else {
                                                            System.out.println(red+"Please select correct option...!!!"+reset);
                                                            System.out.println();
                                                        }
                                                    } while (check2 == 0);
                                                }
                                            }while(check2==1);
                                            }
                                            case '4' -> {
                                                System.out.println();
                                                break sub;
                                            }
                                        }


                                    } catch (Exception e) {
                                        System.out.println(red+"Decimal number contains 0 and more numbers...!!!"+reset);
                                        System.out.println();
                                    }

                                } else {
                                    System.out.println(red+"Please select correct option from above....!!!"+reset);
                                    check = 1;
                                    System.out.println();
                                }


                            } while ((select.charAt(0) < '4' && select.charAt(0) > '0') || check == 1);

                        }
                        case '4' -> {
                            int check;
                            String select;
                            sub:
                            do {
                                check = 0;
                                System.out.println(cyan +"x-------x-------x-------x-------x-------x-------x-------x"+reset);
                                System.out.println(yellow+"|          NUMBER SYSTEM CONVERSION CALCULATOR          |"+reset);
                                System.out.println(cyan+"x-------x-------x-------x-------x-------x-------x-------x\n" +
                                        "|   SELECT YOUR CHOICE TO WHICH YOU HAVE TO CONVERT     |\n" +
                                        "|   Hexadecimal To :-                                   |\n" +
                                        "|                                                       |\n" +
                                        "|  1. Binary Number                                     |\n" +
                                        "|  2. Octal Number                                      |\n" +
                                        "|  3. Decimal Number                                    |\n" +
                                        "|  4. Main Menu                                         |\n" +
                                        "|                                                       |\n" +
                                        "x-------x-------x-------x-------x-------x-------x-------x\n" +
                                        "                    \"\"\""+reset);
                                System.out.println(green+"<<<--Select Your Choice-->>>"+reset);

                                select = sc.next();
                                if ((select.charAt(0) < '5' && select.charAt(0) > '0') && select.length() == 1) {
                                    try {
                                        switch (select.charAt(0)) {
                                            case '1' -> {
                                                int check2 = 0;
                                                loop : do {
                                                System.out.println(green+"<<<--Enter Hexadecimal Number-->>>"+reset);
                                                String hexaNum = sc.next();
                                                String newHexa = hexaNum.toUpperCase();
                                                int check4 = 0;
                                                for (int i = 0; i < newHexa.length(); i++) {
                                                    int check3 = newHexa.charAt(i);
                                                    if (!((check3 > 47 && check3 < 58) || (check3 > 64 && check3 < 71))) {
                                                        check4 = 1;
                                                        break;
                                                    }
                                                }
                                                if (check4 == 1) {
                                                    System.out.println(red+"It is not Hexadecimal Number...!!!"+reset);
                                                    System.out.println();
                                                } else {
                                                    HexaTo obj = new HexaTo();
                                                    String binaryNum = obj.hexaToBinary(newHexa);
                                                    System.out.println("Hexadecimal Number is : ");
                                                    System.out.println(newHexa);
                                                    System.out.println("Binary Number of " + newHexa + " is : ");
                                                    System.out.println(binaryNum);
                                                    System.out.println();
                                                    String conti;

                                                    do {
                                                        System.out.println(green+"<<<<<<< Do you want to continue >>>>>>>\n" +reset+
                                                                "  1. Yes  2. No  3.Main Menu  0. Exit");
                                                        conti = sc.next();
                                                        if ((conti.charAt(0) >= '0' && conti.charAt(0) <= '3') && conti.length() == 1) {
                                                            check2 = 1;
                                                            if (conti.charAt(0) == '2') {

                                                                break loop;
                                                            } else if (conti.charAt(0) == '3') {

                                                                break sub;
                                                            }
                                                            else if (conti.charAt(0) == '0') {

                                                                break main;
                                                            }
                                                        } else {
                                                            System.out.println(red+"Please select correct option...!!!"+reset);
                                                            System.out.println();
                                                        }
                                                    } while (check2 == 0);
                                                }
                                                }while(check2==1);
                                            }
                                            case '2' -> {
                                                int check2 = 0;
                                                loop : do {
                                                System.out.println(green+"<<<--Enter Hexadecimal Number-->>>"+reset);
                                                String hexaNum = sc.next();
                                                String newHexa = hexaNum.toUpperCase();
                                                int check4 = 0;
                                                for (int i = 0; i < newHexa.length(); i++) {
                                                    int check3 = newHexa.charAt(i);
                                                    if (!((check3 > 47 && check3 < 58) || (check3 > 64 && check3 < 71))) {
                                                        check4 = 1;
                                                        break;
                                                    }
                                                }
                                                if (check4 == 1) {
                                                    System.out.println(red+"It is not Hexadecimal Number...!!!"+reset);
                                                    System.out.println();
                                                } else {
                                                    HexaTo obj = new HexaTo();
                                                    String octNum = obj.hexaToOct(newHexa);
                                                    System.out.println("Hexadecimal Number is : ");
                                                    System.out.println(newHexa);
                                                    System.out.println("Octal Number of " + newHexa + " is : ");
                                                    System.out.println(octNum);
                                                    System.out.println();
                                                    String conti;

                                                    do {
                                                        System.out.println(green+"<<<<<<< Do you want to continue >>>>>>>\n"+reset +
                                                                "  1. Yes  2. No  3.Main Menu  0. Exit");
                                                        conti = sc.next();
                                                        if ((conti.charAt(0) >= '0' && conti.charAt(0) <= '3') && conti.length() == 1) {
                                                            check2 = 1;
                                                            if (conti.charAt(0) == '2') {

                                                                break loop;
                                                            } else if (conti.charAt(0) == '3') {

                                                                break sub;
                                                            }
                                                            else if (conti.charAt(0) == '0') {

                                                                break main;
                                                            }
                                                        } else {
                                                            System.out.println(red+"Please select correct option...!!!"+reset);
                                                            System.out.println();
                                                        }
                                                    } while (check2 == 0);
                                                }
                                            }while(check2==1);
                                            }
                                            case '3' -> {
                                                int check2 = 0;
                                                loop : do {
                                                System.out.println(green+"<<<--Enter Hexadecimal Number-->>>"+reset);
                                                String hexaNum = sc.next();
                                                String newHexa = hexaNum.toUpperCase();
                                                int check4 = 0;
                                                for (int i = 0; i < newHexa.length(); i++) {
                                                    int check3 = newHexa.charAt(i);
                                                    if (!((check3 > 47 && check3 < 58) || (check3 > 64 && check3 < 71))) {
                                                        check4 = 1;
                                                        break;
                                                    }
                                                }
                                                if (check4 == 1) {
                                                    System.out.println(red+"It is not Hexadecimal Number...!!!"+reset);
                                                    System.out.println();
                                                } else {
                                                    HexaTo obj = new HexaTo();
                                                    int deciNum = obj.hexaToDeci(newHexa);
                                                    System.out.println("Hexadecimal Number is : ");
                                                    System.out.println(newHexa);
                                                    System.out.println("Decimal Number of " + newHexa + " is : ");
                                                    System.out.println(deciNum);
                                                    System.out.println();
                                                    String conti;

                                                    do {
                                                        System.out.println(green+"<<<<<<< Do you want to continue >>>>>>>\n"+reset +
                                                                "  1. Yes  2. No  3.Main Menu  0. Exit");
                                                        conti = sc.next();
                                                        if ((conti.charAt(0) >= '0' && conti.charAt(0) <= '3') && conti.length() == 1) {
                                                            check2 = 1;
                                                            if (conti.charAt(0) == '2') {

                                                                break loop;
                                                            } else if (conti.charAt(0) == '3') {

                                                                break sub;
                                                            }
                                                            else if (conti.charAt(0) == '0') {

                                                                break main;
                                                            }
                                                        } else {
                                                            System.out.println(red+"Please select correct option...!!!"+reset);
                                                            System.out.println();
                                                        }
                                                    } while (check2 == 0);
                                                }
                                            }while(check2==1);
                                            }
                                            case '4' -> {
                                                System.out.println();
                                                break sub;
                                            }
                                        }


                                    } catch (Exception e) {
                                        System.out.println(red+"Enter correct hexadecimal value...!!!"+reset);
                                        System.out.println();
                                    }

                                } else {
                                    System.out.println(red+"Please select correct option from above....!!!"+reset);
                                    check = 1;
                                    System.out.println();
                                }


                            } while ((select.charAt(0) < '4' && select.charAt(0) > '0') || check == 1);

                        }
                        case '5' -> {
                            System.out.println(cyan+"<<<--Thank you for using our calculator-->>> "+reset);
                            break main;
                        }
                    }
                }else{
                    checkm=1;
                    System.out.println(red +"Enter correct option from above....!!!"+reset);
                    System.out.println();
                }


            }while((choice.charAt(0)>'0'&&choice.charAt(0)<'5')||checkm==1);

    }
}
