package homework10;

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
    }
}
