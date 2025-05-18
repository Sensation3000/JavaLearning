package codewars;
import java.util.List;

/*
https://www.codewars.com/kata/54ff3102c1bad923760001f3

Return the number (count) of vowels in the given string.
We will consider a, e, i, o, u as vowels for this Kata (but not y).
The input string will only consist of lower case letters and/or spaces.
*/

import java.util.Arrays;

public class VowelCount {
    private static List<Character> vowels;

    static {
        vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
    }

    public static void main(String[] args) {
        String str = "new string which i can think of right now";
        System.out.println(vowelCount(str));
    }

    public static int vowelCount(String strings) {
        int count = 0;
        for (int i = 0; i < strings.length(); i++) {

            //if(strings.charAt(i)=='a'||
            // strings.charAt(i)=='e'||
            // strings.charAt(i)=='i'||
            // strings.charAt(i)=='o'||
            // strings.charAt(i)=='u')

            if(vowels.contains(strings.charAt(i))){
                count++;
            }
        }
        return count;
    }
}
