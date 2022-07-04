package lesson3;

import java.util.Scanner;

public class Drill10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your rank");
        int rank = scanner.nextInt();
        System.out.println("Please enter your number hours working");
        int hours = scanner.nextInt();
        int salary;
        switch (rank){
            case 1:
                salary = hours*30;
                break;
            case 2:
                salary = hours*40;
                break;
            case 3:
                salary = hours*60;
                break;
            default:
                salary = hours*20;
        }
        System.out.println("your salary is "+ salary);
    }
}
