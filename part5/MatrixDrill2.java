package lesson5;

import java.util.Scanner;

public class MatrixDrill2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] mat = new int[3][5];
        for (int row = 0; row<mat.length; row++){
            for (int col = 0; col<mat[row].length; col++){
                System.out.println("Enter value for row "+(row+1)+ " and col "+(col+1));
                mat[row][col] = scanner.nextInt();
            }
        }
        int[] sumOfRows = new int[mat.length];
        int sum;
        for (int row = 0; row<mat.length; row++){
            sum = 0;
            for (int col = 0; col<mat[row].length; col++){
                sum+=mat[row][col];
            }
            sumOfRows[row] = sum;
        }
        boolean flag = false;
        for (int i = 0; i<sumOfRows.length && !flag;i++){
            for (int j = i+1; j<sumOfRows.length && !flag; j++){
                if (sumOfRows[i]==sumOfRows[j])
                    flag = true;
            }
        }
        if (flag)
            System.out.println("There are 2 row with same sum");
        else
            System.out.println("There are not 2 row with same sum");
    }
}
