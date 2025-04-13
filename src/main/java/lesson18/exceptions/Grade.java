package lesson18.exceptions;

import java.util.Objects;
import java.util.Random;

public class Grade {
    private final int numGrage;
    static Random random = new Random();

    // пишем документацию
    /**
     * Creates a new instance of Grade
     * @param numGrage
     * Throws IllegalArgumentException if grade is not 1 - 5
     */
    public Grade(int numGrage) {
//        int die = random.nextInt(10);
//        if(die == 7){
//            throw new RuntimeException("Haha");
//        }

        if(numGrage >= 1 && numGrage <=5){
            this.numGrage = numGrage;
        } else {
            // запретить создание объекта, вызвав ошибку
            throw new IllegalArgumentException("Grade must be between 1 and 5");
        }
        System.out.println("Created grade " + numGrage);
        //не распечатается т.к программа на ошибке закончилась
    }

    public int getNumGrage() {
        return numGrage;
    }

    @Override
    public boolean equals(Object o) {
        //передается какой-то объект, не обязательно Grade
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        //проверка что классы одинаковы, если не равны, вернем false

        Grade grade = (Grade) o;
        //начинаем рассматривать этот объект как инстанс Grage
        return numGrage == grade.numGrage;
        //сравнение нашего numGrage с numGrage пришедшего объекта
    }

    @Override
    public String toString() {
        return "Grade{" +
                "numGrage=" + numGrage +
                '}';
    }
}
