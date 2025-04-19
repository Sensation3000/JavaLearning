package jenkins.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.*;

import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class FilterForTests implements IMethodInterceptor {

    // метод сравнивает список измененных классов со списком тестов и запускает
    // только те тесты, которые находятся в изммененных классах

    @Override
    public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {

        String files = System.getenv("LIST_OF_CHANGED_FILES");
        //запрашиваем переменную со списком измененных файлов

        if (files != null) {
            // если она присутствует, то в ней через точку с запятой хранится список измененных файлов
            // берем все тесты, которые пришли и проверяем в каких файлах они хранятся
            // фильтруем и оставляем только те тесты, которые в измененных классах

            Set<String> fileSet = new HashSet<>(Arrays.asList(files.split(";")));
            Map<Class<?>, String> classMap = methods.stream()
                    .map(IMethodInstance::getMethod).map(ITestNGMethod::getTestClass).map(IClass::getRealClass)
                    .collect(Collectors.toMap(
                            Function.identity(),
                            clazz -> String.format("src/test/java/%s.java", clazz.getName().replace('.', '/')),
                            (pathA, pathB) -> pathA
                    ));

            if (classMap.values().containsAll(fileSet)) {
                return methods.stream().filter(method -> fileSet.contains(classMap.get(method.getMethod().getTestClass().getRealClass()))).collect(Collectors.toList());
            }
        }

        //если не присутствует то, ничего не делаем, просто возвращаем метод такой какой получил
        return methods;
    }
}


/*
 в ci.yml добавлена переменная
- name: Get list of changed files
run: echo "LIST_OF_CHANGED_FILES=$(git diff --name-only origin/$GITHUB_HEAD_REF $(git merge-base origin/$GITHUB_HEAD_REF origin/main) | tr '\n' ';')" >> $GITHUB_ENV

команда, которая берет разницу между веткой, которая пытается влиться и мейном,
получам измененные файлы и записываем их в список, разделенных точкой с запятой
*/
