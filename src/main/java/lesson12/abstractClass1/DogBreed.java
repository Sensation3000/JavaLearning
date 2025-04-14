package lesson12.abstractClass1;

public abstract class DogBreed {



    public String bark() {
        return "Гав-гав";
    }

    //у любой породы должен быть цвет. Но пока мы не можем сказать какой
    //у каждой породы будет свой цвет,
    // каждая порода будет обязана отчитаться какой у нее цвет

    //абстрактный метод, без имплементации
    //не может существовать абстрактный метод в конкретном классе
    //поэтому мы весь класс делаем абстрактным
    //у нас теперь есть абстратный класс, но его инстанцировать мы не можем

    //в наследуемых классах мы должны методы имплементировать
    //абстрактных полей не может быть, только методы
    public abstract String getColor();

    public abstract int getHeight();
}
