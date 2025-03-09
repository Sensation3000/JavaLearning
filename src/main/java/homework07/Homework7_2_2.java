package homework07;

public class Homework7_2_2 {
    public static void main(String[] args) {
//        Задача №2
//
//        0  1  2  3  4  5  6  7  8  9
//           0  1  2  3  4  5  6  7  8
//              0  1  2  3  4  5  6  7
//                 0  1  2  3  4  5  6
//                    0  1  2  3  4  5
//                       0  1  2  3  4
//                          0  1  2  3
//                             0  1  2
//                                0  1
//                                   0
        String str = "";
        for (int i = 0; i < 10; i++) {
            //создаем 10 строчек
            System.out.print(str);
            //печатаем str - сначала он пустой, но постепенно будут добавляться пробелы
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(j + " ");
                //внутри строчек пишем начиная с 0 до 10-i
            }
            System.out.println();
            //делаем перевод на следующую строчку после каждой итерации
            str += "  ";
            //добавляем пробелы после каждой итерации
        }

        //вариант преподавателя без доп.переменной, но с циклом, который перечает пробелы
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < 10 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
