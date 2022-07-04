package lesson4;

import java.util.Scanner;

public class WhilleDrill6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit");
        int limit = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        while (num2<limit){
            System.out.print(num1+" ");
            int temp = num2;
            num2+=num1;
            num1 = temp;
        }
        System.out.print(num1);
    }
}
