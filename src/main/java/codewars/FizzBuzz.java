package codewars;

// FizzBuzz
//Описание: Написать программу, которая выводит числа от 1 до N.
// Но для чисел, кратных 3, вывести "Fizz",
// для чисел, кратных 5 - "Buzz",
// а для чисел, кратных и 3, и 5 - "FizzBuzz". (Проверяет: циклы, условия)

//Задание: Напишите метод, например generateFizzBuzz(int n), который принимает целое число n
// и возвращает последовательность FizzBuzz от 1 до n в виде списка строк (List).
//Пример: Вызов generateFizzBuzz(15) должен вернуть список строк, эквивалентный:
// List.of("1", "2", "Fizz", "4", " Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz")

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(generateFizzBuzz(15));
    }

    public static List<String> generateFizzBuzz(int n){
        if (n < 1){
            return Collections.emptyList();
        }
        List<String>list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            list.add(getFizzBuzzValue(i));
        }
        return list;
    }

    public static String getFizzBuzzValue(int n) {
        String fizz = "Fizz";
        String buzz = "Buzz";

        if (n % 3 == 0 && n % 5 == 0) {
            return fizz + buzz;
        } else if (n % 3 == 0) {
            return fizz;
        } else if (n % 5 == 0) {
            return buzz;
        } else {
            return String.valueOf(n);
        }
    }
}
