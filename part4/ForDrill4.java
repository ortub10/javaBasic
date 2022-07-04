package lesson4;

import java.util.Scanner;

public class ForDrill4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start number");
        int start = scanner.nextInt();
        System.out.println("Enter end number");
        int end = scanner.nextInt();

        for(int i = start; i<=end; i++){
            System.out.print(i+" ");
        }
    }
}
