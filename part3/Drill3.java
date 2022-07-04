package lesson3;

import java.util.Scanner;

public class Drill3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 4 ribs of a square: ");
        int rib1 = scanner.nextInt();
        int rib2 = scanner.nextInt();
        int rib3 = scanner.nextInt();
        int rib4 = scanner.nextInt();

        if (rib1 == rib2 && rib2 == rib3 && rib3 == rib4)
            System.out.println("The square is rhombus");
    }
}
