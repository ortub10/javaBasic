package lesson3;

import java.util.Scanner;

public class Drill6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 ribs of a triangle: ");
        int rib1 = scanner.nextInt();
        int rib2 = scanner.nextInt();
        int rib3 = scanner.nextInt();

        int squareRib1 = rib1*rib1;
        int squareRib2 = rib2*rib2;
        int squareRib3 = rib3*rib3;

        if (squareRib1+squareRib2 == squareRib3 ||squareRib1+squareRib3 == squareRib2 || squareRib3+squareRib2 == squareRib1)
            System.out.println("The triangle is right angle");
        else
            System.out.println("The triangle is not right angle");
    }
}
