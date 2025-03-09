package lesson11;
// нужно подключить зависимость TestNG, для этого надо ее указать в pom.xml в разделе <dependencies>
// ищем TestNG в https://mvnrepository.com/

// TestNG - это фреймворк, который помогает нам запускать тесты
// Теперь запуская тесты через Maven, у нас запускается TestNG,
// он удобен и позволяет нам видеть ошибки в тестах

// появились кнопки запуска теста слева
// указываем аннотацию @Test
// добавляем Assert

import org.testng.Assert;
import org.testng.annotations.Test;

public class Lesson11_UnitTestsWithTestNG {

    @Test
    public void testSum() {
        Assert.assertEquals(Lesson11.getSum(1, 1), 2);
        Assert.assertEquals(Lesson11.getSum(0, 0), 0);
        Assert.assertEquals(Lesson11.getSum(-10, -5), -15);
        Assert.assertEquals(Lesson11.getSum(-10, 5), -5);
    }
}
