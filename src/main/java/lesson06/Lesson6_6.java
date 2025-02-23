package lesson06;

public class Lesson6_6 {
    public static void main(String[] args) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int sum = 0;

        //цикл forEach - для каждого
        //когда нам не нужен индекс - чтобы перебрать элементы по порядку
        for (int days : daysInMonth) {
            sum = sum + days;
        }
        System.out.println(sum);
    }
}
