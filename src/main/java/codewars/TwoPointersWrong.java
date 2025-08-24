package codewars;

import java.util.Arrays;

// найти 2 числа в массиве, которые образуют сумму sum
// используем цикл
//сложность алгритма O(n^2)

public class TwoPointersWrong {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 9;

        System.out.println(Arrays.toString(twoPointers(array, sum)));
    }
    public static int[] twoPointers(int[] array, int sum) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i] + array[j]==sum){
                    return new int[]{array[i], array[j]};
                }
            }
        }
        return null;
    }
}
