package homework10;

public class Employee {
    private String name;
    private int age;
    private char sex;
    private double salaryInDay;

    public Employee(String name, double salaryInDay) {
        this.name = name;
        this.salaryInDay = salaryInDay;
    }

    public char getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalaryInDay() {
        return salaryInDay;
    }

    public double getSalary(Month[] monthArray) {
        double baseSalary = 0.0;
        for (Month month : monthArray) {
            baseSalary = baseSalary + (salaryInDay * month.getNumberOfWorkDays());
        }
        return baseSalary;
    }

    public String printSalary(Month[] monthArray) {
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
