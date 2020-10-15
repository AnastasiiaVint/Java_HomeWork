package HomeWork1;// ex3 - Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.


import java.util.Random;

public class Exercise3 {
    public static void main(String[] args) {

        for(int i = 0; i < 10; i++){
            Random random1 = new Random();
            System.out.println(random1.nextInt());
        }

        for (int i = 0; i < 10; i++) {
            Random random2 = new Random();
            System.out.print(random2.nextInt(1000));

        }
    }
}

