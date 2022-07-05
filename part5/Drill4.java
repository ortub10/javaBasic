package lesson5;

import java.util.Scanner;

public class Drill4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] A = new int[5];
        int [] B = new int[5];
        System.out.println("Enter values for array A ");
        for (int i = 0; i<A.length; i++){
            A[i] = scanner.nextInt();
        }
        System.out.println("Enter values for array B ");
        for (int i = 0; i<B.length; i++){
            B[i] = scanner.nextInt();
        }

        boolean flag = true;
        for (int i = 0; i<B.length && flag; i++){
            if (A[i]!=B[i])
                flag = false;
        }
        if (flag)
            System.out.println("The arrays are equals");
        else
            System.out.println("The arrays are not equals");
    }
}
