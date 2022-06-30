package lesson2;

import java.util.Scanner;

public class Drill6 {
    public static void main(String[] args) {
        int number, huns, tens, digits;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter A 3 digits number");
        number = scanner.nextInt();
        huns = number/100;
        tens = number/10%10;
        digits = number%10;

        System.out.println("The reverse number is: "+digits + tens + huns);

    }
}
