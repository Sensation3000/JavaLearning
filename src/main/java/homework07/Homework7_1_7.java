package homework07;

public class Homework7_1_7 {
    //Задача №7
    //Дан массив:
    //int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
    //необходимо вывести количество элементов в массиве.

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9},
                {-1, -2, -3, -4},
                {-5, -6}
        };

        //1 вариант
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                count++;
            }
        }
        System.out.println(count);

        //2 вариант
        int count2 = 0;
        for (int i = 0; i < array.length; i++) {
            count2 += array[i].length;
        }
        System.out.println(count2);
    }
}
