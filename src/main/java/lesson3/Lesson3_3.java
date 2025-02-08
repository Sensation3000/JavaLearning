package lesson3;

public class Lesson3_3 {
    public static void main(String[] args) {
        int x = 10;
        int y = 3;

        int z = x * 2 - y;
        //учимся работать в режиме дебаггинга
        //F8 step over - шаг вперёд (каждая строчка по шагам
        //F9 resume - от брейкпоинта до брейкопоинта прыгаем

        if (z > 20){
            System.out.println("z > 20");
        } else {
            System.out.println("z <= 20");
        }
    }
}