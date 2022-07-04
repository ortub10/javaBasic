package lesson4;

import java.util.Scanner;

public class NestedForDrill1 {
    public static void main(String[] args) {
        final int NUMBER_OF_STUDENTS = 5;
        final int NUMBER_OF_GRADES = 3;
        Scanner scanner = new Scanner(System.in);
        int sumOfGradesStudents ;
        int grade;
        for (int i = 0; i<NUMBER_OF_STUDENTS; i++){
            System.out.println("Enter "+NUMBER_OF_GRADES+ " grades of student "+(i+1));
           sumOfGradesStudents = 0;
            for (int j = 0; j<NUMBER_OF_GRADES; j++){
                System.out.println("Enter grade "+(j+1));
                grade = scanner.nextInt();
                sumOfGradesStudents+=grade;
            }
            double average = (double)sumOfGradesStudents/NUMBER_OF_GRADES;
            System.out.println("The average of student "+(i+1)+ " is "+average);
        }
    }
}
