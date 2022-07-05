package lesson6;

import java.util.Scanner;

public class StringDrill1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string 1");
        String str1 =scanner.next();
        System.out.println("Enter string 2");
        String str2 =scanner.next();
        System.out.println("Enter string 3");
        String str3 =scanner.next();
        if (str1.compareTo(str2) <0 && str1.compareTo(str3) <0){
            if (str2.compareTo(str3)<0)
                System.out.println(str1+","+str2+","+str3);
            else
                System.out.println(str1+","+str3+","+str2);
        }
        else if (str2.compareTo(str1) <0 && str2.compareTo(str3) <0){
            if (str1.compareTo(str3)<0)
                System.out.println(str2+","+str1+","+str3);
            else
                System.out.println(str2+","+str3+","+str1);
        }
        else {
            if (str1.compareTo(str2) < 0)
                System.out.println(str3 + "," + str1 + "," + str2);
            else
                System.out.println(str3 + "," + str2 + "," + str1);
        }
    }
}
