package lesson6;

import java.util.Scanner;

public class Drill4 {
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
    public static double[] averages(int[][] matrix){
        double []arr = new double[matrix.length];
        for (int i =0; i<matrix.length; i++){
           arr[i]  = saySum(matrix[i]);
        }
        return arr;
    }
    public static double saySum(int []arr){
        int sum=0;
        for (int i =0; i<arr.length; i++){
            sum+=arr[i];
        }

        return (double) sum/arr.length;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter row :");
        int row =  in.nextInt();
        System.out.println("Enter col:");
        int col =  in.nextInt();
        int [][]mat = buildMatrix(row,col);
        double[] ave = averages(mat);
        for (int i = 0; i<ave.length; i++){
            System.out.println("The average of row "+(i+1)+" is: "+ave[i]);
        }
    }
}
