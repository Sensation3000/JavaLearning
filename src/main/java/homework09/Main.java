package homework09;

public class Main {

//    Это задание — развитие Tasks#8. Можно изменить существующий код, можно писать новый.
//
//    Задача №1
//    Создать неизменяемый (immutable) класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.
//    Поля должны быть спрятаны, для каждого поля создать getter.
//    Создать класс MonthUtils который бы хранил подготовленные месяцы или их массивы для использования (объекты класса Month).
//
//    Задача №2
//    Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
//    Имя и ЗП должны быть обязательными, остальные поля — нет.
//    Создать необходимые конструкторы и / или setter-ы (по собственному разумению), чтобы было удобно создавать эти объекты.
//    Класс должен иметь метод - getSalary(Month[] monthArray),
//    метод возвращает зарплату за те месяцы
//    которые были переданы в качестве аргумента.
//
//    Задача №3
//    Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день и количество подчиненных.
//    Поля должны быть спрятаны, для каждого поля создать getter.
//    Класс должен иметь метод - getSalary(Month[] monthArray),
//    метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
//    К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.
//    В классе Employee создать метод convertToManager(int numberOfSubordinates).
//    Этот метод создаст и вернет объект типа Manager с теми же личными данными, что были у Employee, и запишет переданное в него количество подчиненных.


    public static void main(String[] args) {
        Employee employee1 = new Employee("Sergey", 2400);
        System.out.println(employee1.printEmployeeSalary(new Month[]{MonthUtils.january, MonthUtils.february}));

        Manager manager1 = new Manager("Alexey", 3000, 4);
        System.out.println(manager1.printManagerSalary(new Month[]{MonthUtils.january, MonthUtils.february}));

        Manager manager2 = employee1.convertToManager(2);
        System.out.println(manager2.printManagerSalary(new Month[]{MonthUtils.january, MonthUtils.february}));
    }
}
