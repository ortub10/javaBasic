package lesson5;

import java.util.Scanner;

public class Drill2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter "+5+" number");
        int [] arr = new int[5];
        for (int i = 0;i <arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        for (int num: arr){
            if (num>max)
                max = num;
        }
        System.out.println("The max value is "+max);
    }
}
