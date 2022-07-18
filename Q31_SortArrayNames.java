import java.util.*;
public class Q31_SortArrayNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total number of Names are : ");
        int n = sc.nextInt();
        String [] arr = new String [n];
        sc.nextLine();
        if(n>0) {
            System.out.println("Enter Names : ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLine();
            }
            for (int i = 0; i < n - 1; i++) {
                for (int z = i + 1; z < n; z++) {
                    String firstName = arr[i];
                    String secondName = arr[z];
                    if (firstName.length() >= secondName.length()) {
                        if (firstName.charAt(0) > secondName.charAt(0)) {
                            arr[i] = secondName;
                            arr[z] = firstName;
                        } else if (firstName.charAt(0) == secondName.charAt(0)) {
                            for (int k = 0; k < secondName.length(); k++) {
                                if (firstName.charAt(k) < secondName.charAt(k)) {
                                    arr[i] = firstName;
                                    arr[z] = secondName;
                                    break;
                                } else if (firstName.charAt(k) > secondName.charAt(k)) {
                                    arr[i] = secondName;
                                    arr[z] = firstName;
                                    break;
                                } else if (firstName.charAt(k) == secondName.charAt(k)) {
                                    arr[z] = firstName;
                                    arr[i] = secondName;
                                }
                            }
                        }

                    } else {
                        if (firstName.charAt(0) > secondName.charAt(0)) {
                            arr[i] = secondName;
                            arr[z] = firstName;
                        } else if (firstName.charAt(0) == secondName.charAt(0)) {
                            for (int k = 0; k < firstName.length(); k++) {
                                if (firstName.charAt(k) < secondName.charAt(k)) {
                                    arr[i] = firstName;
                                    arr[z] = secondName;
                                    break;
                                } else if (firstName.charAt(k) > secondName.charAt(k)) {
                                    arr[i] = secondName;
                                    arr[z] = firstName;
                                    break;
                                } else if (firstName.charAt(k) == secondName.charAt(k)) {
                                    arr[z] = secondName;
                                    arr[i] = firstName;
                                }
                            }
                        }


                    }
                }
            }
            System.out.println("Sorted array Names are : ");
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }
        }else{
            System.out.println("Size of array should be minimum 1....");
        }
        }

    }

