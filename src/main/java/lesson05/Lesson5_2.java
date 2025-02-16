package lesson05;

import java.util.Arrays;

public class Lesson5_2 {
    public static void main(String[] args) {

        int a = 10;
        int b = a;
        b = 2;
        System.out.println(a);
        System.out.println(b);
        //т.к int это примитивный тип при изменении переменной информация в изначальной переменной осталась прежней
        //в value type для каждой переменной своя область памяти

        int[] arr1 = {15, 20, 30};
        int[] arr2 = arr1;
        arr2[1] = 25;  //изменили элемент под индексом 1 во втором массиве

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        //информация поменялась в обоих массивах, т.к это ссылочный тип данных
        //reference type
        //оба массива ссылаются на одно и тоже место в памяти

        //при этом
        int[] arr3 = {1, 2, 3};
        int[] arr4 = {1, 2, 3};
        // оба этих массива ссылаются на разные ячейки памяти, т.к мы создали двух представителей класса массив
        //реальная запись такая
        // int[] arr3 = new int []{1, 2, 3};
        // int[] arr4 = new int []{1, 2, 3};

    }
}
