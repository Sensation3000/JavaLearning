package codewars;

import java.util.Arrays;

//перевернуть значения в массиве

public class ReverseArray {

    public static void main(String[] args) {
        int[] array = {2, 7, 8, 9, 11, 12, 16, 21};
        System.out.println(Arrays.toString(reverseArray(array)));
    }

    public static int[] reverseArray(int[] array){
        int left = 0;
        int right = array.length-1;
        while (left < right){
            int temp = array[left];
            array[left] = array[right];
            array[right]= temp;
            left++;
            right--;
        }
        return array;
    }
}
