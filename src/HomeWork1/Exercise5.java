package HomeWork1;/* ex5 - Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения) и
 вывести результат на консоль.*/


public class Exercise5 {

    public static void main(String[] args) {
        int sum = 0;
        int multiple = 1;
        for (int i=0; i<args.length; i++) {

            int currentArg = Integer.parseInt(args[i]);
            sum += currentArg;
            multiple *= currentArg;

        }
        System.out.println("sum = " + sum);
        System.out.println("multiple = " + multiple);
    }

}
