package homework02;

public class HW2_1_second_edition {

    public static void main(String[] args) {


        //Задача №1
        //
        //Необходимо создать целочисленные переменные a и b,
        // присвоить произвольные значения переменным на ваш выбор и вывести результаты
        // следующих операций с этими переменными: сложение, умножение, вычитание, деление и остаток от деления.
        // Также сделать проверку на четность этих переменных и вывести результат.

        int a;
        int b;

        a = 47;
        b = 10;

        System.out.println(add(a, b));
        System.out.println(subtract(a, b));
        System.out.println(multiply(a, b));
        System.out.println(divide(a, b));
        System.out.println(remainder(a, b));

        int remainder = a % 2;
        System.out.printf("Is %d even? ", a);
        System.out.println(remainder == 0);

        remainder = b % 2;
        System.out.printf("Is %d even? ", b);
        System.out.println(remainder == 0);

    }

    public static int add(int num1, int num2){
        System.out.printf("Addition of %d and %d equals " , num1, num2);
        return num1 + num2;
    }

    public static int subtract(int num1, int num2){
        System.out.printf("Subtraction of %d and %d equals " , num1, num2);
        return num1 - num2;
    }

    public static int multiply(int num1, int num2){
        System.out.printf("Multiplication of %d and %d equals " , num1, num2);
        return num1 * num2;
    }

    public static double divide(int num1, int num2) {
        if (num2 == 0) throw new ArithmeticException("Деление на ноль недопустимо");
        System.out.printf("Division of %d and %d equals " , num1, num2);
        return num1 * 0.1/ num2;
    }

    public static int remainder(int num1, int num2){
        System.out.printf("Remainder of division of %d and %d equals " , num1, num2);
        return num1 % num2;
    }
}
