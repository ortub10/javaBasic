package lesson3;

import java.util.Scanner;

public class Drill1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scanner.next();
        System.out.println("Please enter your grade:");
        int grade = scanner.nextInt();
        if (grade>54)
            System.out.println(name + " you passed!");
    }
}
