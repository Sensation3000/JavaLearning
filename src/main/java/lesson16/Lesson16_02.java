package lesson16;

import java.util.ArrayList;
import java.util.List;

public class Lesson16_02 {
    public static void main(String[] args) {

        System.out.println(filterByPrefix("a", List.of("aa", "ab", "bc", "cd", "ad"))); //["aa", "ab", "ad"]

        //ИЗМЕНЯЕМЫЙ ДИНАМИЧЕСКИЙ СПИСОК
        List<String> l1 = new ArrayList<>(); // самый обычный список, который мы можем динамически изменять
        l1.add("aa");
        l1.add("ab");
        l1.add("bc");
        l1.add("cd");
        l1.add("ad");

        //НЕИЗМЕНЯЕМЫЙ СПИСОК
        List<String> l2 = List.of("aa", "ab", "bc", "cd", "ad"); //неизменяемый список
        //l1.add("xx"); сюда нельзя добавить ничего
        //чтобы сделать его изменяемым надо его обернуть в new ArrayList<>()

        //ОБЕРНУЛИ НЕИЗМЕНЯЕМЫЙ СПИСОК В ИЗМЕНЯЕМЫЙ
        List<String> l3 = new ArrayList<>(List.of("aa", "ab", "bc", "cd", "ad"));
        l1.add("xx"); //теперь добавить что-то можно

        // List <String> l4 = new ArrayList<>("aa", "ab", "bc", "cd", "ad");
        // так делать нельзя, перечислять сразу элементы можно только в List.of и далее оборачивать в new ArrayList<>

        //ЕЩЕ ВАРИАНТ РАБОТЫ С ДИНАМИЧЕСКИМ СПИСКОМ, ЧТОБЫ НЕ ДОБАВЛЯТЬ ЭЛЕМЕНТЫ ПО ОДНОМУ
        List<String> l5 = new ArrayList<>();
        l5.addAll(l2);

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l5);
    }

    //метод фильтрующий список строк, по наличию в начале определенной приставки в начале строки
    public static List<String> filterByPrefix(String prefix, List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String s : strings) {
            if (s.startsWith(prefix)){
              result.add(s);
            }
        }
        return result;
    }
}
