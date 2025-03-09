package lesson09;

import java.util.Objects;

public class Grade {
    //неизменяемый класс immutable
    //у полей указаны модификаторы final, нет сеттеров, сделаны конструкторы

    private final int numGrade;
    // final - это больше не изменить

    public Grade(int numGrade) {
        if (numGrade < 1 || numGrade > 5) {
            throw new IllegalArgumentException("Grade must be 1, 2, 3, 4 ,5 ");
        }
        this.numGrade = numGrade;
    }

    public Grade(char letter) {
        this(numFromLetter(letter));  //здесь можем только статический метод применить
        //вызов другого конструктора через this всегда должно стоять первым

        //у каждого метода и конструктора тоже есть сигнатура, которая позволяет уникально идентифицировать метод
        //сигнатура состоит из имени и списка параметров по типу и последовательности

        //как указано ниже так мы сделать не можем так как this должен быть указан первым
        //  switch (letter) {
        //  case 'A': this(5);
        //  case 'B': this (4);
        //     }
    }

    // поэтому сделали отдельный статический метод и передали его в конструктор
    private static int numFromLetter(char letter) {
        int numGrade = 0;
        switch (letter) {
            case 'A':
                numGrade = 5;
                break;
            case 'B':
                numGrade = 4;
                break;
            case 'C':
                numGrade = 3;
                break;
            case 'F':
                numGrade = 2;
                break;
            default:
                throw new IllegalArgumentException("Letter grade must be A, B, C, F");
        }
        return numGrade;
    }

    public int getNumGrade() {
        return numGrade;
    }

    // generate equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grade grade = (Grade) o;
        return numGrade == grade.numGrade;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numGrade);
    }
}
