package lesson16;

import java.util.Iterator;
import java.util.List;

public class Lesson16_04 {

    public static void main(String[] args) {

        // ИТЕРАТОР
        // тоже интерфейс, в котором куча методов
        // нам нужен boolean hasNext() и E next()

        List<String> l1 = List.of("aa", "ab", "bc", "cd", "ad");

        Iterator<String> iter = l1.iterator();

        while(iter.hasNext()){
            String elem = iter.next();
            System.out.println(elem);
        }
        // итератор это такая штука по которой можно пройти один раз,
        // его нельзя отмотать назад

        for(String s : l1){
            //тут под капотом цикл с итератором
        }
    }
}
