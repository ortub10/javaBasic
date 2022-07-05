package lesson6;

import java.util.Scanner;

public class StringDrill3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter math exercise");
        String str = scanner.next();
        if (isValid(str))
            System.out.println("It valid");
        else
            System.out.println("It not valid");
    }

    public static boolean isValid(String str){
        String [] parentheses = new String[str.length()];
        int count = 0;
        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i) == ')'|| str.charAt(i) == ']'|| str.charAt(i) == '}') {
                if (parentheses[0] == null)
                    return false;
                else if (parentheses[count-1].equals("(") && (str.charAt(i) == ']' || str.charAt(i) == '}'))
                    return false;
                else if (parentheses[count-1].equals("[") && (str.charAt(i) == ')' || str.charAt(i) == '}'))
                    return false;
                else if (parentheses[count-1].equals("{") && (str.charAt(i) == ')' || str.charAt(i) == ']'))
                    return false;
                else
                    parentheses[--count] = null;
            }
            else if (str.charAt(i) == '('|| str.charAt(i) == '['|| str.charAt(i) == '{')
                parentheses[count++] = str.charAt(i)+"";
        }
        if (parentheses[0]!=null)
            return false;
        return true;
    }
}
