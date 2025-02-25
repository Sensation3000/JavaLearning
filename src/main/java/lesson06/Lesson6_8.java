package lesson06;

public class Lesson6_8 {
    public static void main(String[] args) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int min = daysInMonth[0];  //берем первый элемент массива
        //это работает пока массив, который к нам приходит не пустой

        for (int i = 0; i < daysInMonth.length; i++) {
            int days = daysInMonth[i];  //для удобства
            if (days < min) {
                min = days;
            }
        }
        System.out.println(min);
    }
}
