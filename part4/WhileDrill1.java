package lesson4;

import java.util.Scanner;

public class WhileDrill1 {
    public static void main(String[] args) {
        final int NUMBER_TO_GUSS = 6;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your guss");
        int number = scanner.nextInt();
        while (number!=NUMBER_TO_GUSS){
            System.out.println("Wrong, try again");
            number = scanner.nextInt();
        }
        System.out.println("You won!!");
    }
}
