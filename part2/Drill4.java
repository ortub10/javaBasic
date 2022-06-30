package lesson2;

import java.util.Scanner;

public class Drill4 {
    public static void main(String[] args) {
        int age, ageDays, ageHours, ageSeconds;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your age: ");
        age = scanner.nextInt();
        ageDays = age * 365;
        ageHours = ageDays * 24;
        ageSeconds = ageHours * 60 * 60;

        System.out.println("The age in days is "+ageDays);
        System.out.println("The age in hours is "+ageHours);
        System.out.println("The age in seconds is "+ageSeconds);
    }
}
