package lesson16;

import java.util.HashMap;
import java.util.Map;

public class Lesson16_7 {

    public static void main(String[] args) {

        // MAP
        // в питоне называется dictionary, в джаваскрипте объект
        // содержит ключ-значение

        /*
        +----------------------------+
        |  Name    |   Phone Number  |
        +----------------------------+
        |  john    |   123-456-7890  |
        |  paul    |   098-947-2345  |
        |  george  |   456-134-6789  |
        +----------------------------+
         */

        // Map принимает 2 переменные типа (они могут быть любыми не только строками)
        // у них не одинаковая роль
        // первая это тип данных ключа
        // вторя это тип данных значения

        Map<String,String> phoneBook = new HashMap<>(); //стандартная имплементация интерфейса Map
        phoneBook.put("john", "123-456-7890");
        phoneBook.put("paul", "098-947-2345");
        phoneBook.put("george", "456-134-6789");
        phoneBook.put("john", "875-434-1111"); //положить в ячейку с именем john такое значение. Мы заменили значение у Джона
        //значение ключа уникально

        System.out.println(phoneBook.get("john")); //хотим узнать телефон Джона
        System.out.println(phoneBook.get("ringo")); //получим null, т.к телефона Ринго нет
        //метод get возвращает значение соответствующее ключу, который мы ищем
        //возвращает null, если такого ключа не существует

        System.out.println(phoneBook);

    }
}
