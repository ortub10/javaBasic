package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Drill3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[20];
        for (int i= 0; i<arr.length;i++){
            System.out.println("Enter number "+(i+1));
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter number to compare ");
        int number = scanner.nextInt();
        int count = 0;
        for (int num: arr){
            if (num == number)
                count++;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(number+" in array "+count+" times");
    }
}
