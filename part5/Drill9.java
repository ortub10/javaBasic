package lesson5;

import java.util.Scanner;

public class Drill9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = new int[10];
        for (int i =0; i<arr.length; i++) {
            System.out.println("Enter number " + (1 + i) + ": ");
            arr[i] = in.nextInt();
        }
        boolean flag = true;
        for (int i =0; i<arr.length&&flag; i++){
            int count = 1;
            for (int j =i+1; j<arr.length; j++){
                if(arr[i]==arr[j]) count++;
            }
            if(count>=2){
                flag = false;
                System.out.println("There are two number same ");
            }

        }
        if (flag)
            System.out.println("it is different");
    }
}
