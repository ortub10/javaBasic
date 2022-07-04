package lesson3;

import java.util.Scanner;

public class Drill5 {
    public static void main(String[] args) {
        final int BASIC = 50;
        final int REGULAR = 8;
        final double BONUS = 1.5;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number hours: ");
        int hours =  in.nextInt();
        double money;
        if (hours <= REGULAR ){
            money  = hours*BASIC;
        }
        else {
            int MoreHours = hours-REGULAR;
            double MoreMoney = (BASIC*BONUS)*MoreHours;
            money = MoreMoney+(REGULAR*BASIC);
        }
        System.out.println("your money is : "+money);
     }
}
