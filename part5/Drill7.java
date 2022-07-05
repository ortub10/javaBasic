package lesson5;

import java.util.Scanner;

public class Drill7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int [] arr = new int[15];
        int temp = arr.length-1;
        for (int  i = 0; i<arr.length&&num!=-1;i++){
            System.out.println("Enter number "+(1+i)+": ");
            num  = in.nextInt();
            if (num!=-1) arr[i] = num;
            else temp = i-1;
        }
        int count = 0;
        for (int i =0; i< temp; i++){
            if(arr[i]>arr[temp]) count++;
        }
        System.out.println("Bogger then the lest: "+count);
    }
}
