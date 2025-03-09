package lesson10.inheritance;

import java.util.Random;

public class Parent {
    private int number = new Random().nextInt(5);
    // некое число от 0 до 4

    //финальный метод, не можем переопределить
    //если бы не было сеттеров к number,
    //мы бы в классах-наследниках ничего не смогли бы с ним сделать,
    //но на жизнь наследников это влияет
    public final String toString() {
        return number + ":::" + whoAmI();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    //если у нас есть наследники класса, то модификатор доступа на private уже нельзя будет изменить
    public String whoAmI() {
        return "I am a Parent";
    }
}
