package lesson6;

import java.util.Scanner;

public class Drill1 {
    public  static double average (int a,int b, int c){
        return  (a+b+c)/(double)3;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 =  in.nextInt();
        System.out.println("Enter number 2:");
        int num2 =  in.nextInt();
        System.out.println("Enter number 3:");
        int num3 =  in.nextInt();
        double ave = average(num1,num2,num3);
        System.out.println("The average is: "+ave);
    }
}
