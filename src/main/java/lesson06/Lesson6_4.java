package lesson06;

import java.util.Arrays;

public class Lesson6_4 {
    public static void main(String[] args) {
        String[] months = {"январь", "февраль", "март", "апрель", "май",
                "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декарь"};

        String[] result = new String[months.length];
        //создаем новый массив с длинной как у прежнего массива

        int [] lengthen = new int [months.length];

        for (int i = 0; i < months.length; i++) {
            result[months.length - i - 1] = months[i].toUpperCase();
            //в каждый элемент нового массива положим элемент прошлого массива большими буквами
            //начинаем с конца
            lengthen[i] = months[i].length();
            //  //в каждый элемент нового массива положим длину элемента прошлого массива
        }
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(lengthen));

        //вывести все элементы заканчивающиеся на мягкий знак
        for (int i = 0; i < months.length; i++) {
            String month = months[i];
            if (month.endsWith("ь")){
                System.out.println(months);
            }
        }
    }
}
