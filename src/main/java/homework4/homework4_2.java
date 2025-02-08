package homework4;

public class homework4_2 {
    public static void main(String[] args) {
        //Задача №2
        //
        //Необходимо вывести все положительные степени числа 5 до тех пор,
        // пока результат возведения в степень меньше 100000,
        // вывести результат возведения в степень.

        int result = 1;
        while (result < 100000){
            result = result * 5;
            System.out.println(result);
        }
    }
}
