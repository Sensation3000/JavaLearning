package homework07;

public class Homework7_2_1 {
    public static void main(String[] args) {
        //Вывести следующие строки с соответствующим форматированием (как пирамиды):
        //
        //
        //Задача №1
        //
        //0  1  2  3  4  5  6  7  8  9
        //0  1  2  3  4  5  6  7  8
        //0  1  2  3  4  5  6  7
        //0  1  2  3  4  5  6
        //0  1  2  3  4  5
        //0  1  2  3  4
        //0  1  2  3
        //0  1  2
        //0  1
        //0


        for(int i = 0; i < 10; i ++ ){
            //создаем 10 строчек
            for (int j = 0; j < 10 - i; j++) {
                System.out.print(j + " ");
                //в каждой строчке пишем цифры + пробел
            }
           System.out.println();
              //делаем перевод на следующую строчку
        }
    }
}
