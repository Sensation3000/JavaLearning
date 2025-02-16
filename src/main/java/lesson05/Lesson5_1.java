package lesson05;

import java.util.Arrays;

public class Lesson5_1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        int[] array = {1, 2, 3, 4, 50, -1};
        //              0  1  2  3   4   5
        // массивы не изменяемы по длине

        //так как выше написано это синтаксический сахар
        //в реальности написание такое
        int[] array2 = new int[]{1, 2, 3};
        // с указанием что создаем нового представителя класса массив с типом int

        int [] arr = new int[15];
        //создание массива без указания значений но с известной длинной массива

        System.out.println(array[4]); //вывести элемент по индексу 4
        array[3] = 10;              // меняем значение элемента по индексу 3
        System.out.println(array); // так не распечатает массив как нам надо
        System.out.println(Arrays.toString(array));  //так нужно печатать массивы

        //пробегаемся циклом по массиву
        for (int i = 0; i < array.length; i++) {
            // array[i];   значение каждого элемента
            // i;          индекс элемента
            System.out.println("В элементе под индексом " + i + " лежит значение " + array[i]);
        }
    }
}
