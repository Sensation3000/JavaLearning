package lesson06;

public class Lesson6_7 {
    public static void main(String[] args) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int max = Integer.MIN_VALUE; // -2 в 31 степени = 2147483648
        // Integer.MAX_VALUE+2**31
        for (int i = 0; i < daysInMonth.length; i++) {
            int days = daysInMonth[i];  //для удобства
            if (days > max) {
                max = days;
            }
        }
        System.out.println(max);
    }
}
