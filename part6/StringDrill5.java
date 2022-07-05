package lesson6;

import java.util.Scanner;

public class StringDrill5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter email: ");
        String email = scanner.next();
        System.out.println("Please enter password: ");
        String password = scanner.next();
        System.out.println("Please confirm password: ");
        String passwordConfirm = scanner.next();

        if (!isValidEmail(email))
            System.out.println("your email wrong");
        else if (!isValidPassword(password))
            System.out.println("password mast be length bigger then 8 and include at least one big letter and ont digit");
        else if (!password.equals(passwordConfirm))
            System.out.println("password confirm wrong");
        else
            System.out.println("Your request approved ");




    }
    public static boolean isValidPassword(String password){
        return password.length()>8 && password.matches("(.*)[A-Z](.*)") && password.matches("(.*)[0-9](.*)");
    }
	
    public static boolean isValidEmail(String email){
        return email.indexOf('@') != -1 && email.indexOf('.') != -1
                &&email.indexOf('@') != 0 && email.indexOf('.') != 0
                &&email.indexOf('.')>email.indexOf('@');
    }
}
