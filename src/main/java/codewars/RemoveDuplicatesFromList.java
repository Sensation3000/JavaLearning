package codewars;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/*
https://www.codewars.com/kata/57a5b0dfcf1fa526bb000118/train/java
Define a function that removes duplicates from an array of non negative numbers and returns it as a result.

The order of the sequence has to stay the same.

Examples:

Input -> Output
[1, 1, 2] -> [1, 2]
[1, 2, 1, 1, 3, 2] -> [1, 2, 3]
*/

public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(distinct(new int[]{1, 1, 2})));
        System.out.println(Arrays.toString(distinct(new int[]{1, 2, 1, 1, 3, 2})));
        System.out.println(Arrays.toString(distinct(new int[]{1, 1, 1, 2, 3, 4, 5})));

    }

    public static int[] distinct(int[] array){
        Set<Integer> mySet = new LinkedHashSet<>();
        for(int number : array){
            mySet.add(number);
        }

        int[] newArray = new int[mySet.size()];
        int count = 0;
        for(int number: mySet){
            newArray[count] = number;
            count++;
        }
        return newArray;
    }
}
