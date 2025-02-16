package lesson06;

import java.util.Arrays;

public class Lesson6_1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1.clone();
        //клонируем массив - создаем новый массив, точно такой же. Но это будет не ссылкана прежний массив
        arr1[0] = -1;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
