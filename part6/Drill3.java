package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class Drill3 {
    public static void mod(int[]arr,int value){
        for (int i = 0; i<arr.length; i++) {
            arr[i] *= value;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number :");
        int number = in.nextInt();
        int [] arr  = new int [4];
        for (int i =0 ;i<arr.length; i++){
            System.out.println("Enter number "+(i+1)+": ");
            arr[i] = in.nextInt();
        }
        mod(arr,number);
        System.out.println("The update is: "+ Arrays.toString(arr));
    }
}
