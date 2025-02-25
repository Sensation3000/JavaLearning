package lesson06;

public class Lesson6_5 {
    public static void main(String[] args) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        //аккумулятор
        int sum = 0;

        for (int i = 0; i < daysInMonth.length; i++) {
            sum = sum + daysInMonth[i];
        }
        System.out.println(sum);
    }
}