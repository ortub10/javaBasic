package lesson3;

import java.util.Scanner;

public class Drill2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number 1:");
        int num1 = scanner.nextInt();
        System.out.println("Please enter number 2:");
        int num2 = scanner.nextInt();
        if (num1 > num2)
            System.out.println("Sum: "+(num1+num2));
        else
            System.out.println("Duplicate: "+(num1*num2));
    }
}
