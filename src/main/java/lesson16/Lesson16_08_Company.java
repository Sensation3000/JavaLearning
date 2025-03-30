package lesson16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lesson16_08_Company {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Dmitrii", "Atlanta"),
                new Employee("Masha", "Russia"),
                new Employee("Peter", "Boston"),
                new Employee("John", "Boston"),
                new Employee("Paul", "SF")
        );

        Map<String, List<Employee>> byOffice = new HashMap<>();
        // создаем пустую коллекцию сотрудников, кто работает в каждом из офисов
        //в данном случае String - это название офиса

        for (Employee employee : employees) {
            List<Employee> inOffice = byOffice.getOrDefault(employee.office, new ArrayList<>());
            //для каждого сотрудника смотрим есть ли уже офис такой, открыт ли список для сотрудников этого офиса?
            //если его нет, то это будет новый список сотрудников
            //метод getOrDefault() - возвращает значение соответствующее ключу,
            //а если нет записи с таким ключом, верни новое значение
            inOffice.add(employee);
            // добавляем сотрудника
            byOffice.put(employee.office, inOffice);
            // кладем в нашу коллецию по ключу и значению
        }
        System.out.println(byOffice);
    }
}

class Employee {
    final String name;
    final String office;

    Employee(String name, String office) {
        this.name = name;
        this.office = office;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\''
                + "}";
    }
}

