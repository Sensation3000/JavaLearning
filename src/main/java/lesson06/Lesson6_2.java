package lesson06;

import java.util.Arrays;

public class Lesson6_2 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.substring(7)); //напечатать вырезанный кусок строки
        //оригинальная  строка при этом не изменится
        System.out.println(str.substring(7, 9)); //конечный символ не включается
        System.out.println(str.substring(0, 5));  //5 символов с начала
        System.out.println(str.substring(str.length() - 4)); //последние 4 символа с конца

        System.out.println(str.charAt(5)); //распечатай символ под индексом 5

        //сравнение строк
        //нельзя пользоваться знаком равно т.к это объекты
        //== это сравнение ссылки, показывают ли две переменные на один и тот же объект
        //== используется для примитивных типов

        //испольуем метод equals()
        //сравнение значения переменных

        System.out.println(str.equals("xxx")); // false
        System.out.println(str.equals("Hello, world!")); // true

        System.out.println(str.compareTo("AAAAA")); //латинскими буквами ААААА стоит раньше, положительное число
        System.out.println(str.compareTo("zzzzz")); //латинскими буквами zzzz стоит позже, отрицательное число
        System.out.println(str.compareTo("Hello, world!")); //значение 0, на одном уровне

        System.out.println(str.compareToIgnoreCase("aaaaa")); //сравнение с игнорированием регистра
        System.out.println(str.equalsIgnoreCase("xxx")); //equals c игнорированием регистра

        System.out.println(str.toUpperCase()); // большими буквами
        System.out.println(str.toLowerCase()); //маленькими буквами

        System.out.println(str.contains("orl")); //содержит подстроку
        System.out.println(str.endsWith("d!"));  //заканчивается на d!

        System.out.println(str.toLowerCase().contains("ORL".toLowerCase()));

        int indexOfW = str.indexOf('W'); //возвращает первое вхождение
        //.lastIndexOf() последнее вхождение

        if (indexOfW < 0) {
            System.out.println("No such letter");
        } else {
            System.out.println(str.substring(indexOfW));
        }

        String str2 = "в лесу родилась елочка";
        String [] words = str2.split(" "); //превратить в массив по разделителю " "
        String [] elements = str.split(""); //преврать в массив элементов. Пробелы и запятые тоже считает как элементом

        System.out.println(Arrays.toString(words));
        System.out.println(words.length);

        System.out.println(Arrays.toString(elements));
        System.out.println(elements.length);

        System.out.println(str2.replaceAll("о+", "О"));
        //регулярные выражения. Заменить все буквы о на О
        //+ описывает все буквы
    }
}
