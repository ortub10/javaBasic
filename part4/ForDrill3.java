package lesson4;

import java.util.Scanner;

public class ForDrill3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<5; i++){
            System.out.println("Please enter name");
            String name = scanner.nextLine();
            System.out.println(name + "\t"+(i+1));
        }
    }
}
