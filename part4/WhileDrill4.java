package lesson4;

import java.util.Scanner;

public class WhileDrill4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number ");
        int number = scanner.nextInt();
        int sumOfDigit = 0;
        while (number!=0){
            sumOfDigit+=number%10;
            number/=10;
        }

        System.out.println("Number of digit is "+sumOfDigit);
    }
}
