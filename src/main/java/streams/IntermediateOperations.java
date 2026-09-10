package streams;
import java.util.Arrays;
import java.util.List;

public class IntermediateOperations {
    //Промежуточные операции создают новый стрим, который можно дальше модифицировать.
    // Операторы в стримах в Java обеспечивают эффективную, декларативную обработку данных,
    // что делает код более читаемым и поддерживаемым.

    //Промежуточные операции в Java являются ленивыми (lazy),
    // что означает, что они не выполняются, пока не потребуется
}

//Промежуточные Операции (конвеерные):

//filter(Predicate predicate)
//Фильтрует элементы стрима в соответствии с заданным предикатом.

class FilterExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        numbers.stream()
                .filter(n -> n % 2 == 0) // Фильтруем только четные числа
                .forEach(System.out::println); // Выводим результат
    }
}


//map(Function<T, R> mapper)
//Преобразует каждый элемент стрима с использованием заданной функции.

class MapExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java");

        words.stream()
                .map(String::toUpperCase) // Преобразуем строки в верхний регистр
                .forEach(System.out::println); // Выводим результат
    }
}

//flatMap(Function<T, Stream> mapper)
//Применяет функцию к каждому элементу стрима и "расплющивает" результат в один стрим.


class FlatMapExample {
    public static void main(String[] args) {
        List<List<Integer>> numbers = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6)
        );

        numbers.stream()
                .flatMap(List::stream) // "Расплющиваем" списки в один стрим
                .forEach(System.out::println); // Выводим результат
    }
}

//distinct()
//Удаляет дубликаты из стрима, используя метод equals().

class DistinctExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        numbers.stream()
                .distinct() // Удаляем дубликаты
                .forEach(System.out::println); // Выводим результат
    }
}

//sorted()
//Сортирует элементы стрима в естественном порядке (если элементы реализуют интерфейс Comparable)
// или с использованием предоставленного компаратора.

class SortedExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana", "apple", "cherry");

        words.stream()
                .sorted() // Сортируем строки в естественном порядке
                .forEach(System.out::println); // Выводим результат
    }
}

//peek(Consumer action)
//Позволяет выполнять действие для каждого элемента стрима без изменения элементов. Удобно для отладки.

class PeekExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream()
                .filter(n -> n % 2 == 0) // Фильтруем только четные числа
                .peek(n -> System.out.println("Filtered value: " + n)) // Выводим отладочную информацию
                .map(n -> n * n) // Возводим в квадрат
                .forEach(System.out::println); // Выводим результат
    }
}

