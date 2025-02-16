package lesson05;

import java.util.Arrays;

public class Lesson5_3 {
    public static void main(String[] args) {
        String str = "Hello world";
        String str1 = new String("Hello world");

        int [] arr1 = {1, 2};
        int [] arr2 = arr1;
        arr2 = new int [] {100, 200};    //создали нового представителя класса, аrr1 останется неизменной

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        String str2 = "Hello world!";
        String str3 = str2;
        str3 = "cool";                //создали нового представителя класса, аrr2 останется неизменной
        System.out.println(str2);
        System.out.println(str3);

        //str1[5] = "s";    строка неизменяемая

        System.out.println(str1.length());  //распечатай длину строки
        System.out.println(str1.charAt(6)); //распечатай какой символ лежит под индексом 6

        //по строке пройтись циклом
        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));  // распечатай каждый символ строки и начинай с новой строки
        }
    }
}
