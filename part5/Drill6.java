package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Drill6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []A = new int[5];
        int []B = new int[5];
        System.out.println("Enter values for array A ");
        for (int i = 0; i<A.length; i++){
            A[i] = scanner.nextInt();
        }
        System.out.println("Enter values for array B ");
        for (int i = 0; i<B.length; i++){
            B[i] = scanner.nextInt();
        }
      for (int i =0; i<A.length;i++){
          int temp = A[i];
          A[i] = B[A.length-1-i];
          B[A.length-1-i] = temp;
      }

        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
}
}
