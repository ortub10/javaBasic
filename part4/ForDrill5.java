package lesson4;

import java.util.Scanner;

public class ForDrill5 {
    public static void main(String[] args) {
        final int NUMBERS = 5;
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;
        for (int i = 0; i<NUMBERS; i++){
            System.out.println("Please enter number "+(i+1));
            number = scanner.nextInt();
            sum+=number;
        }

        double average = (double)sum/NUMBERS;
        System.out.println("The average of "+ NUMBERS+" numbers is "+average);
    }
}
