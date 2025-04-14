package lesson18.interfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        GarminTracker garminTracker = new GarminTracker();
        IPhone29 iPhone29 = new IPhone29();
        ManWithMap nicolaj = new ManWithMap();
        List<Locator> allLocators = List.of(garminTracker, iPhone29, nicolaj);
        for (Locator l : allLocators){
            System.out.println(l.whereAmI());
        }
    }
}

class IPhone29 implements Phone, Locator, FlashLight{
    GpsReceiver gpsReceiver;
    @Override
    public Coordinates whereAmI() {
        return gpsReceiver.findCoordinates();
    }

    @Override
    public void call(String number) {

    }

    @Override
    public void turnOnLight() {

    }
}

class GarminTracker implements Locator, FlashLight {
    GpsReceiver gpsReceiver;

    @Override
    public Coordinates whereAmI() {
        return gpsReceiver.findCoordinates();
    }

    @Override
    public void turnOnLight() {

    }
}

class ManWithMap implements Locator {

    @Override
    public Coordinates whereAmI() {
        return null;
    }
}

/*
 у этих классов нет общего родителя,
 но тем не менее они все умеют делать одно и тоже, определять свое местонахождение
 с помощью интерфейса можем добиться множественного наследования
 отличие интерфейса от абстрактного класса. В классе могут быть какие-то переменные/поля
 в интерфейса нет значений и полей быть не может. Только методы и их сигнатуры
 все методы абстрактные

когда класс имплементирует интерфейс, то "подписывается" контракт, что все эти методы будут в классе присутсвовать
но как они будут выполняться, уже личное дело этого класса

имплементация и контракт друг от друга не зависят. Мы обязаны в классе иметь метод,
но как он будет реализован для контракта не важно

 */
interface Locator {
    Coordinates whereAmI();
}

interface Phone {
    void call (String number);
}

interface FlashLight {
    void turnOnLight();
}

class GpsReceiver {
    Coordinates findCoordinates(){
        return null;
    };
}
class Coordinates {}

