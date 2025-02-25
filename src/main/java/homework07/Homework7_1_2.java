package homework07;

public class Homework7_1_2 {
    public static void main(String[] args) {
//        Задача №2
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести максимальное значение массива.

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int max = Integer.MIN_VALUE; // array[0] is also an option if array isn't empty;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}