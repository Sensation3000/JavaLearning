package lesson04;

import java.util.Random;

public class Lesson4_3 {

    static Random random = new Random();

    public static void main(String[] args) {

        // цикл do while
        //первый раз будет исполнен всегда, далее в зависимости от условия
        int summa;
        do {
            int kubik1 = random.nextInt(6) + 1;
            int kubik2 = random.nextInt(6) + 1;
            System.out.println("Threw: " + kubik1 + " and " + kubik2);
            summa = kubik1 + kubik2;
        } while (summa != 7);
        System.out.println("Done");
    }
}
