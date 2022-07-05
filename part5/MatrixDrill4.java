package lesson5;

import java.util.Scanner;

public class MatrixDrill4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size = scanner.nextInt();
        int [][]mat = new int[size][size];
        for (int row = 0; row<mat.length; row++){
            for (int col = 0; col<mat[row].length; col++){
                System.out.println("Enter value for row "+(row+1)+ " and col "+(col+1));
                mat[row][col] = scanner.nextInt();
            }
        }
        for (int row = 0; row<mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                System.out.print(mat[row][col]+"\t");
            }
            System.out.println();
        }

        boolean flag = true;
		//Checks if the diagonals are equal
        for (int i = 0; i<mat.length&&flag; i++){
        
            if (mat[i][i] != mat[i][mat.length-1-i])
                flag = false;
        }

        if (flag)
            System.out.println("They are equals");
        else
            System.out.println("They are not equals");

    }
}
