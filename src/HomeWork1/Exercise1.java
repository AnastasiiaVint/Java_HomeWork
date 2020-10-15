package HomeWork1;

import java.util.Scanner;

// ex1 - Приветствовать любого пользователя при вводе его имени через командную строку.

public class Exercise1 {
    public static void main(String[] args) {

        System.out.println("Please enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
