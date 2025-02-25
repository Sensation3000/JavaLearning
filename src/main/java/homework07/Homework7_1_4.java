package homework07;

public class Homework7_1_4 {
    public static void main(String[] args) {
//        Задача №4
//        Дан массив:
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        необходимо вывести среднее арифметическое всех значений массива.
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum * 1.0 / array.length;
        System.out.println(sum);
        System.out.println(average);
    }
}
