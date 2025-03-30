package lesson16;

import java.util.HashMap;
import java.util.Map;

public class Lesson16_07 {

    public static void main(String[] args) {

        // MAP
        // в питоне называется dictionary, в джаваскрипте объект
        // содержит ключ-значение
        // динамически изменяемый
        // порядок добавления элемента не соблюдается, хотя есть sorted Map


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

        Map<String, String> phoneBook = new HashMap<>(); //стандартная имплементация интерфейса Map
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

        String s = "a2awfsdegrshsrthsghdhaeewtadjnknsidfuiohsidhnfjsdnkg";
        //сколько раз в строке был использован каждый символ

        Map<Character, Integer> counters = new HashMap<>();

        //1 вариант
        for (char c : s.toCharArray()) {
            int counter;
            if (counters.get(c) == null) { //если в counters еще нет такого ключа
                //counter for char c not found
                counter = 1; //запиши, что значение встретилось первый раз
            } else {
                counter = counters.get(c) + 1;
            }
            counters.put(c, counter);
        }
        System.out.println(counters);

        //2 вариант упростили
        for (char c : s.toCharArray()) {
            int counter = counters.getOrDefault(c, 0) + 1;
            //для символа с - если там ничего нет, то вернуть 0 и прибавить единицу
            counters.put(c, counter);
        }
        System.out.println(counters);

        System.out.println(counters.keySet()); //получить все ключи
        System.out.println(counters.values()); //получить все значения
        System.out.println(counters.size());

        //ПЕРЕБРАТЬ ВСЕ ЗАПИСИ В MAP и получить SET всех записейн
        for (Map.Entry<Character, Integer> e : counters.entrySet()){
            //перебрать все entries - то есть одна запись в таблице
            System.out.println("Key: " + e.getKey() + " , value: " + e.getValue());
        }
    }
}
