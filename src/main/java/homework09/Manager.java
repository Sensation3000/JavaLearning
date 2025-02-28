package homework09;

import homework09.Month;

public class Manager {
    private String name;
    private int age;
    private char sex;
    private double salaryInDay;
    private int numberOfSubordinates;

    public Manager (String name, double salaryInDay, int numberOfSubordinates) {
        this.name = name;
        this.salaryInDay = salaryInDay;
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public double getSalaryInDay() {
        return salaryInDay;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public double getSalary(Month[] monthArray){
        double salary = 0.0;
        for (Month month : monthArray)  {
            salary = salary + (salaryInDay * month.getNumberOfWorkDays());
        }
        return salary + salary * 0.01 * numberOfSubordinates;
    }

    public String printManagerSalary(Month[] monthArray){
        String whichMonths = "";
        for (int i = 0; i < monthArray.length; i++) {
            whichMonths += monthArray[i].getMonthName() + " ";
        }
        return "For " + whichMonths + "salary of manager " + name + " " + getSalary(monthArray);
    }
}
