package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperations {
    // Терминальные операции являются заключительными для стрима и вызывают обработку данных.

    // Если стрим в Java собрать без терминального оператора,
    // то операции промежуточные (intermediate) не будут выполнены!
    //Стрим будет создан, но никаких данных не будет обработано до момента вызова терминальной операции.

    //В Java Stream API стримы бывают открытыми (open) и закрытыми (closed).
    // Открытый стрим - это стрим, к которому еще можно применять операции.
    // Закрытый стрим - это стрим, к которому уже была применена терминальная операция,
    // и он не может быть использован для последующих промежуточных операций.
}

// Терминальные Операции:

//forEach(Consumer action)
//Применяет заданное действие к каждому элементу стрима.

class ForEachExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java");

        words.stream()
                .forEach(System.out::println); // Выводим каждую строку
    }
}

//toArray()
//Преобразует стрим в массив.

class ToArrayExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java");

        String[] array = words.stream()
                .toArray(String[]::new); // Преобразуем стрим в массив

        System.out.println(Arrays.toString(array)); // Выводим массив
    }
}

//collect(Collector<T, A, R> collector)
//Собирает элементы стрима в коллекцию с использованием заданного коллектора.

class CollectExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java");

        List<String> upperCaseWords = words.stream()
                .map(String::toUpperCase) // Преобразуем строки в верхний регистр
                .collect(Collectors.toList()); // Собираем в список

        System.out.println(upperCaseWords); // Выводим результат
    }
}

//reduce(BinaryOperator accumulator)
//Поочередно применяет бинарный оператор к элементам стрима, пока не получится один результат.
class ReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b); // Суммируем все числа

        System.out.println("Sum: " + sum); // Выводим результат
    }
}

//count()
//Возвращает количество элементов в стриме.

class CountExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java");

        long count = words.stream()
                .count(); // Считаем количество элементов

        System.out.println("Count: " + count); // Выводим результат
    }
}

//anyMatch(Predicate predicate)
//Проверяет, удовлетворяет ли хотя бы один элемент стрима заданному предикату.

class AnyMatchExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        boolean hasEven = numbers.stream()
                .anyMatch(n -> n % 2 == 0); // Проверяем, есть ли хотя бы одно четное число

        System.out.println("Has even number: " + hasEven); // Выводим результат
    }
}

//allMatch(Predicate predicate)
//Проверяет, удовлетворяют ли все элементы стрима заданному предикату.

class AllMatchExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

        boolean allEven = numbers.stream()
                .allMatch(n -> n % 2 == 0); // Проверяем, все ли числа четные

        System.out.println("All numbers are even: " + allEven); // Выводим результат
    }
}

//noneMatch(Predicate predicate)
//Проверяет, что ни один элемент стрима не удовлетворяет заданному предикату.

class NoneMatchExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9);

        boolean noneEven = numbers.stream()
                .noneMatch(n -> n % 2 == 0); // Проверяем, что нет ни одного четного числа

        System.out.println("No even numbers: " + noneEven); // Выводим результат
    }
}

//findFirst()
//Возвращает первый элемент стрима в виде Optional.

class FindFirstExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java");

        Optional<String> firstWord = words.stream()
                .findFirst(); // Находим первый элемент

        firstWord.ifPresent(System.out::println); // Выводим результат, если он есть
    }
}

//findAny()
//Возвращает любой элемент стрима в виде Optional. Используется в параллельных стримах.

class FindAnyExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java");

        Optional<String> anyWord = words.stream()
                .findAny(); // Находим любой элемент

        anyWord.ifPresent(System.out::println); // Выводим результат, если он есть
    }
}









