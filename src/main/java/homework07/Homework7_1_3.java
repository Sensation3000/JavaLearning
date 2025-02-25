package homework07;

public class Homework7_1_3 {
    public static void main(String[] args) {
//        Задача №3
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести минимальное значение массива.
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int min = Integer.MAX_VALUE; // array[0] is also an option if array isn't empty;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
