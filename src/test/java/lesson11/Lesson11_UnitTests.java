package lesson11;
// при создании проекта выбираем систему сборки/менеджер зависимостей Maven
// файл pom.xml - главный файл Maven-проекта
// появляется папка test
// все что находится в этой папке в проект в продакшн не добавляется,
// эти тесты нужны только для проверки проекта
// Maven помогает разграничить тесты от бизнес логики

// тест должен находится в package с таким же названием
// как у package того файла/класса, методы которого проверяем

// называние методов всегда со слов test
// без return, не статический, возвращается void, без параметров
// пример:  public void testSum()

// жизненный цикл - test во вкладке Maven справа. Запуск всех тестов
// clean почистит данные в папке target. Важно делать clean всегда до test


public class Lesson11_UnitTests {

    // юнит тест без какого либо фреймворка
    public void testSum() {
        // if (Lesson11_1.getSum(1, 1) != 2) {
        //  }

        assert Lesson11.getSum(1, 1) == 2;
        assert (Lesson11.getSum(0, 0) == 0);
        assert Lesson11.getSum(-10, -5) == -15;
        assert Lesson11.getSum(-10, 5) == -5;
    }
}
