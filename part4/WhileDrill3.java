package lesson4;

import java.util.Scanner;

public class WhileDrill3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number ");
        int number = scanner.nextInt();
        int numOfDigit = 0;
        while (number!=0){
            numOfDigit++;
            number/=10;
        }

        System.out.println("Number of digit is "+numOfDigit);
    }
}
