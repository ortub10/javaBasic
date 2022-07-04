package lesson4;

import java.util.Scanner;

public class NestedForDrill3 {
    public static void main(String[] args) {
        int numOfPrime = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i<10; i++){
            System.out.println("Enter number "+(1+i)+": ");
            int num = sc.nextInt();
            boolean flag = true;
            for (int j = 2; j < num && flag; j++){
               if(num%j==0) flag = false;
            }
            if(flag) numOfPrime++;
        }
        System.out.println("num Of primes = "+numOfPrime);
    }
}
