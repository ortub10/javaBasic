package lesson4;

import java.util.Scanner;

public class WhileDrill5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number ");
        int number = scanner.nextInt();
        int reverse = 0;
        while (number != 0){
            reverse= reverse*10+number%10;
            number/=10;
        }
        System.out.println("The reverse number is "+reverse);
    }
}
