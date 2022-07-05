package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Drill5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size = scanner.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i<arr.length;i++){
            System.out.println("enter number "+(i+1));
            arr[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        int temp = arr[arr.length-1];
        for (int i = arr.length-1; i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
