package lesson6;

import java.util.Scanner;

public class StringDrill2 {
    public static void main(String[] args) {
        String[] strs = new String[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<strs.length; i++){
            System.out.println("Enter string "+ (i+1));
            strs[i] = scanner.next();
        }

        for (String str: strs){
            boolean flag = true;
            for (int i = 0; i<str.length()/2 && flag; i++){
                if (str.charAt(i) != str.charAt(str.length()-1-i))
                    flag = false;
            }
            if (flag)
                System.out.println(str);
        }
    }
}
