// ex4 - Ввести пароль из командной строки и сравнить его со строкой образцом.

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        String password = "as1as2";
        System.out.println("Please enter your password");
        Scanner scanner = new Scanner(System.in);
        String newPassword = scanner.nextLine();

        if (newPassword.equals(password)) {
            System.out.println("Your password is correct");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
