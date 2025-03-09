package homework08;

//Задача №1
//Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.
//Создать класс MonthUtils который бы хранил подготовленные месяцы или
// их массивы для использования (объекты класса Month).

//Задача №2
//Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
// Класс должен иметь метод - getSalary(Month[] monthArray),
// метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.

//Задача №3
//Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день и количество подчиненных. Класс должен иметь метод - getSalary(Month[] monthArray), метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
//К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.

import static homework08.MonthUtils.february;
import static homework08.MonthUtils.january;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.age = 18;
        employee1.name = "Vasiliy";
        employee1.salaryInDay = 1800.00;
        employee1.sex = 'm';

        System.out.println(employee1.getSalary(new Month[]{january, february}));

        Manager manager1 = new Manager();
        manager1.age = 18;
        manager1.name = "Vasiliy";
        manager1.salaryInDay = 1800.00;
        manager1.sex = 'm';
        manager1.numberOfSubordinates = 4;

        System.out.println(manager1.getSalary(new Month[]{january, february}));
    }
}
