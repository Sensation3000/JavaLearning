package homework08;

public class Manager {
    String name;
    int age;
    char sex;
    double salaryInDay;
    int numberOfSubordinates;

    public double getSalary(Month[] monthArray){
        double salary = 0.0;
        for (int i = 0; i < monthArray.length; i++) {
            salary = salary + (salaryInDay * monthArray[i].numberOfWorkDays);
        }
        return salary + (salary * 0.01 * numberOfSubordinates);
    }
}
