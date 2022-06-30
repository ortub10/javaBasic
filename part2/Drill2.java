package lesson2;

import java.util.Scanner;

public class Drill2 {
    public static void main(String[] args) {
        int number1, number2, number3;
        double average;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number 1: ");
        number1 = scanner.nextInt();
        System.out.println("Please enter number 2: ");
        number2 = scanner.nextInt();
        System.out.println("Please enter number 3: ");
        number3 = scanner.nextInt();

        average = (number1 + number2 + number3)/3.0;
        System.out.println("The average of 3 number is: "+average);
    }
}
