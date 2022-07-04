package lesson3;

import java.util.Scanner;

public class Drill12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day, month, year;
        System.out.println("Enter day");
        day = scanner.nextInt();
        System.out.println("Enter number month");
        month = scanner.nextInt();
        System.out.println("Enter year");
        year = scanner.nextInt();
        boolean flag = true;
        int dayOfMonth;

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayOfMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayOfMonth = 30;
                break;
            case 2:
                if (year%400==0 || (year%4==0 && year%100!=0))
                    dayOfMonth = 29;
                else
                    dayOfMonth = 28;
                break;
            default:
                dayOfMonth = 0;
                flag = false;
        }
        if (day>dayOfMonth)
            flag = false;
        if(day == dayOfMonth) {
            day = 1;
            month = month +1;
        }
        else
            day++;

        if (month ==13) {
            month = 1;
            year++;
        }

        if (flag)
            System.out.println("THe date tomorrow is "+day+"/"+month+"/"+year);
        else
            System.out.println("You gave Invalid date");
    }
}
