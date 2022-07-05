package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class Drill2 {
    public static int[] allNum(int x,int y){
        int size;
        if(x>y){
         int temp = x;
         x=y;
         y=temp;
        }
            size =y-x;
        int []temp = new int[size];
        for (int i = 0; i<temp.length; i++){
             temp[i] = x++;
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 =  in.nextInt();
        System.out.println("Enter number 2:");
        int num2 =  in.nextInt();
        int []all = allNum(num1,num2);
        System.out.println("The num are: "+ Arrays.toString(all));
    }
}
