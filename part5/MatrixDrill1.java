package lesson5;

import java.util.Scanner;

public class MatrixDrill1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] mat = new int[2][2];
        int sum = 0;
        for (int row = 0; row<mat.length; row++){
            for (int col = 0; col<mat[row].length; col++){
                System.out.println("Enter value for row "+(row+1)+ " and col "+(col+1));
                sum+=mat[row][col] = scanner.nextInt();
            }
        }
        System.out.println("The sum of all values is "+sum);
    }
}
