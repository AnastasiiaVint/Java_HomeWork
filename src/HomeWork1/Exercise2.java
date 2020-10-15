package HomeWork1;// ex2 - Отобразить в окне консоли аргументы командной строки в обратном порядке.

import java.util.Arrays;

public class Exercise2 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(args));
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println(args[i]);
        }

    }
}
