package homework10;

public class Director extends Manager {

    public Director(String name, double salaryInDay, int numberOfSubordinates) {
        super(name, salaryInDay, numberOfSubordinates);
    }

    @Override
    public double getSalary(Month[] monthArray) {
        double baseSalary = 0.0;
        for (Month month : monthArray) {
            baseSalary = baseSalary + (getSalaryInDay() * month.getNumberOfWorkDays());
        }
        return baseSalary + baseSalary * 0.03 * getNumberOfSubordinates();
    }

    @Override
    public String printSalary(Month[] monthArray) {
        String whichMonths = "";
        for (int i = 0; i < monthArray.length; i++) {
            whichMonths += monthArray[i].getMonthName() + " ";
        }
        return "For " + whichMonths + "salary of director " + this.getName() + " " + getSalary(monthArray);
    }
}
