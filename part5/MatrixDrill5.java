package lesson5;

import java.util.Scanner;

public class MatrixDrill5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matA = new int[3][3];
        System.out.println("Enter for matA");
        for (int row = 0; row<matA.length; row++){
            for (int col = 0; col<matA[row].length; col++){
                System.out.println("Enter value for row "+(row+1)+ " and col "+(col+1));
                matA[row][col] = scanner.nextInt();
            }
        }
        int[][] matB = new int[3][3];
        System.out.println("Enter for matB");
        for (int row = 0; row<matB.length; row++){
            for (int col = 0; col<matB[row].length; col++){
                System.out.println("Enter value for row "+(row+1)+ " and col "+(col+1));
                matB[row][col] = scanner.nextInt();
            }
        }

        int[][] matC = new int[3][3];

        for (int row = 0; row<matC.length; row++) {
            for (int col = 0; col < matC[row].length; col++) {
                for (int temp = 0; temp < matC.length; temp++){
                    matC[row][col]+= matA[row][temp] * matB[temp][col];
                }

            }

        }
        System.out.println("----------------------------");
        for (int[]row :matA) {
            for (int col: row) {
                System.out.print(col+"\t");
            }
            System.out.println();
        }
        System.out.println("----------------------------");
        for (int[]row :matB) {
            for (int col: row) {
                System.out.print(col+"\t");
            }
            System.out.println();
        }
        System.out.println("----------------------------");
        for (int[]row :matC) {
            for (int col: row) {
                System.out.print(col+"\t");
            }
            System.out.println();
        }
    }
}
