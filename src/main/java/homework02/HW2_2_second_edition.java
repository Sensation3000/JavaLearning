package homework02;

public class HW2_2_second_edition {
    public static void main(String[] args) {
        //Задача №2
        //
        //Необходимо создать целочисленные переменные a и b, присвоить им произвольные значения,
        // а потом поменять значения местами (значение переменной a должно оказаться в переменной b и наоборот).

        int a = 5;
        int b = 10;
        int c;
        System.out.println(a);
        System.out.println(b);

        c = a + b;
        a = c - a;
        b = c - a;
        System.out.println(a);
        System.out.println(b);
    }
}
