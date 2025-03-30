package lesson16;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lesson16_6 {
    public static void main(String[] args) {

        // SET
        // тоже некий список данных уникальных элементов, не может содержать дублирующие элементы
        // не гарантирует порядок элементов


        //НЕИЗМЕНЯЕМЫЙ SET
        Set<String> mySet = Set.of("aa", "ab", "bc", "cd", "ad");
        System.out.println(mySet);
        // mySet.add("aa")  так добавить нельзя, т.к это дубль. Выдаст ошибку

        //НЕИЗМЕНЯЕМЫЙ SET ОБЕРНУЛИ В ИЗМЕНЯЕМЫЙ
        Set<String> mySet2 = new HashSet<>(Set.of("aa", "ab", "bc", "cd", "ad"));
        mySet2.add("aa"); //ошибку не выдаст, но и не включит в Set
        System.out.println(mySet2);

        //ИЗМЕНЯЕМЫЙ SET
        Set<String> mySet3 = new HashSet<>();
        mySet3.add("aa");
        mySet3.add("ab");
        mySet3.add("bc");
        mySet3.add("cd");
        mySet3.add("ad");
        mySet3.add("aa"); //ошибку не выдаст, но и не включит в Set
        System.out.println(mySet3);

        //так как Set не гарантирует порядок элементов, то мы не можем у него запросить элемент по индексу
        // использовать метод set.get(0) - нельзя, его не существует

        //обычный цикл forEach есть

        for (String s : mySet){
            System.out.println(s);
        }








    }
}
