package lesson06;

import java.util.Arrays;

public class Lesson6_9 {
    public static void main(String[] args) {

        //с двумя квадратными кавычками
        //не обязаны делать внутренние массивы одинаковой длины
        int[][] dailyCaloories = {
                {343, 546, 565, 520},
                {573, 458, 378, 654},
                {666, 777, 124, 465, 100},
        };

        int[] numbers = {1, 2, 3};
        int one = numbers[1];

        int[] wednesday = dailyCaloories[2];
        int breakfast = wednesday[0];
        System.out.println(Arrays.toString(wednesday));
        System.out.println(breakfast);

        int[] allCalories = new int[dailyCaloories.length];
        //создаем пустой новый массив с определенной длиной как массива по которому будем проходить

        for (int i = 0; i < dailyCaloories.length; i++) {
            //исполняется для каждой строки
            int dailyTotal = 0;
            //создаем переменную в которую будем складывать сумму калорий за каждый день
            //она будет обнуляться каждый проход цикла

            for (int j = 0; j < dailyCaloories[i].length; j++) {
                //исполняется для каждого элемента внутреннего массива
                dailyTotal = dailyTotal + dailyCaloories[i][j];
                //складываем каждый элемент внутреннего массива в сум
            }
            allCalories[i] = dailyTotal;
            //в каждый элемент нового массива присваиваем сумму калорий за каждый день
        }
        System.out.println(Arrays.toString(allCalories));
    }
}
