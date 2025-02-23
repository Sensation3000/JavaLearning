package homework07;

public class Homework7_3_1 {
    public static void main(String[] args) {
//        Задача №1
//        Необходимо написать 4 метода:
//        сложение 2х чисел
//        вычитание 2х чисел
//        умножение 2х чисел
//        деление 2х чисел
        System.out.println(addition(4, 5));
        System.out.println(subtraction(4, 5));
        System.out.println(multiplication(4, 5));
        System.out.println(division(4, 5));
        System.out.println(division(4, 0));
    }

    public static int addition(int x, int y) {
        return x + y;
    }

    public static int subtraction(int x, int y) {
        return x - y;
    }

    public static int multiplication(int x, int y) {
        return x * y;
    }

    public static double division(int x, int y) {
        if (y != 0) {
            return 1.0 * x / y;
        } else {
            System.out.println("Can't divide by " + y);
            return y;
        }
    }
}
