package lesson2;

import java.util.Scanner;

public class Drill3 {
    public static void main(String[] args) {
        final double PI = Math.PI;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        double S = PI*(radius*radius);
        double p = (2*PI)*radius;
        System.out.println("setahc = "+S+", hekef = "+p);
    }
}
