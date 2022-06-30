package lesson2;

import java.util.Scanner;

public class Drill5 {
    public static void main(String[] args) {
        int allMinutes, hours, minutes;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter time only in minutes:");
        allMinutes = scanner.nextInt();
        hours = allMinutes/60;
        minutes = allMinutes%60;
        System.out.println("The time is "+hours+" hours and "+ minutes+" minutes");
    }
}
