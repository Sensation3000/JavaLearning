package lesson06;

import java.util.Arrays;

public class Lesson6_3 {
    public static void main(String[] args) {
        String[] months = {"январь", "февраль", "март", "апрель", "май",
                "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декарь"};

        String[] result = new String[months.length];
        //создаем новый массив с длинной как у прежнего массива

        for (int i = 0; i < months.length; i++) {
            result[i] = months[i].toUpperCase();
            //в каждый элемент нового массива положим элемент прошлого массива большими буквами
        }
        System.out.println(Arrays.toString(result));
    }
}
