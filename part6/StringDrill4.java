package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class StringDrill4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string with ,:");
        String str = scanner.nextLine();
        String[] words = str.split(",");
        System.out.println(Arrays.toString(words));
    }
}
