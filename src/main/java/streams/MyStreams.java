package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MyStreams {

}
// Cтримы
// Stream API это набор классов из пакета java.util.stream, появившийся в Java 8.
// Он позволяет обрабатывать коллекции и массивы цепочкой операций вместо циклов.
// У цепочки есть источник, любое число промежуточных операторов вроде filter и map,
// и ровно один терминальный оператор вроде forEach или collect, который эту цепочку и запускает.

// Stream API появился в Java 8 и живет в пакете java.util.stream.
// Он позволяет обрабатывать коллекции и массивы цепочкой операций вместо циклов.
// Цепочка состоит из трех частей:
// 1) источник (коллекция, массив, Stream.of),
// 2) промежуточные операторы
// 3) и один терминальный.

// Промежуточные операторы (filter, map, sorted, limit, distinct) возвращают новый стрим,
// и их может быть сколько угодно.

//Терминальный оператор (forEach, collect, count, reduce) завершает цепочку, и он всегда ровно один.
//Пока терминальный оператор не вызван, не выполняется ничего: промежуточные операторы ленивые.

// Один стрим рассчитан на один проход.
// Для второго нужен новый стрим, иначе можно получить IllegalStateException.

// Отличия цикла от цепочки Stream API

// Стиль написания
// Stream - Декларативный. Вы лишь описываете правила фильтрации и преобразования,
// а перебор происходит «под капотом».\
// Цикл - Императивный. Вы сами управляете индексами, счетчиками и тем, как именно перебирать коллекцию.

//Выполнение
// Stream  - Ленивое (Lazy). Промежуточные операции не выполняются, пока вы не вызовете финальный (терминальный) метод.
// Цикл - Жадное (Eager). Каждая строчка кода внутри цикла выполняется немедленно для текущего элемента.

//Изменяемость
// Stream  - Не изменяет исходный источник данных, а создает новый результат (stateless).
// Цикл - Обычно модифицирует существующую коллекцию или внешние переменные (stateful).

//Параллелизм
// Stream - Легко распараллеливается заменой .stream() на .parallelStream().
// Цикл - Чтобы распараллелить цикл, нужно вручную писать многопоточный код (Threads, ExecutorService).


//   Из Коллекции:
//    Создание стрима из существующей коллекции.
class CollectionStreamExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java");
        // Arrays.asList() позволяет заменять существующие элементы через метод set(),
        // но вы не можете добавить новые элементы или удалить старые

        //List.of() полностью запрещает любые модификации.

        Stream<String> stream = words.stream(); // Создаем стрим из коллекции

        stream.forEach(System.out::println); // Выводим элементы стрима

        //System.out::println — это ссылка на метод.
        // Такой синтаксис с двойным двоеточием (::) означает вызов стандартной команды печати
        // в консоль для каждого отдельного элемента.
        // Это сокращенная замена лямбда-выражения x -> System.out.println(x)
    }
}

//Из Массива:
//Преобразование массива в стрим.

class ArrayStreamExample {
    public static void main(String[] args) {
        String[] words = {"hello", "world", "java"};

        Stream<String> stream = Arrays.stream(words); // Создаем стрим из массива

        stream.forEach(System.out::println); // Выводим элементы стрима
    }
}

//С использованием Stream.of()
//Использование статического метода Stream.of() для передачи элементов.

class StreamOfExample {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "world", "java"); // Создаем стрим из элементов

        stream.forEach(System.out::println); // Выводим элементы стрима
    }
}

//С использованием Stream.builder():
//Использование Stream.builder() для добавления элементов динамически.
class StreamBuilderExample {
    public static void main(String[] args) {
        Stream.Builder<String> builder = Stream.builder();

        builder.add("hello");
        builder.add("world");
        builder.add("java");

        Stream<String> stream = builder.build(); // Создаем стрим из билдера

        stream.forEach(System.out::println); // Выводим элементы стрима
    }
}

//С использованием Stream.generate():
//Создание бесконечного стрима на основе функции-генератора.
class StreamGenerateExample {
    public static void main(String[] args) {
        Stream<Double> stream = Stream.generate(Math::random); // Создаем бесконечный стрим случайных чисел
        // Math::random — это ссылочный метод (method reference). Он эквивалентен лямбда-выражению  () -> Math.random()
        //Сам метод Math.random() возвращает случайное число double от 0.0 (включительно) до 1.0 (исключительно)

        stream.limit(5) // Ограничиваем количество элементов
                .forEach(System.out::println); // Выводим элементы стрима

        // Так как поток бесконечен, его нельзя использовать напрямую с терминальными методами вроде
        // .forEach() без ограничения, иначе программа зависнет в бесконечном цикле или исчерпает память.
    }
}

//С использованием Stream.iterate():
//Создание бесконечного стрима с помощью начального значения и функции-генератора.

class StreamIterateExample {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(0, n -> n + 2); // Создаем бесконечный стрим четных чисел

        stream.limit(5) // Ограничиваем количество элементов
                .forEach(System.out::println); // Выводим элементы стрима
    }
}

//С использованием строки:
//Преобразование строки в стрим символов, кодовых точек или строк.

class StringStreamExample {
    public static void main(String[] args) {
        String text = "hello";

        IntStream charStream = text.chars(); // Создаем стрим кодовых точек символов

        charStream.forEach(ch -> System.out.println((char) ch)); // Выводим символы
    }
}


//Через методы из библиотеки Files:

class FilesStreamExample {
    public static void main(String[] args) {
        try (Stream<String> stream = Files.lines(Paths.get("example.txt"))) { // Создаем стрим из строк файла
            stream.forEach(System.out::println); // Выводим строки файла
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



