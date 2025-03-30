package lesson16;

import java.util.ArrayList;
import java.util.List;

public class Lesson16_01 {

    public static void main(String[] args) {
        String[] strArr = new String[]{};

        // интерфейсы - у них нет имплементации

        // СПИСКИ
        // будем использовать эту имплементацию интерфейса Лист
        List<String> strings = new ArrayList<>(); //стандартная имплементация интерфейса Лист
        System.out.println(strings);
        strings.add("one");   //добавили элемент
        System.out.println(strings);
        strings.add("two");
        strings.add("three");
        System.out.println(strings);
        strings.remove(0);  // удаление элемента по индексу
        System.out.println(strings);
        strings.remove("two"); // удаление элемента по значению

        //в списки можно добавлять или удалять элементы динамически
        //не обязательно знать заранее длину списка
        //в массиве arr.length(), в списках arr.size()
        //в массиве arr[i], в списках arr.get(i)

        //пройтись циклом по списку
        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);
            System.out.println(s);
        }

        List<Integer> ints = new ArrayList<>();
        ints.add(1); // уже добавляем цифры
        int elem = ints.get(0);  //джава без проблем делает автобоксинг
        // т.е переводит Integer в int и наоборот

        // интерфейс Лист
        // public interface List<E> extends Collection<E>{}
        // содержит метод boolean add (E e); без имплементации
        // этот интерфейс может работать с любым классом, там вводится переменная типа <E>
        // этот класс может работать с элементами любого одного типа
        // Пример: если объявляем список как список строк, то все методы будут работать со строками
        // Пример: если объявляем как список Integer, то все методы будут работать с int

    }
}
