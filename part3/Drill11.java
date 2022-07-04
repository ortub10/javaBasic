package lesson3;

import java.util.Scanner;

public class Drill11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter money in month: ");
        double month = in.nextDouble();
        System.out.println("Enter number month: ");
        int num  = in.nextInt();
        boolean flag =true;
        double salaryDay = 0;
        switch (num){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                salaryDay = month/31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                salaryDay = month/30;
                break;
            case 2:
                salaryDay = month/28;
                break;
            default:
                flag = false;
                System.out.println("not correct month");
        }
        if(flag) {
            System.out.println("the money in day is: " + salaryDay);
        }
    }
}
