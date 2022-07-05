package lesson5;

import java.util.Scanner;

public class Drill1 {
    public static void main(String[] args) {
       final int SIZE = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter "+SIZE+" number");
        int [] arr = new int[10];
        for (int i = 0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        for (int i = arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }

    }
}
