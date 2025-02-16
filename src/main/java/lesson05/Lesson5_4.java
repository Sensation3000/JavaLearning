package lesson05;

import java.util.Arrays;

public class Lesson5_4 {
    public static void main(String[] args) {
        String str1 = "Hello world";
        String str2 = str1.replace("l","-"); //заменить все буквы l
        System.out.println(str1);
        System.out.println(str2);

        String str3 = str1.substring(2,6); //вырезать строку начиная с элемента под индексом 2 и заканчивая 6 включительно
        System.out.println(str3);

        String  [] strings = {"a", "b", "c"};
        // массив строк

        Character [] chars = {'a', 'b', 'c'};
        // массив символов

        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(chars));
    }
}
