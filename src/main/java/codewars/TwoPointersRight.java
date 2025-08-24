package codewars;

import java.util.Arrays;

// найти 2 числа в массиве, которые образуют сумму sum
// используем алгоритм 2 указателя
// сложность алгоритма O(n)

public class TwoPointersRight {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 9;

        System.out.println(Arrays.toString(twoPointers(array, sum)));
    }

    public static int[] twoPointers(int[] array, int sum) {
        int left = 0;
        int right = array.length - 1;
        while (left != right) {
            int temp = array[left] + array[right];

            if (temp == sum) {
                return new int[]{array[left], array[right]};
            }

            if (temp < sum){
                left++;
            } else {
                right--;
            }
        }
        return null;
    }
}