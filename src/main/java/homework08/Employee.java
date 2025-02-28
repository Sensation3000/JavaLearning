package homework08;

public class Employee {

    String name;
    int age;
    char sex;
    double salaryInDay;

    public double getSalary(Month[] monthArray){
        double salary = 0.0;
        for (Month month : monthArray) {
            salary = salary + (salaryInDay * month.numberOfWorkDays);
        }
        return salary;
    }
}
