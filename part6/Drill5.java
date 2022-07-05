package lesson6;

import java.util.Scanner;

public class Drill5 {

    public static int[][] buildMatrix(int row, int col){
        Scanner in = new Scanner(System.in);
        int[][] matrix = new int[row][col];
        for (int i =0 ;i<row; i++){
            for (int j =0; j<col; j++){
                System.out.println("Enter number for ["+(i+1)+","+(j+1)+"]: ");
                matrix[i][j]=  in.nextInt();
            }
        }
        return matrix;
    }

    public static int[][] duplicate(int[][]A,int[][]B){
        int[][]C = new int[A.length][B[0].length];
        int sum;
        for (int row = 0; row<C.length; row++) {
            for (int col = 0; col < C[row].length; col++) {
                sum=  0;
                for (int temp = 0; temp < C.length; temp++){
                    sum+= A[row][temp] * B[temp][col];
                }
                C[row][col] = sum;

            }
        }
        return C;
    }
    public static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter for A");
        int[][] matA = buildMatrix(3,3);
        System.out.println("Enter for B");
        int[][] matB = buildMatrix(3,3);
        int[][] matC = duplicate(matA,matB);

        printMatrix(matA);
        System.out.println("---------------------");
        printMatrix(matB);
        System.out.println("---------------------");
        printMatrix(matC);


    }
}
