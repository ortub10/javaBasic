package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Drill8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] A = new int[5];
        int [] B = new int[5];
        String operator;
        for (int i =0; i<A.length; i++){
            System.out.println("Enter number "+(1+i)+" for A: ");
            A[i] = in.nextInt();
        }
        for (int i =0; i<B.length; i++){
            System.out.println("Enter number "+(1+i)+" for B: ");
            B[i] = in.nextInt();
        }

        System.out.println("Enter action: ");
        operator = in.next();
        int [] C = new int[A.length];
        for (int i =0; i<C.length; i++){
        switch (operator){
            case "+":
                 C[i] = A[i]+B[i];
                break;
            case "-":
                    C[i] = A[i]-B[i];
                break;
            case "*":
                    C[i] = A[i]*B[i];
                break;
            case "/":
                    if(B[i]!=0)
                        C[i] = A[i]/B[i];
                    break;
                }

        }
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
        System.out.println(Arrays.toString(C));
    }
}
