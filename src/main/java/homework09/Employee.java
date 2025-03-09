package homework09;

public class Employee {
    private String name;
    private int age;
    private char sex;
    private double salaryInDay;

    public Employee(String name, double salaryInDay) {
        this.name = name;
        this.salaryInDay = salaryInDay;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public double getSalary(Month[] monthArray) {
        double salary = 0.0;
        for (Month month : monthArray) {
            salary = salary + (salaryInDay * month.getNumberOfWorkDays());
        }
        return salary;
    }

    public String printEmployeeSalary(Month[] monthArray) {
        String whichMonths = "";
        for (Month month : monthArray) {
            whichMonths += month.getMonthName() + " ";
        }
        return "For " + whichMonths + "salary of employee " + name + " " + getSalary(monthArray);
    }

    public Manager convertToManager(int numberOfSubordinates) {
        return new Manager(this.name, this.salaryInDay, numberOfSubordinates);
    }
}
