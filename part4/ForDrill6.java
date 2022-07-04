package lesson4;

import java.util.Scanner;

public class ForDrill6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int N = input.nextInt();
        int numberOfDivisors =  0;
        for (int i = 1; i<=N; i++){
            if(N%i==0) {
                numberOfDivisors++;
                System.out.print(i+" ");
            }
        }
        System.out.println("Number of divisors: "+numberOfDivisors);
    }
}
