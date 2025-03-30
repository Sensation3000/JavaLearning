package homework16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Homework16_1 {
    public static void main(String[] args) {

        /*
        Задача №1

        Создать лист и добавить в него следующие слова:
        White.
        Tan.
        Yellow.
        Orange.
        Red.
        Pink.
        Purple.
        Blue.
        Затем удалить из этого списка все цвета в которых встречается буква “L”
        */

        List<String> colors = new ArrayList<>(List.of(
                "White",
                "Tan",
                "Yellow",
                "Orange",
                "Red",
                "Pink",
                "Purple",
                "Blue"
        ));

        System.out.println(colors);

        //Тут нельзя удалять элементы из списка colors в цикле for-each,
        // т.к это может привести к ConcurrentModificationException
        // или к тому, что некоторые элементы не будут проверены

        //Чтобы избежать этой проблемы, используем итератор для удаления элементов из списка.

        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.contains("l") || s.contains("L")) {
                iterator.remove(); // Удаляем элемент через итератор
            }
        }
        System.out.println(colors);
    }
}
