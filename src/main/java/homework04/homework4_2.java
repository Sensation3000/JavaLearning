package homework04;

public class homework4_2 {
    public static void main(String[] args) {
        //Задача №2
        //Необходимо вывести все положительные степени числа 5 до тех пор,
        // пока результат возведения в степень меньше 100000,
        // вывести результат возведения в степень.

        //1 вариант
        int result = 1;
        while (result < 100000){
            result = result * 5;
            if (result > 100000){
                break;
            }
            System.out.println(result);
        }

//        2 вариант
        int number = 5;
        int res = 1;

        for (int i = 1; res * number < 100000; i++) {
            res *= number;
            System.out.println(res);
        }

//        3 вариант
        int num = 5;
        for (int i = 1; i < 100000; i *= num) {
            System.out.println(i);
        }
    }
}
