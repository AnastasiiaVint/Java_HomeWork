package HomeWork1;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        // ex6 - Ввести с консоли Целых чисел.

        int i = 0;
        int a[] = new int[6];

        while (i < a.length) {
            Scanner scanner = new Scanner(System.in);
            a[i] = Integer.parseInt(scanner.next());
            i++;
        }
//        System.out.println("a = " + Arrays.toString(a));

        // ex6.1 - На консоль вывести: Четные числа.
       /* for (int j = 0; j< a.length; j++) {
            if (a[j] % 2 == 0) {
                System.out.println(a[j]);
            }
        }*/

        // ex6.1 - На консоль вывести: Нечетные числа.
        /*for (int j = 0; j< a.length; j++) {
            if (a[j] % 2 != 0) {
                System.out.println(a[j]);
            }
        }*/

        // EX6.2.На консоль вывести: Наибольшее число.
        /*int max = 0;
        for (int x = 0; x < a.length; x++) {
            if (max < a[x]) {
                max = a[x];
            }
        }
        System.out.println("max = " + max);*/

        // EX6.2.На консоль вывести: Наименьшее число.
        /*int min = a[0];
        for (int x = 0; x < a.length; x++) {
            if (min > a[x]) {
                min = a[x];
            }
        }
        System.out.println("min = " + min);*/

        // EX.6.3 На консоль вывести: Числа, которые делятся на 3 или на 9.
        /*for (int k = 0; k< a.length; k++) {
            if ((a[k] % 3 == 0) || (a[k] % 9 == 0)) {
                System.out.println(a[k]);
            }
        }*/

        // EX.6.4.На консоль вывести: Числа, которые делятся на 5 и на 7.

        /*for (int l = 0; l< a.length; l++) {
            if ((a[l] % 5 == 0) && (a[l] % 7 == 0)) {
                System.out.println(a[l]);
            }
        }*/



    }
}
