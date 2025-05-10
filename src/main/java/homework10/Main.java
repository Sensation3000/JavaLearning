package homework10;

/*
Это задание — развитие Tasks#8 и Tasks#9. Можно изменить существующий код, можно писать новый.

Задача №1
Необходимо создать иерархию классов.

Класс Employee должен иметь поля: имя, возраст, пол и ЗП в день.
Имя и ЗП должны быть обязательными, остальные поля — нет.
Класс должен иметь метод - getSalary(Month[] monthArray),
метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.

Класс Manager должен иметь все то, что имеет Employee, и вдобавок, хранить число подчиненных.
Метод getSalary(Month[] monthArray) должен учитывать количество подчиненных, и давать надбавку к зарплате в 1% за каждого подчиненного.

Класс Director должен вести себя как Manager, но давать надбавку к зарплате в 3% за каждого подчиненного.

Задача №2

Создать класс SalaryUtils, и в нем написать метод getTotalSalary(Employee[] employees),
который подсчитает общую сумму к выплате на всех сотрудников — простых работников, менеджеров и директоров.
*/

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Sergey", 2400);
        System.out.println(employee1.printSalary(new Month[]{MonthUtils.january, MonthUtils.february}));

        Manager manager1 = new Manager("Alexey", 3000, 4);
        System.out.println(manager1.printSalary(new Month[]{MonthUtils.january, MonthUtils.february}));

        Manager manager2 = employee1.convertToManager(2);
        System.out.println(manager2.printSalary(new Month[]{MonthUtils.january, MonthUtils.february}));

        Director director1 = new Director("Michael", 2400, 2);
        System.out.println(director1.printSalary(new Month[]{MonthUtils.january, MonthUtils.february}));

        Employee [] employees = new Employee[] {employee1, manager1, manager2, director1};
        Month[] summerMonths = new Month[] {MonthUtils.june, MonthUtils.july, MonthUtils.august};
        System.out.println(SalaryUtils.getTotalSalary(employees, summerMonths));

    }
}
