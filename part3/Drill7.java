package lesson3;

import java.util.Scanner;

public class Drill7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scanner.nextInt();
        if (number/100 == 0)
            System.out.println("The number is two digit number");
        else if (number/1000 == 0)
            System.out.println("The number is Triple digits");
        else
            System.out.println("Another number");


    }
}
