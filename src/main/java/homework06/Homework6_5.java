package homework06;

public class Homework6_5 {
    public static void main(String[] args) {
//        Экстра-экстра задача
//        Создайте массив размером 5 на 5 (или 10 на 10, или любого другого размера так,
//        чтобы количество строк и количество столбцов совпадало).
//        Преобразуйте этот массив таким образом, чтобы то, что было строками, стало столбцами и наоборот.
//        Внимание! Не надо менять структуру массива.
//        Задание требует только переместить элементы массива.
//        Тип элементов массива может быть любой по вашему выбору.

        int[][] arr = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25},
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int[] row : arr) {
            for (int cell : row) {
                System.out.printf("%3d", cell);  //напечатать отформатированную строку
                //вывести значение этой клетки как число, занимающее 3 позиции
            }
            System.out.println();
        }
    }
}
