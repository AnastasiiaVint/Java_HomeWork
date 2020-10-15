package HomeWork1;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.Scanner;

public class Exercise6_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        String[] split = number.split("");
        if (split.length != 4) {
            System.out.println("Wrong number");
        } else {
            if (Integer.parseInt(split[0]) + Integer.parseInt(split[1]) == Integer.parseInt(split[2]) + Integer.parseInt(split[3])) {
                System.out.println("Lucky number");
            } else {
                System.out.println("Usual number. Try again");
            }
        }



    }
}
