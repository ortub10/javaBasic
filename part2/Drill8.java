package lesson2;

import java.util.Scanner;

public class Drill8 {
    public static void main(String[] args) {
        int number, bit1,bit2, bit3, bit4;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number between 0-15:");
        number = scanner.nextInt();
        bit4 = number%2;
        number/=2;
        bit3 = number%2;
        number/=2;
        bit2 = number%2;
        number/=2;
        bit1 = number%2;

        System.out.println("The binary number is: "+bit1+bit2+bit3+bit4);

    }
}
