package lesson3;

import java.util.Scanner;

public class Drill4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 ribs of a triangle: ");
        int rib1 = scanner.nextInt();
        int rib2 = scanner.nextInt();
        int rib3 = scanner.nextInt();

        if (rib1 == rib2 && rib2 == rib3)
            System.out.println("The triangle is equilateral");
        else if (rib1 == rib2 || rib2 == rib3)
            System.out.println("The triangle is An isosceles");
        else
            System.out.println("The triangle is regular triangle");
    }
}
