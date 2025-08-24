package homework07;

public class Homework7_2_3 {
    public static void main(String[] args) {
//        Задача №3
//        9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
//          8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
//           7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
//             6 5 4 3 2 1 0 1 2  34 5 6
//               5 4 3 2 1 0 1 2 3 4 5
//                 4 3 2 1 0 1 2 3 4
//                   3 2 1 0 1 2 3
//                     2 1 0 1 2
//                       1 0 1
//                         0

        //ОТДЕЛЬНО ВТОРАЯ ЧАСТЬ
//        for(int i = 0; i < 10; i ++ ){
//            //создание 10 строчек
//            for (int j = 0; j < 10 - i; j++) {
//                System.out.print(j + " ");
//                //внутри строчек пишем начиная с 0 до j
//                // при этом j не должна превышать 10 - i
//            }
//            System.out.println(" ");
//            //делаем пустую строку
//        }

        //ОТДЕЛЬНО ПЕРВАЯ ЧАСТЬ
//        String str = "";
//        for(int i = 0; i < 10; i++){
//            //создание 10 строчек
//            System.out.print(str);
//            //печатаем str
//            for (int j = 9 - i; j > 0; j--) {
//                System.out.print(j + " ");
//                //внутри строчек пишем начиная с 9 - i до 0
//            }
//            System.out.println(" ");
//            str += "  ";
//            //после прохода внутреннего цикла добавляй еще один пробел в str
//        }

        //ИТОГОВОЕ РЕШЕНИЕ
        String str = "";
        for (int i = 0; i < 10; i++) {
            System.out.print(str);
            for (int j = 9 - i; j > 0; j--) {
                System.out.print(j + " ");
            }
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
            str += "  ";
        }

        // вариант преподавателя
        // все тоже самое, но вместо доп.переменной - цикл для создания пробелов
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            for (int j = 9 - i; j > 0; j--) {
                System.out.print(j + " ");
            }
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
