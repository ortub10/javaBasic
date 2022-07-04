package lesson4;

import java.util.Scanner;

public class WhileDrill2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int iteration = 0;
        int sum = 0;
        int number;
        do {
            System.out.println("Enter number: ");
            number = scanner.nextInt();
            sum+=number;
            iteration++;
        }
        while (iteration < 10 && number!=7);



        System.out.println("The sum of all numbers is "+sum);
    }
}
