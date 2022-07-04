package lesson3;

import java.util.Scanner;

public class Drill8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        double result = 0;
        boolean flag = true;

        System.out.println("Please Enter action");
        String action = scanner.next();
         switch (action){
             case "+":
                 result = num1+num2;
                 break;
             case "-":
                 result = num1-num2;
                 break;
             case "*":
                 result = num1*num2;
                 break;
             case "/":
                 if(num2 == 0){
                     System.out.println("Can't divide by zero");
                     flag = false;
                 }
                 else
                     result = (double)num1/num2;
                 break;
             default:
                 System.out.println("Not a valid action");
                 flag = false;

         }
         if (flag)
             System.out.println("The result is: "+result);
    }
}
